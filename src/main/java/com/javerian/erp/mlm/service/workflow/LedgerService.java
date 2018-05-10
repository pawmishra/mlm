package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Ledger;

public interface LedgerService {

	Ledger findById(Long id);

	boolean save(Ledger ledger);

	void update(Ledger ledger);

	List<Ledger> findAllTransactions();

	List<Ledger> findAllTransactionsByMemberId(Long memberId);

	public List<Ledger> findLedgerByMemberIdAndLevel(Long memberId, String level);

}
