package controlador.caballero;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formvalidador.FormValidador;
import modelo.caballero.Caballero;
import modelo.caballero.CaballeroModelo;

/**
 * Servlet implementation class CrearCaballero
 */
@WebServlet("/CrearCaballero")
public class CrearCaballero extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CrearCaballero() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		
	

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		Caballero caballero = new Caballero();
		String msg = null;
		CaballeroModelo modelo_caballero = new CaballeroModelo();
		FormValidador valitator = new FormValidador();
		
		caballero.setArma_id(Integer.parseInt(request.getParameter("arma")));
		caballero.setEscudo_id(Integer.parseInt(request.getParameter("escudo")));
		caballero.setExperiencia(Integer.parseInt(request.getParameter("experiencia")));
		caballero.setFuerza(Integer.parseInt(request.getParameter("fuerza")));
		caballero.setNombre(request.getParameter("nombre"));
		caballero.setFoto(request.getParameter("foto"));
		
		if (valitator.CaballeroValido(caballero, modelo_caballero)) {
			System.out.println("Soy Valido");
			modelo_caballero.crearCaballero(caballero);
			response.sendRedirect("/Caballeros/VerCaballeros?msg=created");			
		} else {
			response.sendRedirect("/Caballeros/VerCaballeros?msg=no_valid_data");
		}
	}

}
