package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.BankDetails;

public interface BankDetailsService {

	BankDetails findById(Long id);

	boolean save(BankDetails bankDetails);

	List<BankDetails> findAllBankDetails();
}
