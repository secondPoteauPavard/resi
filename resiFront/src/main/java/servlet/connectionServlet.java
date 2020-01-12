package servlet;

import java.io.IOException;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.DAOCompte;
import dao.FactoryCompte;
import model.Compte;





@WebServlet("/connection")
public class connectionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/connection.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		DAOCompte daoC=FactoryCompte.getDAOCompte();
		Compte c;
		c=daoC.checkConnect(request.getParameter("inputEmail"), request.getParameter("inputPassword"));
		if(c==null) {
			request.setAttribute("error", "Login/Mot de passe invalides");
			this.getServletContext().getRequestDispatcher("/WEB-INF/pages/connection.jsp").forward(request, response);
		}
		else {
			request.getSession().setAttribute("isConnectClient", "Y");
			request.getSession().setAttribute("compte", c);
			request.getSession().setAttribute("success", "T'es connecté batard");
			this.getServletContext().getRequestDispatcher("/WEB-INF/index.jsp").forward(request, response);
		}
		
	}	
}
