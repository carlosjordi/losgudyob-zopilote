package pe.edu.idat.web.view;

import java.io.IOException;

import javax.inject.Inject;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import pe.edu.idat.web.persistence.soap.service.ClienteRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.ClienteRegistroModelResponse;
import pe.edu.idat.web.persistence.soap.service.ClienteUpdateModelRequest;
import pe.edu.idat.web.persistence.soap.service.ClienteUpdateModelResponse;
import pe.edu.idat.web.persistence.soap.service.EliminarClientResponse;
import pe.edu.idat.web.persistence.soap.service.EliminarModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudRegistroModelRequest;
import pe.edu.idat.web.persistence.soap.service.SolicitudRegistroModelResponse;
import pe.edu.idat.web.transactional.impl.Cliente;

@WebServlet(urlPatterns = "/Cliente", loadOnStartup = 1)
public class ClienteServlet extends HttpServlet {

	@Inject
	private Cliente c;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		req.getRequestDispatcher("/Cliente/agregarCliente.jsp").forward(req, resp);
		req.getRequestDispatcher("/Cliente/modificarCliente.jsp").forward(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

		String mensaje = req.getParameter("metodo");

		if (mensaje.equalsIgnoreCase("registrarCliente")) {

			// variables
			String nombre = req.getParameter("ACnombre");
			String paterno = req.getParameter("ACpaterno");
			String materno = req.getParameter("ACmaterno");
			String dni = req.getParameter("ACdni");
			String celular = req.getParameter("ACcelular");
			String correo = req.getParameter("ACcorreo");
			String fechaNacimiento = req.getParameter("ACfechaNacimiento");
			String clave = req.getParameter("ACpass");

			// logica
			ClienteRegistroModelRequest Crequest = new ClienteRegistroModelRequest();

			Crequest.setNombre(nombre);
			Crequest.setApellidoPaterno(paterno);
			Crequest.setApellidoMaterno(materno);
			Crequest.setDni(dni);
			Crequest.setCelular(celular);
			Crequest.setCorreo(correo);
			Crequest.setFechaNacimiento(fechaNacimiento);
			Crequest.setClave(clave);

			ClienteRegistroModelResponse Cresponse = c.clienteregistro(Crequest);

			// -- Respuesta
			req.setAttribute("mensajeRespuesta", Cresponse.getRespuesta());
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

		}

		if (mensaje.equalsIgnoreCase("modificarCliente")) {

			Integer id = Integer.valueOf(req.getParameter("MCid"));
			String correo = req.getParameter("MCcorreo");
			String celular = req.getParameter("MCcelular");
			String clave = req.getParameter("MCclave");

			ClienteUpdateModelRequest Crequest = new ClienteUpdateModelRequest();

			Crequest.setId(id);
			Crequest.setCorreo(correo);
			Crequest.setCelular(celular);
			Crequest.setClave(clave);

			ClienteUpdateModelResponse Cresponse = c.clienteupdate(Crequest);
			req.setAttribute("mensajeRespuesta", Cresponse.getRespuesta());
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

		}

		if (mensaje.equalsIgnoreCase("solicitudRegistro")) {

			Integer id_cliente = Integer.valueOf(req.getParameter("SRidcliente"));
			Integer id_servicio = Integer.valueOf(req.getParameter("SRidservicio"));
			Integer id_distrito = Integer.valueOf(req.getParameter("SRiddistrito"));
			String direccion = req.getParameter("SRdireccion");

			SolicitudRegistroModelRequest Srequest = new SolicitudRegistroModelRequest();

			Srequest.setIdCliente(id_cliente);
			Srequest.setIdServicio(id_servicio);
			Srequest.setIdDistrito(id_distrito);
			Srequest.setDireccion(direccion);

			SolicitudRegistroModelResponse Sresponse = c.insertSolicitud(Srequest);

			req.setAttribute("mensajeRespuesta", Sresponse.getRespuesta());
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

		}
		if (mensaje.equalsIgnoreCase("solicitudEliminar")) { // FF

			Integer id = Integer.valueOf(req.getParameter(""));

			EliminarModelRequest Crequest = new EliminarModelRequest();

			Crequest.setId(id);
			Crequest.setEstado(2);

			ClienteUpdateModelResponse Cresponse = c.eliminarSolicitud(Crequest);

			req.setAttribute("mensajeRespuesta", Cresponse.getRespuesta());
			getServletContext().getRequestDispatcher("/index.jsp").forward(req, resp);

		}
	}

}
