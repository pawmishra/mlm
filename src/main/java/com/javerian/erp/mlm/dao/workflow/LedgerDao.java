package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Ledger;

public interface LedgerDao {

	Ledger findById(Long id);

	boolean save(Ledger ledger);

	List<Ledger> findAllTransactions();

}
