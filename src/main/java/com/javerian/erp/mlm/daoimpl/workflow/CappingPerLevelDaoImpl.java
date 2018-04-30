package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.CappingPerLevelDao;

import com.javerian.erp.mlm.model.workflow.CappingPerLevel;

@Repository
@Transactional
public class CappingPerLevelDaoImpl extends AbstractDao<Long, CappingPerLevel> implements CappingPerLevelDao {

	@Override
	public CappingPerLevel findById(Long id) {
		CappingPerLevel cappingPerLevel = getByKey(id);
		return cappingPerLevel;
	}

	@Override
	public boolean save(CappingPerLevel cappingPerLevel) {
		persist(cappingPerLevel);
		return true;
	}

	@Override
	public List<CappingPerLevel> findAllCappingPerLevel() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<CappingPerLevel> listCappingPerLevel = (List<CappingPerLevel>) criteria.list();

		return listCappingPerLevel;
	}

}
