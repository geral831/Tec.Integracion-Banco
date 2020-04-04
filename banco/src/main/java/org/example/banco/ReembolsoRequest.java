//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.03 a las 07:02:10 PM CST 
//


package org.example.banco;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Clase Java para anonymous complex type.
 * 
 * <p>El siguiente fragmento de esquema especifica el contenido que se espera que haya en esta clase.
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="num_tarjeta" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="pago_por_reservacion" type="{http://www.w3.org/2001/XMLSchema}int"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "", propOrder = {
    "numTarjeta",
    "pagoPorReservacion"
})
@XmlRootElement(name = "ReembolsoRequest")
public class ReembolsoRequest {

    @XmlElement(name = "num_tarjeta", required = true)
    protected String numTarjeta;
    @XmlElement(name = "pago_por_reservacion")
    protected int pagoPorReservacion;

    /**
     * Obtiene el valor de la propiedad numTarjeta.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumTarjeta() {
        return numTarjeta;
    }

    /**
     * Define el valor de la propiedad numTarjeta.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumTarjeta(String value) {
        this.numTarjeta = value;
    }

    /**
     * Obtiene el valor de la propiedad pagoPorReservacion.
     * 
     */
    public int getPagoPorReservacion() {
        return pagoPorReservacion;
    }

    /**
     * Define el valor de la propiedad pagoPorReservacion.
     * 
     */
    public void setPagoPorReservacion(int value) {
        this.pagoPorReservacion = value;
    }

}
