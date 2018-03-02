package com.manishjavadev.cxf;

import static org.junit.Assert.assertTrue;

import javax.xml.ws.soap.SOAPFaultException;

import org.apache.cxf.jaxws.JaxWsProxyFactoryBean;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import com.manishjavadev.schema.account.AccountInquiryRequestType;
import com.manishjavadev.schema.account.AccountInquiryResponseType;
import com.manishjavadev.service.accounts.Accounts;

/**
 * The @RunWith annotation tells jUnit to use the Spring jUnit 4 test runner for
 * exection of the tests. @RunWith(SpringJUnit4ClassRunner.class)
 * 
 * 
 * The @ContextConfiguration annotation provides the classpath to the test
 * spring configuration file.
 * 
 * @author Manish
 *
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration({ "classpath:test-applicationContext.xml" })
public class AaccountsEndpointTest {
	// Interface for the Account web service
	private Accounts accounts;

	// Input parameter to the web service.
	private AccountInquiryRequestType accountInquiryRequestType;

	/**
	 * org.apache.cxf.jaxws.spring.
	 * JaxWsProxyFactoryBeanDefinitionParser$JAXWSSpringClientProxyFactoryBean
	 * 
	 * This will use to create JaxWsClientProxy
	 */
	@Autowired
	private JaxWsProxyFactoryBean testAccountClient;

	@Before
	public void setUp() throws Exception {
		// Creating JaxWsClientProxy object
		accounts = testAccountClient.create(Accounts.class);

		accountInquiryRequestType = new AccountInquiryRequestType();
		accountInquiryRequestType.setUniqueAccountId(1234);
		accountInquiryRequestType.setAccountType("SAVING");
	}

	@After
	public void tearDown() throws Exception {
		accounts = null;
	}

	@Test
	public void testProcessAccountInqurySuccess() {
		AccountInquiryResponseType accResponseType = accounts.processAccountInqury(accountInquiryRequestType);
		assertTrue(accResponseType.getAccountResponseType().getAccountInfo().getAccountId() == 1234);
		System.out.println("Done");
	}

	@Test(expected = SOAPFaultException.class)
	public void testProcessAccountInquryException() {
		AccountInquiryResponseType accResponseType = accounts.processAccountInqury(null);
		assertTrue(accResponseType.getAccountResponseType().getAccountInfo().getAccountId() == 1234);
		System.out.println("Done");
	}
}
