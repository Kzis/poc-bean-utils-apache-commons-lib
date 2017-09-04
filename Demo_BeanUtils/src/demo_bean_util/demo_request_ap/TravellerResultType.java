//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:10:55 PM ICT 
//


package demo_bean_util.demo_request_ap;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Generic traveller result type.
 * 
 * <p>Java class for TravellerResultType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="TravellerResultType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ParticipatingCountry" type="{http://sita.aero/iborders/APP/common/V1}countryCodeType" minOccurs="0"/>
 *         &lt;element name="TravellerInfo" type="{http://sita.aero/iborders/APP/common/V1}TravellerInfoType"/>
 *         &lt;element name="Identity" type="{http://sita.aero/iborders/APP/common/V1}IdentityType"/>
 *         &lt;element name="MessageCode" type="{http://sita.aero/iborders/APP/common/V1}codeType"/>
 *         &lt;element name="AdditionalInfo" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value=".{1,80}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="Error" type="{http://sita.aero/iborders/APP/common/V1}ErrorType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravellerResultType", namespace = "http://sita.aero/iborders/APP/APPService/V1", propOrder = {
    "participatingCountry",
    "travellerInfo",
    "identity",
    "messageCode",
    "additionalInfo",
    "error"
})
@XmlSeeAlso({
    NonTravellerResultType.class,
    CancelTravellerResultType.class,
    CheckInTravellerResultType.class
})
public class TravellerResultType {

    @XmlElement(name = "ParticipatingCountry")
    protected String participatingCountry;
    @XmlElement(name = "TravellerInfo", required = true)
    protected TravellerInfoType travellerInfo;
    @XmlElement(name = "Identity", required = true)
    protected IdentityType identity;
    @XmlElement(name = "MessageCode", required = true)
    protected String messageCode;
    @XmlElement(name = "AdditionalInfo")
    protected String additionalInfo;
    @XmlElement(name = "Error")
    protected List<ErrorType> error;

    /**
     * Gets the value of the participatingCountry property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getParticipatingCountry() {
        return participatingCountry;
    }

    /**
     * Sets the value of the participatingCountry property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setParticipatingCountry(String value) {
        this.participatingCountry = value;
    }

    /**
     * Gets the value of the travellerInfo property.
     * 
     * @return
     *     possible object is
     *     {@link TravellerInfoType }
     *     
     */
    public TravellerInfoType getTravellerInfo() {
        return travellerInfo;
    }

    /**
     * Sets the value of the travellerInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link TravellerInfoType }
     *     
     */
    public void setTravellerInfo(TravellerInfoType value) {
        this.travellerInfo = value;
    }

    /**
     * Gets the value of the identity property.
     * 
     * @return
     *     possible object is
     *     {@link IdentityType }
     *     
     */
    public IdentityType getIdentity() {
        return identity;
    }

    /**
     * Sets the value of the identity property.
     * 
     * @param value
     *     allowed object is
     *     {@link IdentityType }
     *     
     */
    public void setIdentity(IdentityType value) {
        this.identity = value;
    }

    /**
     * Gets the value of the messageCode property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageCode() {
        return messageCode;
    }

    /**
     * Sets the value of the messageCode property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageCode(String value) {
        this.messageCode = value;
    }

    /**
     * Gets the value of the additionalInfo property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdditionalInfo() {
        return additionalInfo;
    }

    /**
     * Sets the value of the additionalInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdditionalInfo(String value) {
        this.additionalInfo = value;
    }

    /**
     * Gets the value of the error property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the error property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getError().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ErrorType }
     * 
     * 
     */
    public List<ErrorType> getError() {
        if (error == null) {
            error = new ArrayList<ErrorType>();
        }
        return this.error;
    }

}