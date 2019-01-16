package clienteweb;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(urlPatterns = { "/cliente", "/clienteServlet", "/clienteController" })
public class ClienteServlet extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		System.out.println("Esta chamada veio pelo método GET");
	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// System.out.println("Esta chamada veio pelo método POST");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Esta chamada veio pelo método POST!");

	}

	@Override
	protected void doDelete(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		// System.out.println("Esta chamada veio pelo método DELETE");
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Esta chamada DELETE vai aparecer no servlet");
	}

	@Override
	protected void doPut(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		//System.out.println("Esta chamada veio pelo método PUT");	
		resp.setCharacterEncoding("UTF-8");
		resp.getWriter().print("Esta chamada PUT vai aparecer no servlet");
	
	}

}
