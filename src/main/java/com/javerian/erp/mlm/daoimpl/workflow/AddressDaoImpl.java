package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.AddressDao;
import com.javerian.erp.mlm.model.workflow.Address;

@Repository
@Transactional
public class AddressDaoImpl extends AbstractDao<Long, Address> implements AddressDao {

	@Override
	public Address findById(Long id) {
		Address address = getByKey(id);
		return address;
	}

	@Override
	public boolean save(Address address) {
		persist(address);
		return true;
	}

	@Override
	public List<Address> findAllAddress() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("user_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Address> listAddress = (List<Address>) criteria.list();

		return listAddress;
	}

}
