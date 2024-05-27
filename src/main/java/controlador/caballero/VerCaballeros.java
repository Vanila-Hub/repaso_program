package controlador.caballero;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.arma.Arma;
import modelo.arma.ArmaModelo;
import modelo.caballero.Caballero;
import modelo.caballero.CaballeroModelo;
import modelo.escudo.Escudo;
import modelo.escudo.EscudoModelo;

/**
 * Servlet implementation class VerCaballeros
 */
@WebServlet("/VerCaballeros")
public class VerCaballeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public VerCaballeros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		CaballeroModelo modelo_caba = new CaballeroModelo();
		ArmaModelo modelo_arma = new ArmaModelo();
		EscudoModelo modelo_escudo = new EscudoModelo();
		String msg = request.getParameter("msg");
		
		
		ArrayList<Escudo> escudos = modelo_escudo.getEscudos();
		ArrayList<Arma> armas = modelo_arma.getArmas();
		ArrayList<Caballero> caballeros =  modelo_caba.getCaballeros();
		caballeros.sort(new ComparadorNombre());
		
		request.setAttribute("caballeros", caballeros);
		request.setAttribute("escudos", escudos);
		request.setAttribute("armas", armas);
		request.setAttribute("msg", msg);
		request.getRequestDispatcher("front/caballeros.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
