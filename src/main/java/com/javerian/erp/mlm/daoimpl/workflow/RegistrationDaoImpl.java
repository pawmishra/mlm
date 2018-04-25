package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.RegistrationDao;
import com.javerian.erp.mlm.model.workflow.Address;
import com.javerian.erp.mlm.model.workflow.Registration;

@Repository
@Transactional
public class RegistrationDaoImpl extends AbstractDao<Long, Registration> implements RegistrationDao {

	@Override
	public Registration findById(Long id) {
		Registration registration= getByKey(id);
		return registration;
	}

	@Override
	public boolean save(Registration registration) {
		persist(registration);
		return true;
	}

	@Override
	public List<Registration> findAllRegistration() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Registration> listRegistration = (List<Registration>) criteria.list();

		return listRegistration;
	}

}
