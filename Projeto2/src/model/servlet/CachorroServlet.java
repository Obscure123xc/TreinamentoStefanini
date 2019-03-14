package model.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.entities.Cachorro;

/**
 * Servlet implementation class CachorroServlet
 */
@WebServlet({ "/CachorroServlet", "/ListarCachorro" })
public class CachorroServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CachorroServlet() {
		super();
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());

		List<Cachorro> cachorro = new ArrayList<>();

		cachorro.add(new Cachorro("Pingo", 5));
		cachorro.add(new Cachorro("Shrek", 6));
		cachorro.add(new Cachorro("Apolo", 7));

		System.out.println("GET");
		PrintWriter p = response.getWriter();
		p.append(cachorro.toString());

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
