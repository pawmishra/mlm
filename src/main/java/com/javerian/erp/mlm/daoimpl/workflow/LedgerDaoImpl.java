package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.LedgerDao;
import com.javerian.erp.mlm.model.workflow.Ledger;

@Repository
@Transactional
public class LedgerDaoImpl extends AbstractDao<Long, Ledger> implements LedgerDao {

	@Override
	public Ledger findById(Long id) {
		Ledger ledger = getByKey(id);
		return ledger;
	}

	@Override
	public boolean save(Ledger ledger) {
		persist(ledger);
		return true;
	}

	@Override
	public void update(Ledger ledger) {
		getSession().merge(ledger);
	}

	@Override
	public List<Ledger> findAllTransactions() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("member_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Ledger> listMemberChain = (List<Ledger>) criteria.list();

		return listMemberChain;
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Ledger> findLedgerByMemberIdAndLevel(Long memberId, String level) {
		Query query = getSession().createQuery(
				"from Ledger where member_id=" + memberId + " and transaction_remark like '" + level + "'");
		List<Ledger> list = query.list();
		return list;
	}

	@Override
	public List<Ledger> findAllTransactionsByMemberId(Long memberId) {
		Query query = getSession()
				.createQuery("from Ledger where transaction_remark <> 'REGISTRATION_AMOUNT' and member_id=" + memberId);
		List<Ledger> list = query.list();
		return list;
	}
}
