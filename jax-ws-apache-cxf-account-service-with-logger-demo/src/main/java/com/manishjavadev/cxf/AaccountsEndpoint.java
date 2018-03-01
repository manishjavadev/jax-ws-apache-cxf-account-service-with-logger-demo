package com.manishjavadev.cxf;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.manishjavadev.cxf.service.AccountsService;
import com.manishjavadev.schema.account.AccountInquiryRequestType;
import com.manishjavadev.schema.account.AccountInquiryResponseType;
import com.manishjavadev.service.accounts.Accounts;

/**
 * As a end point, you need to specify these element with @WebService annotation
 * ( portName,serviceName, endpointInterface, targetNamespace)
 * 
 * @author Manish
 *
 */
@Service
@WebService(portName = "AccountSOAP", serviceName = "Accounts", endpointInterface = "com.manishjavadev.service.accounts.Accounts", targetNamespace = "http://www.manishjavadev.com/service/Accounts/")
public class AaccountsEndpoint implements Accounts {
	@Autowired
	private AccountsService accountsService;

	@Override
	public AccountInquiryResponseType processAccountInqury(AccountInquiryRequestType accountInquiryRequest) {
		return accountsService.processAccountInqury(accountInquiryRequest.getUniqueAccountId(),
				accountInquiryRequest.getAccountType());
	}

}
