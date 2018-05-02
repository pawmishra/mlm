package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.DocumentQuestionsDao;
import com.javerian.erp.mlm.model.workflow.DocumentQuestions;

@Repository
@Transactional
public class DocumentQuestionsDaoImpl extends AbstractDao<Long, DocumentQuestions> implements DocumentQuestionsDao {

	
	@Override
	public DocumentQuestions findById(Long id) {
		DocumentQuestions documentQuestions = getByKey(id);
		return documentQuestions;
	}

	@Override
	public boolean save(DocumentQuestions documentQuestions) {
		persist(documentQuestions);
		return true;
	}

	@Override
	public List<DocumentQuestions> findAllDocumentQuestions() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<DocumentQuestions> listDocumentQuestions = (List<DocumentQuestions>) criteria.list();

		return listDocumentQuestions;
	}

}
