package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.QuestionDao;
import com.javerian.erp.mlm.model.workflow.Question;

@Repository
@Transactional
public class QuestionDaoImpl extends AbstractDao<Long, Question> implements QuestionDao {

	@Override
	public Question findById(Long id) {
		Question question = getByKey(id);
		return question;
	}

	@Override
	public boolean save(Question question) {
		persist(question);
		return true;
	}

	@Override
	public List<Question> findAllQuestion() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("user_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Question> listQuestion = (List<Question>) criteria.list();

		return listQuestion;
	}

}
