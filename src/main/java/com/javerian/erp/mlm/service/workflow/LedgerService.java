package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Ledger;

public interface LedgerService {

	Ledger findById(Long id);

	boolean save(Ledger helpdeskTicket);

	List<Ledger> findAllTransactions();
}
