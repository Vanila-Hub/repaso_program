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
 * Servlet implementation class AsignarPJ2
 */
@WebServlet("/AsignarPJ2")
public class AsignarPJ2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AsignarPJ2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id_pj1 = Integer.parseInt(request.getParameter("id_pj1"));
		
		CaballeroModelo modelo_caba = new CaballeroModelo();
		ArrayList<Caballero> caballeros = modelo_caba.getCaballeros();
		request.setAttribute("caballeros", caballeros);
		request.setAttribute("pj1", id_pj1);
		request.getRequestDispatcher("front/elegirP2.jsp").forward(request, response);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
