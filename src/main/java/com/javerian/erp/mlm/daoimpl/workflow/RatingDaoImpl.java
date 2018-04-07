package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.RatingDao;
import com.javerian.erp.mlm.model.workflow.Rating;

@Repository
@Transactional
public class RatingDaoImpl extends AbstractDao<Long, Rating> implements RatingDao {

	@Override
	public Rating findById(Long id) {
		Rating rating = getByKey(id);
		return rating;
	}

	@Override
	public boolean save(Rating rating) {
		persist(rating);
		return true;
	}

	@Override
	public List<Rating> findAllRating() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("rating_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Rating> listRating = (List<Rating>) criteria.list();

		return listRating;
	}

}
