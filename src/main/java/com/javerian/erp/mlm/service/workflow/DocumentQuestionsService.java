package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.DocumentQuestions;

public interface DocumentQuestionsService {

	DocumentQuestions findById(Long id);

	boolean save(DocumentQuestions documentQuestions);

	List<DocumentQuestions> findAllDocumentQuestions();
}
