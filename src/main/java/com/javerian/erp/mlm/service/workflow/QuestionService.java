package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Question;

public interface QuestionService {

	Question findById(Long id);

	boolean save(Question question);

	List<Question> findAllQuestion();
}
