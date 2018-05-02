package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.DocumentQuestions;


public interface DocumentQuestionsDao {

	DocumentQuestions findById(Long id);

	boolean save(DocumentQuestions documentQuestions);

	List<DocumentQuestions> findAllDocumentQuestions();
}
