package controlador.caballero;

import java.io.IOException;
import java.sql.Date;
import java.time.LocalDate;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import modelo.caballero.Caballero;
import modelo.caballero.CaballeroModelo;

/**
 * Servlet implementation class Luchar
 */
@WebServlet("/Luchar")
public class Luchar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Luchar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		int id_pj1 = Integer.parseInt(request.getParameter("pj1"));
		int id_pj2 = Integer.parseInt(request.getParameter("pj2"));
		CaballeroModelo modelo_cab = new CaballeroModelo();
		Caballero pj1 = modelo_cab.getCaballeroById(id_pj1);
		Caballero pj2 = modelo_cab.getCaballeroById(id_pj2);
		
		
		
		if (id_pj1>id_pj2) {
			Caballero caballero = modelo_cab.getCaballeroById(id_pj1);
			//modelo_cab.insertGanador(id_pj1,id_pj2,id_pj1,Date.valueOf(LocalDate.now()));
			request.setAttribute("ganador", caballero);
			request.getRequestDispatcher("front/luchar.jsp").forward(request, response);
		}else {
			Caballero caballero = modelo_cab.getCaballeroById(id_pj2);
			//modelo_cab.insertGanador(id_pj1,id_pj2,id_pj2,Date.valueOf(LocalDate.now()));
			request.setAttribute("ganador", caballero);
			request.getRequestDispatcher("front/luchar.jsp").forward(request, response);
		}
	}

}
