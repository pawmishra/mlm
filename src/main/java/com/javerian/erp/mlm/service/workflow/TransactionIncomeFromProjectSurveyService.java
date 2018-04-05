package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.TransactionIncomeFromProjectSurvey;

public interface TransactionIncomeFromProjectSurveyService {

	TransactionIncomeFromProjectSurvey findById(Long id);

	boolean save(TransactionIncomeFromProjectSurvey transactionincomefromprojectSurvey);

	List<TransactionIncomeFromProjectSurvey> findAllTransactionIncomeFromProjectSurvey();
}
