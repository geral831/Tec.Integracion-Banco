//
// Este archivo ha sido generado por la arquitectura JavaTM para la implantación de la referencia de enlace (JAXB) XML v2.2.7 
// Visite <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Todas las modificaciones realizadas en este archivo se perderán si se vuelve a compilar el esquema de origen. 
// Generado el: 2020.04.02 a las 10:10:34 PM CST 
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
 *         &lt;element name="reembolso_realizado" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
    "reembolsoRealizado"
})
@XmlRootElement(name = "ReembolsoResponse")
public class ReembolsoResponse {

    @XmlElement(name = "reembolso_realizado", required = true)
    protected Object reembolsoRealizado;

    /**
     * Obtiene el valor de la propiedad reembolsoRealizado.
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getReembolsoRealizado() {
        return reembolsoRealizado;
    }

    /**
     * Define el valor de la propiedad reembolsoRealizado.
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setReembolsoRealizado(Object value) {
        this.reembolsoRealizado = value;
    }

}
