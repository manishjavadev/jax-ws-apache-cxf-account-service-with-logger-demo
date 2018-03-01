package com.manishjavadev.cxf.service;

import com.manishjavadev.schema.account.AccountInquiryResponseType;

/**
 * @author Manish
 *
 */
public interface AccountsService {
	AccountInquiryResponseType processAccountInqury(Long accountId, String accountType);
}
