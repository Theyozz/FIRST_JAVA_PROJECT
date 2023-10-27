package fr_doranco_tvm.fitness.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr_doranco_tvm.fitness.service.AbonneService;
import fr_doranco_tvm.fitness.service.impl.AbonneServiceImpl;

/**
 * Servlet implementation class SupprimerAbonne
 */
@WebServlet("/SupprimerAbonne")
public class SupprimerAbonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AbonneService abonneService = new AbonneServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public SupprimerAbonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/SupprimerAbonne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		abonneService.supprimer(Long.parseLong(request.getParameter("id")));
        response.sendRedirect("index");
	}

}
