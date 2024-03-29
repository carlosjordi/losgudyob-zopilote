
package pe.edu.idat.web.persistence.soap.service;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlType;

/**
 * <p>
 * Clase Java para servicioUpdateModelRequest complex type.
 * 
 * <p>
 * El siguiente fragmento de esquema especifica el contenido que se espera que
 * haya en esta clase.
 * 
 * <pre>
 * &lt;complexType name="servicioUpdateModelRequest"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="id" type="{http://www.w3.org/2001/XMLSchema}int" minOccurs="0"/&gt;
 *         &lt;element name="tipo" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="descripcion" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/&gt;
 *         &lt;element name="precio" type="{http://www.w3.org/2001/XMLSchema}double" minOccurs="0"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "servicioUpdateModelRequest", propOrder = { "id", "tipo", "descripcion", "precio" })
public class ServicioUpdateModelRequest {

	protected Integer id;
	protected String tipo;
	protected String descripcion;
	protected Double precio;

	/**
	 * Obtiene el valor de la propiedad id.
	 * 
	 * @return possible object is {@link Integer }
	 * 
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * Define el valor de la propiedad id.
	 * 
	 * @param value allowed object is {@link Integer }
	 * 
	 */
	public void setId(Integer value) {
		this.id = value;
	}

	/**
	 * Obtiene el valor de la propiedad tipo.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getTipo() {
		return tipo;
	}

	/**
	 * Define el valor de la propiedad tipo.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setTipo(String value) {
		this.tipo = value;
	}

	/**
	 * Obtiene el valor de la propiedad descripcion.
	 * 
	 * @return possible object is {@link String }
	 * 
	 */
	public String getDescripcion() {
		return descripcion;
	}

	/**
	 * Define el valor de la propiedad descripcion.
	 * 
	 * @param value allowed object is {@link String }
	 * 
	 */
	public void setDescripcion(String value) {
		this.descripcion = value;
	}

	/**
	 * Obtiene el valor de la propiedad precio.
	 * 
	 * @return possible object is {@link Double }
	 * 
	 */
	public Double getPrecio() {
		return precio;
	}

	/**
	 * Define el valor de la propiedad precio.
	 * 
	 * @param value allowed object is {@link Double }
	 * 
	 */
	public void setPrecio(Double value) {
		this.precio = value;
	}

}
