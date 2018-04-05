package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.BankDetailsDao;
import com.javerian.erp.mlm.model.workflow.BankDetails;

@Repository
@Transactional
public class BankDetailsDaoImpl extends AbstractDao<Long, BankDetails> implements BankDetailsDao {

	@Override
	public BankDetails findById(Long id) {
		BankDetails bankdetails = getByKey(id);
		return bankdetails;
	}

	@Override
	public boolean save(BankDetails bankdetails) {
		persist(bankdetails);
		return true;
	}

	@Override
	public List<BankDetails> findAllBankDetails() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("user_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<BankDetails> listBankDetails = (List<BankDetails>) criteria.list();

		return listBankDetails;
	}

}
