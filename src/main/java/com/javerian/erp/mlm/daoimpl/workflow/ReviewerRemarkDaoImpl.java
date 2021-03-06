package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;
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
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<ReviewerRemark> listReviewerRemark = (List<ReviewerRemark>) criteria.list();

		return listReviewerRemark;
	}

	@Override
	public List<ReviewerRemark> findByReviewerId(Long id) {

		List<ReviewerRemark> list = new ArrayList<ReviewerRemark>();
		Query query = getSession().createQuery("from ReviewerRemark where status <> 2 and reviewed_by=:id");
		query.setParameter("id", id);
		list.addAll(query.list());
		return list;
	}

	@Override
	public Integer getCountOfAssignedProjectToUser(Long user_id) {

		Query query = getSession().createNativeQuery(
				"SELECT count(reviewed_by) FROM mlmschema.reviewer_remark group by project_id, reviewed_by having reviewed_by = "
						+ user_id);
		List list = query.list();

		if (list != null)
			return list.size();
		else
			return 0;
	}

}
