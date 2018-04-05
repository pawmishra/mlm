package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.OrganisationDao;
import com.javerian.erp.mlm.model.workflow.Organisation;

@Repository
@Transactional
public class OrganisationDaoImpl extends AbstractDao<Long, Organisation> implements OrganisationDao {

	@Override
	public Organisation findById(Long id) {
		Organisation organisation = getByKey(id);
		return organisation;
	}

	@Override
	public boolean save(Organisation organisation) {
		persist(organisation);
		return true;
	}

	@Override
	public List<Organisation> findAllOrganisation() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("user_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Organisation> listOrganisation = (List<Organisation>) criteria.list();

		return listOrganisation;
	}

}
