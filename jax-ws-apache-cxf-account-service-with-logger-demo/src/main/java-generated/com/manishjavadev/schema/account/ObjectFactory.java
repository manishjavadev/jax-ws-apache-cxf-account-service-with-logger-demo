
package com.manishjavadev.schema.account;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlElementDecl;
import javax.xml.bind.annotation.XmlRegistry;
import javax.xml.namespace.QName;


/**
 * This object contains factory methods for each 
 * Java content interface and Java element interface 
 * generated in the com.manishjavadev.schema.account package. 
 * <p>An ObjectFactory allows you to programatically 
 * construct new instances of the Java representation 
 * for XML content. The Java representation of XML 
 * content can consist of schema derived interfaces 
 * and classes representing the binding of schema 
 * type definitions, element declarations and model 
 * groups.  Factory methods for each of these are 
 * provided in this class.
 * 
 */
@XmlRegistry
public class ObjectFactory {

    private final static QName _AccountInquiryRequest_QNAME = new QName("http://www.manishjavadev.com/schema/Account", "accountInquiryRequest");
    private final static QName _AccountInquiryResponse_QNAME = new QName("http://www.manishjavadev.com/schema/Account", "accountInquiryResponse");

    /**
     * Create a new ObjectFactory that can be used to create new instances of schema derived classes for package: com.manishjavadev.schema.account
     * 
     */
    public ObjectFactory() {
    }

    /**
     * Create an instance of {@link AccountInquiryRequestType }
     * 
     */
    public AccountInquiryRequestType createAccountInquiryRequestType() {
        return new AccountInquiryRequestType();
    }

    /**
     * Create an instance of {@link AccountInquiryResponseType }
     * 
     */
    public AccountInquiryResponseType createAccountInquiryResponseType() {
        return new AccountInquiryResponseType();
    }

    /**
     * Create an instance of {@link AccountInfoType }
     * 
     */
    public AccountInfoType createAccountInfoType() {
        return new AccountInfoType();
    }

    /**
     * Create an instance of {@link AccountResponseType }
     * 
     */
    public AccountResponseType createAccountResponseType() {
        return new AccountResponseType();
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInquiryRequestType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.manishjavadev.com/schema/Account", name = "accountInquiryRequest")
    public JAXBElement<AccountInquiryRequestType> createAccountInquiryRequest(AccountInquiryRequestType value) {
        return new JAXBElement<AccountInquiryRequestType>(_AccountInquiryRequest_QNAME, AccountInquiryRequestType.class, null, value);
    }

    /**
     * Create an instance of {@link JAXBElement }{@code <}{@link AccountInquiryResponseType }{@code >}}
     * 
     */
    @XmlElementDecl(namespace = "http://www.manishjavadev.com/schema/Account", name = "accountInquiryResponse")
    public JAXBElement<AccountInquiryResponseType> createAccountInquiryResponse(AccountInquiryResponseType value) {
        return new JAXBElement<AccountInquiryResponseType>(_AccountInquiryResponse_QNAME, AccountInquiryResponseType.class, null, value);
    }

}
