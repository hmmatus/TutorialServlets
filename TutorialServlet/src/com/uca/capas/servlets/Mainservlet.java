package com.uca.capas.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/*La anotacion WebServlet establece el nombre del mapping Ppara acceder al servlet, este tiene mas prioridad que cuando lo establecemos en xml*/
@WebServlet("/Mainservlet")
public class Mainservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Mainservlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//response.getWriter().append("Served at: ").append(request.getContextPath());
		String dep = request.getParameter("dep");
		double money = Double.parseDouble(request.getParameter("dinero"));
		int nlab = Integer.parseInt(request.getParameter("nLabos"));

		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<body>");
		out.println("<h3>" + "suma total de laboratorio" + dep + "fue: $" + money * nlab + "</h3>");
		out.println("</body>");
		out.println("</html>");
	}

}	
