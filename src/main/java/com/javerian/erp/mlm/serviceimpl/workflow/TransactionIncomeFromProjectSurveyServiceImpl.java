package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.TransactionIncomeFromProjectSurveyDao;
import com.javerian.erp.mlm.model.workflow.TransactionIncomeFromProjectSurvey;
import com.javerian.erp.mlm.service.workflow.TransactionIncomeFromProjectSurveyService;

@Service
public class TransactionIncomeFromProjectSurveyServiceImpl implements TransactionIncomeFromProjectSurveyService {

	@Autowired
	TransactionIncomeFromProjectSurveyDao transactionincomefromprojectSurveyDao;

	@Override
	public TransactionIncomeFromProjectSurvey findById(Long id) {
		return transactionincomefromprojectSurveyDao.findById(id);
	}

	@Override
	public boolean save(TransactionIncomeFromProjectSurvey transactionincomefromprojectSurvey) {
		return transactionincomefromprojectSurveyDao.save(transactionincomefromprojectSurvey);
	}

	@Override
	public List<TransactionIncomeFromProjectSurvey> findAllTransactionIncomeFromProjectSurvey() {

		return transactionincomefromprojectSurveyDao.findAllTransactionIncomeFromProjectSurvey();
	}

}
