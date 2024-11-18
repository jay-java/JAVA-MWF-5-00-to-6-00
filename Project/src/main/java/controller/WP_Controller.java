package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import dao.WeddingPlannerDao;
import model.WeddingPlanner;

/**
 * Servlet implementation class WP_Controller
 */
@WebServlet("/WP_Controller")
public class WP_Controller extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public WP_Controller() {
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
		if (action.equalsIgnoreCase("register")) {
			WeddingPlanner u = new WeddingPlanner();
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			System.out.println(u);
			String email = request.getParameter("email");
			boolean flag = WeddingPlannerDao.checkEmail(email);
			if (flag == false) {
				WeddingPlannerDao.insertUser(u);
				response.sendRedirect("w-login.jsp");
			} else {
				request.setAttribute("msg", "account already registered");
				request.getRequestDispatcher("w-register.jsp").forward(request, response);
			}
		} else if (action.equalsIgnoreCase("login")) {
			WeddingPlanner u = new WeddingPlanner();
			u.setEmail(request.getParameter("email"));
			u.setPassword(request.getParameter("password"));
			String email = request.getParameter("email");
			boolean flag = WeddingPlannerDao.checkEmail(email);
			if (flag == true) {
				WeddingPlanner u1 = WeddingPlannerDao.loginUser(u);
				System.out.println(u1);
				if (u1 != null) {
					HttpSession session = request.getSession();
					session.setAttribute("data", u1);
					request.getRequestDispatcher("w-home.jsp").forward(request, response);
				}
				else {
					request.setAttribute("msg", "Password is incorrect");
					request.getRequestDispatcher("w-login.jsp").forward(request, response);
				}
			} else {
				request.setAttribute("msg", "Account not registered");
				request.getRequestDispatcher("w-login.jsp").forward(request, response);
			}
		}
		else if(action.equalsIgnoreCase("update")) {
			WeddingPlanner u = new WeddingPlanner();
			u.setId(Integer.parseInt(request.getParameter("id")));
			u.setName(request.getParameter("name"));
			u.setContact(Long.parseLong(request.getParameter("contact")));
			u.setAddress(request.getParameter("address"));
			u.setEmail(request.getParameter("email"));
			WeddingPlannerDao.updateUser(u);
			HttpSession session = request.getSession();
			session.setAttribute("data", u);
			request.getRequestDispatcher("w-home.jsp").forward(request, response);
		}
	}

}
