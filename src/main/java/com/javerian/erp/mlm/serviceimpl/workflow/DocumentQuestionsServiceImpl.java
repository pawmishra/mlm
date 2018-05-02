package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.DocumentQuestionsDao;
import com.javerian.erp.mlm.model.workflow.DocumentQuestions;
import com.javerian.erp.mlm.service.workflow.DocumentQuestionsService;

@Service
public class DocumentQuestionsServiceImpl implements DocumentQuestionsService {

	@Autowired
	DocumentQuestionsDao documentQuestionsDao;

	@Override
	public DocumentQuestions findById(Long id) {
		return documentQuestionsDao.findById(id);
	}

	@Override
	public boolean save(DocumentQuestions documentQuestions) {
		return documentQuestionsDao.save(documentQuestions);
	}

	@Override
	public List<DocumentQuestions> findAllDocumentQuestions() {
		return documentQuestionsDao.findAllDocumentQuestions();
	}

}
