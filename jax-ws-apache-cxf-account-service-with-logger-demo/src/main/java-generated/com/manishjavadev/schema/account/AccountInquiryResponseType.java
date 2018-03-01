
package com.manishjavadev.schema.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountInquiryResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountInquiryResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountResponseType" type="{http://www.manishjavadev.com/schema/Account}AccountResponseType"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountInquiryResponseType", propOrder = {
    "accountResponseType"
})
public class AccountInquiryResponseType {

    @XmlElement(required = true)
    protected AccountResponseType accountResponseType;

    /**
     * Gets the value of the accountResponseType property.
     * 
     * @return
     *     possible object is
     *     {@link AccountResponseType }
     *     
     */
    public AccountResponseType getAccountResponseType() {
        return accountResponseType;
    }

    /**
     * Sets the value of the accountResponseType property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountResponseType }
     *     
     */
    public void setAccountResponseType(AccountResponseType value) {
        this.accountResponseType = value;
    }

}
