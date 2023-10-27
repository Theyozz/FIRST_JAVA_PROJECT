package fr_doranco_tvm.fitness.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import fr_doranco_tvm.fitness.business.Abonne;
import fr_doranco_tvm.fitness.service.AbonneService;
import fr_doranco_tvm.fitness.service.impl.AbonneServiceImpl;

/**
 * Servlet implementation class ModifierAbonne
 */
@WebServlet("/ModifierAbonne")
public class ModifierAbonne extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private AbonneService abonneService = new AbonneServiceImpl();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ModifierAbonne() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Abonne abonne = abonneService.trouverAbonnerParId(Long.parseLong(request.getParameter("id")));
        System.out.println(abonne);
        request.setAttribute("abonne", abonne);
		request.getRequestDispatcher("WEB-INF/ModifierAbonne.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
        Abonne abonne = new Abonne();
        abonne.setId(Long.parseLong(request.getParameter("id")));
        abonne.setPrenom(request.getParameter("PRENOM_ABONNE"));
        abonne.setNom(request.getParameter("NOM_ABONNE"));
        abonneService.updateAbonne(abonne);
        System.out.println(abonne + "DU POST");
        response.sendRedirect("index");
	}

}
