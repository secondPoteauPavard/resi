package servlet;

import java.io.IOException;
import java.util.Date;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOCompte;
import dao.FactoryCompte;
import model.Compte;





@WebServlet("/parametres")
public class parametresServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		Compte c = (Compte) request.getSession().getAttribute("compte");
		if (c==null) {
			this.getServletContext().getRequestDispatcher("/deconnection").forward(request, response);
		}
		else {
			request.setAttribute("nom", c.getNom());
			request.setAttribute("prenom", c.getPrenom());
			request.setAttribute("email", c.getEmail());
			request.setAttribute("mdp", c.getMdp());
			request.setAttribute("tel", c.getTel());
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/parametres.jsp").forward(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOCompte daoC=FactoryCompte.getDAOCompte();
		Compte c = (Compte) request.getSession().getAttribute("compte");
		Integer id=c.getId();
		Date dateCreation = c.getDate();
		Compte cupdate = new Compte(id,request.getParameter("nom"), request.getParameter("prenom"),
				request.getParameter("email"), request.getParameter("mdp"), request.getParameter("tel"), dateCreation);
		request.getSession().setAttribute("compte", cupdate);
		try {
			daoC.update(cupdate);
		} catch(Exception e) {e.printStackTrace();}
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/success.jsp").forward(request, response);
	}

}
