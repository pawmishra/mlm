package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.QuestionDao;
import com.javerian.erp.mlm.model.workflow.Question;
import com.javerian.erp.mlm.service.workflow.QuestionService;

@Service
public class QuestionServiceImpl implements QuestionService {

	@Autowired
	QuestionDao questionDao;

	@Override
	public Question findById(Long id) {

		return questionDao.findById(id);
	}

	@Override
	public boolean save(Question question) {

		return questionDao.save(question);
	}

	@Override
	public List<Question> findAllQuestion() {

		return questionDao.findAllQuestion();
	}

}
