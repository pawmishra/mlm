package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.HelpDeskProblemCategoryDao;
import com.javerian.erp.mlm.model.workflow.HelpDeskProblemCategory;

@Repository
@Transactional
public class HelpDeskProblemCategoryDaoImpl extends AbstractDao<Long, HelpDeskProblemCategory>
		implements HelpDeskProblemCategoryDao {

	@Override
	public HelpDeskProblemCategory findById(Long id) {
		HelpDeskProblemCategory helpdeskproblemCategory = getByKey(id);
		return helpdeskproblemCategory;
	}

	@Override
	public boolean save(HelpDeskProblemCategory helpdeskproblemCategory) {
		persist(helpdeskproblemCategory);
		return true;
	}

	@Override
	public List<HelpDeskProblemCategory> findAllHelpDeskProblemCategory() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("user_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<HelpDeskProblemCategory> listHelpDeskProblemCategory = (List<HelpDeskProblemCategory>) criteria.list();

		return listHelpDeskProblemCategory;
	}

}
