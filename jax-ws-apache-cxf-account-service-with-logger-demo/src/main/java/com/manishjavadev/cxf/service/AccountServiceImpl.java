package com.manishjavadev.cxf.service;

import java.util.Date;
import java.util.GregorianCalendar;

import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import org.springframework.stereotype.Service;

import com.manishjavadev.schema.account.AccountInfoType;
import com.manishjavadev.schema.account.AccountInquiryResponseType;
import com.manishjavadev.schema.account.AccountResponseType;
import com.manishjavadev.schema.account.AccountStatusType;
import com.manishjavadev.schema.account.AccountType;
import com.manishjavadev.schema.account.ObjectFactory;

/**
 * @author Manish
 *
 */
@Service
public class AccountServiceImpl implements AccountsService {

	@Override
	public AccountInquiryResponseType processAccountInqury(Long accountId, String accountType) {

		ObjectFactory factory = new ObjectFactory();
		AccountInquiryResponseType accountInquiryResponseType = factory.createAccountInquiryResponseType();
		AccountResponseType accountResponseType = factory.createAccountResponseType();
		AccountInfoType accountInfoType = factory.createAccountInfoType();
		accountInfoType.setAccountId(accountId);
		accountInfoType.setFirstName("Manish");
		accountInfoType.setLastName("Srivastava");

		try {
			GregorianCalendar cal = new GregorianCalendar();
			cal.setTime(new Date(System.currentTimeMillis()));
			XMLGregorianCalendar accountStartDate = DatatypeFactory.newInstance().newXMLGregorianCalendar(cal);
			accountInfoType.setAccountStartDate(accountStartDate);
		} catch (Exception e) {
			// TODO: Handle this exception.
		}
		// Some processing logic to set account type based on input
		accountInfoType.setAccountType(AccountType.SAVING);
		// Some processing logic to set account status type based on logic
		accountResponseType.setAccountStatus(AccountStatusType.READY);
		accountResponseType.setAccountInfo(accountInfoType);
		accountResponseType.setAccountBalance(500000);
		accountInquiryResponseType.setAccountResponseType(accountResponseType);
		return accountInquiryResponseType;
	}

}
