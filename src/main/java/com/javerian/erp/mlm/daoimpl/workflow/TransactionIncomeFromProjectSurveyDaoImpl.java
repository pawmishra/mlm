package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.TransactionIncomeFromProjectSurveyDao;
import com.javerian.erp.mlm.model.workflow.TransactionIncomeFromProjectSurvey;

@Repository
@Transactional
public class TransactionIncomeFromProjectSurveyDaoImpl extends AbstractDao<Long, TransactionIncomeFromProjectSurvey>
		implements TransactionIncomeFromProjectSurveyDao {

	@Override
	public TransactionIncomeFromProjectSurvey findById(Long id) {
		TransactionIncomeFromProjectSurvey transactionincomefromprojectSurvey = getByKey(id);
		return transactionincomefromprojectSurvey;
	}

	@Override
	public boolean save(TransactionIncomeFromProjectSurvey transactionincomefromprojectSurvey) {
		persist(transactionincomefromprojectSurvey);
		return true;
	}

	@Override
	public List<TransactionIncomeFromProjectSurvey> findAllTransactionIncomeFromProjectSurvey() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("user_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<TransactionIncomeFromProjectSurvey> listTransactionIncomeFromProjectSurvey = (List<TransactionIncomeFromProjectSurvey>) criteria
				.list();

		return listTransactionIncomeFromProjectSurvey;
	}

}
