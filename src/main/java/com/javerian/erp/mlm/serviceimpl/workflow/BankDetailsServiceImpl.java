package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.BankDetailsDao;
import com.javerian.erp.mlm.model.workflow.BankDetails;
import com.javerian.erp.mlm.service.workflow.BankDetailsService;

@Service
public class BankDetailsServiceImpl implements BankDetailsService {

	@Autowired
	BankDetailsDao bankdetailsDao;

	@Override
	public BankDetails findById(Long id) {
		return bankdetailsDao.findById(id);
	}

	@Override
	public boolean save(BankDetails bankDetails) {
		return bankdetailsDao.save(bankDetails);
	}

	@Override
	public List<BankDetails> findAllBankDetails() {
		return bankdetailsDao.findAllBankDetails();
	}

	@Override
	public BankDetails findByCustId(Long custId) {
		return bankdetailsDao.findByCustId(custId);
	}

}
