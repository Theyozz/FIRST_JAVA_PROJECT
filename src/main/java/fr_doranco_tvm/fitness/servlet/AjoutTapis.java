package fr_doranco_tvm.fitness.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr_doranco_tvm.fitness.service.TapisService;
import fr_doranco_tvm.fitness.service.impl.TapisServiceImpl;

/**
 * Servlet implementation class AjoutTapis
 */
@WebServlet("/AjoutTapis")
public class AjoutTapis extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private TapisService tapisService = new TapisServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjoutTapis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		request.getRequestDispatcher("WEB-INF/AjouterTapis.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		tapisService.ajouterTapis(request.getParameter("NOM_TAPIS"));
		response.sendRedirect("index");
	}

}
