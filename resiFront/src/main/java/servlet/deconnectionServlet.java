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





@WebServlet("/deconnection")
public class deconnectionServlet extends HttpServlet {
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {	
		request.getSession().setAttribute("isConnectClient", null);
		request.getSession().setAttribute("compte", null);
		request.getSession().setAttribute("success", null);
		request.getSession().setAttribute("error", null);
		this.getServletContext().getRequestDispatcher("/WEB-INF/pages/deconnection.jsp").forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}	
}
