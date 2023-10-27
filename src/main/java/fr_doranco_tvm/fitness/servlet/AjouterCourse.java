package fr_doranco_tvm.fitness.servlet;

import java.io.IOException;
import java.time.LocalDateTime;
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
 * Servlet implementation class AjouterCourse
 */
@WebServlet("/AjouterCourse")
public class AjouterCourse extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private CourseService courseService = new CourseServiceImpl();
	private AbonneService abonneService = new AbonneServiceImpl();
	private TapisService tapisService = new TapisServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AjouterCourse() {
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
		request.getRequestDispatcher("WEB-INF/AjouterCourse.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		courseService.ajouterCourse(null, Integer.parseInt(request.getParameter("DISTANCE")), Integer.parseInt(request.getParameter("DUREE")),abonneService.trouverAbonnerParId(Long.parseLong(request.getParameter("ID_ABONNE"))),tapisService.trouverTapisParSonId(Long.parseLong(request.getParameter("ID_TAPIS"))));
		response.sendRedirect("index");
	}

}
