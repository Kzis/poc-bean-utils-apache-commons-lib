//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4-2 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2015.07.08 at 06:11:12 PM ICT 
//


package demo_bean_util.demo_request_ap;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for travellerTypeType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="travellerTypeType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}token">
 *     &lt;enumeration value="Passenger"/>
 *     &lt;enumeration value="OperatingCrew"/>
 *     &lt;enumeration value="PositioningCrew"/>
 *     &lt;enumeration value="FlightCrew"/>
 *     &lt;enumeration value="FlightAttendant"/>
 *     &lt;enumeration value="AirlineOperationsManagement"/>
 *     &lt;enumeration value="NonCrew"/>
 *     &lt;enumeration value="DeadheadCrew"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "travellerTypeType")
@XmlEnum
public enum TravellerTypeType {

    @XmlEnumValue("Passenger")
    PASSENGER("Passenger"),
    @XmlEnumValue("OperatingCrew")
    OPERATING_CREW("OperatingCrew"),
    @XmlEnumValue("PositioningCrew")
    POSITIONING_CREW("PositioningCrew"),
    @XmlEnumValue("FlightCrew")
    FLIGHT_CREW("FlightCrew"),
    @XmlEnumValue("FlightAttendant")
    FLIGHT_ATTENDANT("FlightAttendant"),
    @XmlEnumValue("AirlineOperationsManagement")
    AIRLINE_OPERATIONS_MANAGEMENT("AirlineOperationsManagement"),
    @XmlEnumValue("NonCrew")
    NON_CREW("NonCrew"),
    @XmlEnumValue("DeadheadCrew")
    DEADHEAD_CREW("DeadheadCrew");
    private final String value;

    TravellerTypeType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static TravellerTypeType fromValue(String v) {
        for (TravellerTypeType c: TravellerTypeType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}