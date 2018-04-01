package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.MemberDao;
import com.javerian.erp.mlm.model.workflow.MemberDetails;

@Repository
@Transactional
public class MemberDaoImpl extends AbstractDao<Long, MemberDetails> implements MemberDao {

	@Override
	public MemberDetails findById(Long id) {

		MemberDetails memberDetails = getByKey(id);

		return memberDetails;
	}

	@Override
	public boolean save(MemberDetails memberDetails) {
		getSession().update(memberDetails);
		// persist(memberDetails);
		return true;
	}

	@Override
	public List<MemberDetails> findAllMembers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("node_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<MemberDetails> listMemberDetails = (List<MemberDetails>) criteria.list();

		return listMemberDetails;
	}

}
