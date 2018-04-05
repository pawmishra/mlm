package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.ReviewerRemarkDao;
import com.javerian.erp.mlm.model.workflow.ReviewerRemark;

@Repository
@Transactional
public class ReviewerRemarkDaoImpl extends AbstractDao<Long, ReviewerRemark> implements ReviewerRemarkDao {

	@Override
	public ReviewerRemark findById(Long id) {
		ReviewerRemark reviewerRemark = getByKey(id);
		return reviewerRemark;
	}

	@Override
	public boolean save(ReviewerRemark reviewerRemark) {
		persist(reviewerRemark);
		return true;
	}

	@Override
	public List<ReviewerRemark> findAllReviewerRemark() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("user_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<ReviewerRemark> listReviewerRemark = (List<ReviewerRemark>) criteria.list();

		return listReviewerRemark;
	}

}
