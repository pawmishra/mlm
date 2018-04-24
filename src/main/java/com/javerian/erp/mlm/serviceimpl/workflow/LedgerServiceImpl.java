package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.LedgerDao;
import com.javerian.erp.mlm.model.workflow.Ledger;
import com.javerian.erp.mlm.service.workflow.LedgerService;

@Service
public class LedgerServiceImpl implements LedgerService {

	@Autowired
	LedgerDao ledgerDao;

	@Override
	public Ledger findById(Long id) {
		return ledgerDao.findById(id);
	}

	@Override
	public boolean save(Ledger ledger) {
		return ledgerDao.save(ledger);
	}

	@Override
	public List<Ledger> findAllTransactions() {
		return ledgerDao.findAllTransactions();
	}

}
