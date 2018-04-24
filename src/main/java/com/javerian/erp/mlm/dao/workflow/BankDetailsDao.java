package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.BankDetails;

public interface BankDetailsDao {

	BankDetails findById(Long id);

	boolean save(BankDetails bankdetails);

	List<BankDetails> findAllBankDetails();

	BankDetails findByCustId(Long custId);
}
