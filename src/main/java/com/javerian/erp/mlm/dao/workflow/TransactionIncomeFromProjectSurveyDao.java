package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.TransactionIncomeFromProjectSurvey;

public interface TransactionIncomeFromProjectSurveyDao {

	TransactionIncomeFromProjectSurvey findById(Long id);

	boolean save(TransactionIncomeFromProjectSurvey transactionincomefromprojectSurvey);

	List<TransactionIncomeFromProjectSurvey> findAllTransactionIncomeFromProjectSurvey();
}
