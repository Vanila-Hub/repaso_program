package controlador.caballero;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.caballero.Caballero;
import modelo.caballero.CaballeroModelo;
import modelo.conector.Conector;

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
		ArrayList<Caballero> caballeros = modelo_cab.getCaballeros();
		Iterator<Caballero> it_cab = caballeros.iterator();
		
		while(it_cab.hasNext()) {
			Caballero cab = new Caballero();
			cab = it_cab.next();
			if (cab.getNombre().equalsIgnoreCase(searchRFequest)) {
				System.out.println(cab.getNombre());
			}
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
