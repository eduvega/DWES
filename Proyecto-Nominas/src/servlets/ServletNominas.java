package servlets;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletNominas
 */
@WebServlet("/ServletNominas")
public class ServletNominas extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletNominas() {
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
		// TODO Auto-generated method stub
		
		String action = request.getParameter("action");
		System.out.println(action);
		
		switch(action) {
		case "1":
			request.getRequestDispatcher("/infoEmpleados").forward(request, response);
			break;
		case"2":
			request.setAttribute("error", ""); //espera una variable error, pero de momento se la pasamos vacia
			request.getRequestDispatcher("/vista/busquedaEmpleado.jsp").forward(request, response);
			break;
			
		default:
			break;
		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
