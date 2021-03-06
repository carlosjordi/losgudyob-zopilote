package pe.proyecto.losgudyob.view.endpoint;

import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebResult;
import javax.jws.WebService;

import pe.proyecto.losgudyob.view.model.ClienteRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ClienteUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.EliminarModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelRequest;
import pe.proyecto.losgudyob.view.model.ServicioUpdateModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudAsignarTecnicoModelResponse;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelRequest;
import pe.proyecto.losgudyob.view.model.SolicitudRegistroModelResponse;
import pe.proyecto.losgudyob.view.model.listarClientesModelResponse;

@WebService(serviceName = "LosGudYobEndpoint")
public interface LosGudYobEndpoint {

	@WebMethod()
	@WebResult(name = "ClienteRegistroModelResponse")
	public ClienteRegistroModelResponse insertClient(ClienteRegistroModelRequest request);

	@WebMethod()
	@WebResult(name = "ClienteUpdateModelResponse")
	public ClienteUpdateModelResponse updateClient(ClienteUpdateModelRequest request);

	@WebMethod()
	@WebResult(name = "ClienteUpdateModelResponse")
	public ClienteUpdateModelResponse eliminarClient(EliminarModelRequest request);
	
	@WebMethod()
	@WebResult(name = "listarClientesModelResponse")
	public List<listarClientesModelResponse> listAllClients();


	@WebMethod()
	@WebResult(name = "ServicioRegistroModelResponse")
	public ServicioRegistroModelResponse insertService(ServicioRegistroModelRequest request);

	@WebMethod()
	@WebResult(name = "ServicioUpdateModelResponse")
	public ServicioUpdateModelResponse updateService(ServicioUpdateModelRequest request);

	@WebMethod()
	@WebResult(name = "SolicitudRegistroModelResponse")
	public SolicitudRegistroModelResponse insertSolicitud(SolicitudRegistroModelRequest request);

	@WebMethod()
	@WebResult(name = "ClienteUpdateModelResponse")
	public ClienteUpdateModelResponse eliminarSolicitud(EliminarModelRequest request);

	@WebMethod()
	@WebResult(name = "SolicitudAsignarTecnicoModelResponse")
	public SolicitudAsignarTecnicoModelResponse asignarTecnico(SolicitudAsignarTecnicoModelRequest request);
}
