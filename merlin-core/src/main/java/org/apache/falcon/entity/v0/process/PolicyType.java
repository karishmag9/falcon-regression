//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.28 at 10:55:57 AM PDT 
//


package org.apache.falcon.entity.v0.process;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for policy-type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="policy-type">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="periodic"/>
 *     &lt;enumeration value="exp-backoff"/>
 *     &lt;enumeration value="final"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "policy-type")
@XmlEnum
public enum PolicyType {

    @XmlEnumValue("periodic")
    PERIODIC("periodic"),
    @XmlEnumValue("exp-backoff")
    EXP_BACKOFF("exp-backoff"),
    @XmlEnumValue("final")
    FINAL("final");
    private final String value;

    PolicyType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PolicyType fromValue(String v) {
        for (PolicyType c: PolicyType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
