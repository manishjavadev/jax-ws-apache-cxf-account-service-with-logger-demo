
package com.manishjavadev.schema.account;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountStatusType.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * <p>
 * <pre>
 * &lt;simpleType name="AccountStatusType"&gt;
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string"&gt;
 *     &lt;enumeration value="READY"/&gt;
 *     &lt;enumeration value="INPROGRESS"/&gt;
 *     &lt;enumeration value="FAILD"/&gt;
 *   &lt;/restriction&gt;
 * &lt;/simpleType&gt;
 * </pre>
 * 
 */
@XmlType(name = "AccountStatusType")
@XmlEnum
public enum AccountStatusType {

    READY,
    INPROGRESS,
    FAILD;

    public String value() {
        return name();
    }

    public static AccountStatusType fromValue(String v) {
        return valueOf(v);
    }

}
