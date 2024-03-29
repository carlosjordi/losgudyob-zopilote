
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para clienteRegistroModelRequest complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="clienteRegistroModelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="nombre" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoPaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="apellidoMaterno" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="dni" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="celular" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="correo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="fechaNacimiento" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="clave" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "clienteRegistroModelRequest", propOrder = { "nombre", "apellidoPaterno", "apellidoMaterno", "dni",
		"celular", "correo", "fechaNacimiento", "clave" })
public class ClienteRegistroModelRequest {

	protected String nombre;
	protected String apellidoPaterno;
	protected String apellidoMaterno;
	protected String dni;
	protected String celular;
	protected String correo;
	protected String fechaNacimiento;
	protected String clave;

	/**
	 * Obtiene el valor de la propiedad nombre.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getNombre() {
		return nombre;
	}

	/**
	 * Define el valor de la propiedad nombre.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setNombre(String value) {
		this.nombre = value;
	}

	/**
	 * Obtiene el valor de la propiedad apellidoPaterno.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApellidoPaterno() {
		return apellidoPaterno;
	}

	/**
	 * Define el valor de la propiedad apellidoPaterno.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setApellidoPaterno(String value) {
		this.apellidoPaterno = value;
	}

	/**
	 * Obtiene el valor de la propiedad apellidoMaterno.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getApellidoMaterno() {
		return apellidoMaterno;
	}

	/**
	 * Define el valor de la propiedad apellidoMaterno.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setApellidoMaterno(String value) {
		this.apellidoMaterno = value;
	}

	/**
	 * Obtiene el valor de la propiedad dni.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDni() {
		return dni;
	}

	/**
	 * Define el valor de la propiedad dni.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDni(String value) {
		this.dni = value;
	}

	/**
	 * Obtiene el valor de la propiedad celular.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCelular() {
		return celular;
	}

	/**
	 * Define el valor de la propiedad celular.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCelular(String value) {
		this.celular = value;
	}

	/**
	 * Obtiene el valor de la propiedad correo.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getCorreo() {
		return correo;
	}

	/**
	 * Define el valor de la propiedad correo.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setCorreo(String value) {
		this.correo = value;
	}

	/**
	 * Obtiene el valor de la propiedad fechaNacimiento.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getFechaNacimiento() {
		return fechaNacimiento;
	}

	/**
	 * Define el valor de la propiedad fechaNacimiento.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setFechaNacimiento(String value) {
		this.fechaNacimiento = value;
	}

	/**
	 * Obtiene el valor de la propiedad clave.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getClave() {
		return clave;
	}

	/**
	 * Define el valor de la propiedad clave.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setClave(String value) {
		this.clave = value;
	}

}
