package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;
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
		getSession().merge(bankdetails);
		// persist(bankdetails);
		return true;
	}

	@Override
	public List<BankDetails> findAllBankDetails() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("bank_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<BankDetails> listBankDetails = (List<BankDetails>) criteria.list();

		return listBankDetails;
	}

	@Override
	public BankDetails findByCustId(Long custId) {

		Query query = getSession().createQuery("from BankDetails where customer_id=:custId");
		query.setParameter("custId", custId);
		BankDetails bankDetails = (BankDetails) query.uniqueResult();
		return bankDetails;
	}

}
