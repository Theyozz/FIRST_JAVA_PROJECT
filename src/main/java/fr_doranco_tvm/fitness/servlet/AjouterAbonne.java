package fr_doranco_tvm.fitness.servlet;

import java.io.IOException;
import java.time.LocalDateTime;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr_doranco_tvm.fitness.service.AbonneService;
import fr_doranco_tvm.fitness.service.impl.AbonneServiceImpl;

/**
 * Servlet implementation class AjouterAbonne
 */
@WebServlet("/AjouterAbonne")
public class AjouterAbonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AbonneService abonneService = new AbonneServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterAbonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/AjouterAbonne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		abonneService.ajouterAbonne(request.getParameter("PRENOM_ABONNE"), request.getParameter("NOM_ABONNE"));
		response.sendRedirect("index");
	}

}
