package fr_doranco_tvm.fitness.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr_doranco_tvm.fitness.business.Abonne;
import fr_doranco_tvm.fitness.business.Tapis;
import fr_doranco_tvm.fitness.service.AbonneService;
import fr_doranco_tvm.fitness.service.CourseService;
import fr_doranco_tvm.fitness.service.TapisService;
import fr_doranco_tvm.fitness.service.impl.AbonneServiceImpl;
import fr_doranco_tvm.fitness.service.impl.CourseServiceImpl;
import fr_doranco_tvm.fitness.service.impl.TapisServiceImpl;

/**
 * Servlet implementation class IndexServlet
 */
@WebServlet(urlPatterns = { "/", "/index" })
public class IndexServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AbonneService abonneService = new AbonneServiceImpl();
	private TapisService tapisService = new TapisServiceImpl();
	private CourseService courseService = new CourseServiceImpl();
      
    /**
     * @see HttpServlet#HttpServlet()
     */
    public IndexServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		List<Abonne> abonnes = new ArrayList<>();
		abonnes = abonneService.trouverTousLesAbonnes();
        request.setAttribute("abonnes", abonnes);
        List<Tapis> tapis = new ArrayList<>();
        tapis = tapisService.trouverTousLesTapis();
        request.setAttribute("tapis", tapis);
		request.getRequestDispatcher("WEB-INF/index.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
