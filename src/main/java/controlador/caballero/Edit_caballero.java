package controlador.caballero;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import controlador.formvalidador.FormValidador;
import modelo.arma.Arma;
import modelo.arma.ArmaModelo;
import modelo.caballero.Caballero;
import modelo.caballero.CaballeroModelo;
import modelo.escudo.Escudo;
import modelo.escudo.EscudoModelo;

/**
 * Servlet implementation class Edit_caballero
 */
@WebServlet("/Edit_caballero")
public class Edit_caballero extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Edit_caballero() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		int id_caballero = Integer.parseInt(request.getParameter("id_caballero"));
		CaballeroModelo modelo_caballero = new CaballeroModelo();
		ArmaModelo modelo_arma = new ArmaModelo();
		EscudoModelo modelo_escudo = new EscudoModelo();
		
		ArrayList<Escudo> escudos = modelo_escudo.getEscudos();
		ArrayList<Arma> armas = modelo_arma.getArmas();
		
		Caballero cab = modelo_caballero.getCaballeroById(id_caballero);
		
		request.setAttribute("escudos", escudos);
		request.setAttribute("armas", armas);
		request.setAttribute("caballero", cab);
		request.getRequestDispatcher("front/edit_caballero.jsp").forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Caballero caballero = new Caballero();
		CaballeroModelo modelo_caballero = new CaballeroModelo();
		FormValidador valitator = new FormValidador();
		
		caballero.setArma_id(Integer.parseInt(request.getParameter("arma")));
		caballero.setEscudo_id(Integer.parseInt(request.getParameter("escudo")));
		caballero.setExperiencia(Integer.parseInt(request.getParameter("experiencia")));
		caballero.setFuerza(Integer.parseInt(request.getParameter("fuerza")));
		caballero.setNombre(request.getParameter("nombre"));
		caballero.setFoto(request.getParameter("foto"));
		caballero.setId(Integer.parseInt(request.getParameter("id_caballero")));
		
		if (valitator.CaballeroValido(caballero, modelo_caballero)) {
			
			modelo_caballero.editarCaballero(caballero);
			response.sendRedirect("/Caballeros/VerCaballeros?msg=created");			
		} else {
			response.sendRedirect("/Caballeros/VerCaballeros?msg=no_valid_data");
		}
	}

}
