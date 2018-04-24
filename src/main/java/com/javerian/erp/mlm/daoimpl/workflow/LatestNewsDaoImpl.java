package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.LatestNewsDao;
import com.javerian.erp.mlm.model.workflow.LatestNews;

@Repository
@Transactional
public class LatestNewsDaoImpl extends AbstractDao<Long, LatestNews> implements LatestNewsDao {

	@Override
	public LatestNews findById(Long id) {
		LatestNews latestNews = getByKey(id);
		return latestNews;
	}

	@Override
	public boolean save(LatestNews latestNews) {
		persist(latestNews);
		return true;
	}

	@Override
	public List<LatestNews> findAllLatestNews() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<LatestNews> listLatestNews = (List<LatestNews>) criteria.list();

		return listLatestNews;
	}

}
