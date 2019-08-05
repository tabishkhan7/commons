//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.8-b130911.1802 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2019.05.13 at 03:22:53 PM IST 
//


package io.mosip.kernel.core.cbeffutil.jaxbclasses;

import java.time.LocalDateTime;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>Java class for BIRInfoType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="BIRInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Creator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Index" type="{http://standards.iso.org/iso-iec/19785/-3/ed-2/}UUIDType" minOccurs="0"/>
 *         &lt;element name="Payload" type="{http://www.w3.org/2001/XMLSchema}base64Binary" minOccurs="0"/>
 *         &lt;element name="Integrity" type="{http://www.w3.org/2001/XMLSchema}boolean"/>
 *         &lt;element name="CreationDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotValidBefore" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *         &lt;element name="NotValidAfter" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BIRInfoType", propOrder = {
    "creator",
    "index",
    "payload",
    "integrity",
    "creationDate",
    "notValidBefore",
    "notValidAfter"
})
public class BIRInfoType {

    @XmlElement(name = "Creator")
    protected String creator;
    @XmlElement(name = "Index")
    protected String index;
    @XmlElement(name = "Payload")
    protected byte[] payload;
    @XmlElement(name = "Integrity")
    protected boolean integrity;
    @XmlElement(name = "CreationDate")
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime creationDate;
    @XmlElement(name = "NotValidBefore")
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime notValidBefore;
    @XmlElement(name = "NotValidAfter")
    @XmlSchemaType(name = "dateTime")
    protected LocalDateTime notValidAfter;

    /**
     * Gets the value of the creator property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreator() {
        return creator;
    }

    /**
     * Sets the value of the creator property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreator(String value) {
        this.creator = value;
    }

    /**
     * Gets the value of the index property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIndex() {
        return index;
    }

    /**
     * Sets the value of the index property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIndex(String value) {
        this.index = value;
    }

    /**
     * Gets the value of the payload property.
     * 
     * @return
     *     possible object is
     *     byte[]
     */
    public byte[] getPayload() {
        return payload;
    }

    /**
     * Sets the value of the payload property.
     * 
     * @param value
     *     allowed object is
     *     byte[]
     */
    public void setPayload(byte[] value) {
        this.payload = value;
    }

    /**
     * Gets the value of the integrity property.
     * 
     */
    public boolean isIntegrity() {
        return integrity;
    }

    /**
     * Sets the value of the integrity property.
     * 
     */
    public void setIntegrity(boolean value) {
        this.integrity = value;
    }

    /**
     * Gets the value of the creationDate property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LocalDateTime getCreationDate() {
        return creationDate;
    }

    /**
     * Sets the value of the creationDate property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreationDate(LocalDateTime value) {
        this.creationDate = value;
    }

    /**
     * Gets the value of the notValidBefore property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LocalDateTime getNotValidBefore() {
        return notValidBefore;
    }

    /**
     * Sets the value of the notValidBefore property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotValidBefore(LocalDateTime value) {
        this.notValidBefore = value;
    }

    /**
     * Gets the value of the notValidAfter property.
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public LocalDateTime getNotValidAfter() {
        return notValidAfter;
    }

    /**
     * Sets the value of the notValidAfter property.
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setNotValidAfter(LocalDateTime value) {
        this.notValidAfter = value;
    }

}
