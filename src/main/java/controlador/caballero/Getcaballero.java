package controlador.caballero;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.arma.Arma;
import modelo.arma.ArmaModelo;
import modelo.caballero.Caballero;
import modelo.caballero.CaballeroModelo;
import modelo.conector.Conector;
import modelo.escudo.Escudo;
import modelo.escudo.EscudoModelo;

/**
 * Servlet implementation class Getcaballero
 */
@WebServlet("/Getcaballero")
public class Getcaballero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Getcaballero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String searchRFequest = request.getParameter("busqueda");
		CaballeroModelo modelo_cab = new CaballeroModelo();
		CaballeroModelo modelo_caba = new CaballeroModelo();
		ArmaModelo modelo_arma = new ArmaModelo();
		EscudoModelo modelo_escudo = new EscudoModelo();
		ArrayList<Caballero> caballeros = modelo_cab.getCaballeros();
		ArrayList<Escudo> escudos = modelo_escudo.getEscudos();
		ArrayList<Arma> armas = modelo_arma.getArmas();
		
		Iterator<Caballero> it_cab = caballeros.iterator();
		
		while(it_cab.hasNext()) {
			Caballero cab = new Caballero();
			cab = it_cab.next();
			if (cab.getNombre().contains(searchRFequest)) {
				
			}else {
				it_cab.remove();
			}
		}
		request.setAttribute("caballeros", caballeros);
		request.setAttribute("escudos", escudos);
		request.setAttribute("armas", armas);
		request.setAttribute("caballeros", caballeros);
		request.getRequestDispatcher("front/caballeros.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
