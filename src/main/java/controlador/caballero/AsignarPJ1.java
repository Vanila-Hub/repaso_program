package controlador.caballero;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.caballero.Caballero;
import modelo.caballero.CaballeroModelo;

/**
 * Servlet implementation class AsignarPJ1
 */
@WebServlet("/AsignarPJ1")
public class AsignarPJ1 extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public AsignarPJ1() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		CaballeroModelo modelo_caba = new CaballeroModelo();
		ArrayList<Caballero> caballeros = modelo_caba.getCaballeros();
		request.setAttribute("caballeros", caballeros);
		request.getRequestDispatcher("front/elegirP1.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	}

}
