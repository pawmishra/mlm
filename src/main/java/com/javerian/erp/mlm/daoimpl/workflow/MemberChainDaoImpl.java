package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.MemberChainDao;
import com.javerian.erp.mlm.model.workflow.MemberChain;

@Repository
@Transactional
public class MemberChainDaoImpl extends AbstractDao<Long, MemberChain> implements MemberChainDao {

	@Override
	public MemberChain findById(Long id) {

		MemberChain memberChain = getByKey(id);

		return memberChain;
	}

	@Override
	public boolean save(MemberChain memberChain) {

		persist(memberChain);
		return true;
	}

	@Override
	public List<MemberChain> findAllMembers() {

		Criteria criteria = createEntityCriteria().addOrder(Order.asc("node_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<MemberChain> listMemberChain = (List<MemberChain>) criteria.list();

		return listMemberChain;
	}
}
