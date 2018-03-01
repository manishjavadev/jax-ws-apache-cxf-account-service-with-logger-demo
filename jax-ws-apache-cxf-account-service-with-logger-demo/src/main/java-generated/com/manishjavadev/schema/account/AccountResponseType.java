
package com.manishjavadev.schema.account;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>Java class for AccountResponseType complex type.
 * 
 * <p>The following schema fragment specifies the expected content contained within this class.
 * 
 * <pre>
 * &lt;complexType name="AccountResponseType"&gt;
 *   &lt;complexContent&gt;
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType"&gt;
 *       &lt;sequence&gt;
 *         &lt;element name="accountInfo" type="{http://www.manishjavadev.com/schema/Account}AccountInfoType"/&gt;
 *         &lt;element name="accountStatus" type="{http://www.manishjavadev.com/schema/Account}AccountStatusType"/&gt;
 *         &lt;element name="accountBalance" type="{http://www.w3.org/2001/XMLSchema}double"/&gt;
 *       &lt;/sequence&gt;
 *     &lt;/restriction&gt;
 *   &lt;/complexContent&gt;
 * &lt;/complexType&gt;
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccountResponseType", propOrder = {
    "accountInfo",
    "accountStatus",
    "accountBalance"
})
public class AccountResponseType {

    @XmlElement(required = true)
    protected AccountInfoType accountInfo;
    @XmlElement(required = true)
    @XmlSchemaType(name = "string")
    protected AccountStatusType accountStatus;
    protected double accountBalance;

    /**
     * Gets the value of the accountInfo property.
     * 
     * @return
     *     possible object is
     *     {@link AccountInfoType }
     *     
     */
    public AccountInfoType getAccountInfo() {
        return accountInfo;
    }

    /**
     * Sets the value of the accountInfo property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountInfoType }
     *     
     */
    public void setAccountInfo(AccountInfoType value) {
        this.accountInfo = value;
    }

    /**
     * Gets the value of the accountStatus property.
     * 
     * @return
     *     possible object is
     *     {@link AccountStatusType }
     *     
     */
    public AccountStatusType getAccountStatus() {
        return accountStatus;
    }

    /**
     * Sets the value of the accountStatus property.
     * 
     * @param value
     *     allowed object is
     *     {@link AccountStatusType }
     *     
     */
    public void setAccountStatus(AccountStatusType value) {
        this.accountStatus = value;
    }

    /**
     * Gets the value of the accountBalance property.
     * 
     */
    public double getAccountBalance() {
        return accountBalance;
    }

    /**
     * Sets the value of the accountBalance property.
     * 
     */
    public void setAccountBalance(double value) {
        this.accountBalance = value;
    }

}
