
package com.manishjavadev.schema.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInquiryRequestType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInquiryRequestType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="uniqueAccountId" type="{http://www.w3.org/2001/XMLSchema}long"/&gt;
 *         &lt;element name="accountType" type="{http://www.w3.org/2001/XMLSchema}string"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInquiryRequestType", propOrder = {
    "uniqueAccountId",
    "accountType"
})
public class AccountInquiryRequestType {

    protected long uniqueAccountId;
    @XmlElement(required = true)
    protected String accountType;

    /**
     * Gets the value of the uniqueAccountId property.
     * 
     */
    public long getUniqueAccountId() {
        return uniqueAccountId;
    }

    /**
     * Sets the value of the uniqueAccountId property.
     * 
     */
    public void setUniqueAccountId(long value) {
        this.uniqueAccountId = value;
    }

    /**
     * Gets the value of the accountType property.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountType() {
        return accountType;
    }

    /**
     * Sets the value of the accountType property.
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountType(String value) {
        this.accountType = value;
    }

}
