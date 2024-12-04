package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.PlanDao;
import model.Plans;

/**
 * Servlet implementation class PlanController
 */
@WebServlet("/PlanController")
public class PlanController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PlanController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String action = request.getParameter("action");
		if(action.equalsIgnoreCase("add plan")) {
			Plans p = new Plans();
			p.setWp_id(Integer.parseInt(request.getParameter("id")));
			p.setBudget(request.getParameter("budget"));
			p.setStyle(request.getParameter("style"));
			p.setNoofguest(Integer.parseInt(request.getParameter("noofguest")));
			p.setVanue(request.getParameter("vanue"));
			p.setPhotosvideos(request.getParameter("photosvideos"));
			p.setNoofguestfortransport(request.getParameter("noofguestfortransport"));
			PlanDao.addPlan(p);
			request.setAttribute("msg", "Plan added");
			request.getRequestDispatcher("w-add-plan.jsp").forward(request, response);
		}
	}

}
