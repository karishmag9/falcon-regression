//
// This file was generated by the JavaTM Architecture for XML Binding(JAXB) Reference Implementation, v2.2.4 
// See <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// Any modifications to this file will be lost upon recompilation of the source schema. 
// Generated on: 2014.05.28 at 10:55:57 AM PDT 
//


package org.apache.falcon.entity.v0.feed;

import javax.xml.bind.annotation.adapters.XmlAdapter;
import org.apache.falcon.entity.v0.Frequency;

public class Adapter1
    extends XmlAdapter<String, Frequency>
{


    public Frequency unmarshal(String value) {
        return (org.apache.falcon.entity.v0.Frequency.fromString(value));
    }

    public String marshal(Frequency value) {
        return (org.apache.falcon.entity.v0.Frequency.toString(value));
    }

}
