package controlador.caballero;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.caballero.CaballeroModelo;

/**
 * Servlet implementation class EliminarCaballeros
 */
@WebServlet("/EliminarCaballeros")
public class EliminarCaballeros extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public EliminarCaballeros() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String caballerosIDSForm = request.getParameter("ids");
		caballerosIDSForm = caballerosIDSForm.replaceAll(",", ":");
		String[] ides = caballerosIDSForm.split(":");
		Boolean ids_existen = false;
		ArrayList<Integer> ides_elimi = new ArrayList<Integer>();
		CaballeroModelo model_cab = new CaballeroModelo();
		
		for (int i = 0; i < ides.length; i++) {
			ides_elimi.add(Integer.parseInt(ides[i]));
		}
		
		if (ids_existen = model_cab.existeCaballeros(ides_elimi)) {
			
		} else {
			for (int i = 0; i < ides_elimi.size(); i++) {
				model_cab.borrarCaballero(ides_elimi.get(i));
			}
		}
		System.out.println(ides_elimi);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
