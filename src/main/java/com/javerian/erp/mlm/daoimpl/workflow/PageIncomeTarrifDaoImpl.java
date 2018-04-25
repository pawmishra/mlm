package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.PageIncomeTarrifDao;
import com.javerian.erp.mlm.model.workflow.PageIncomeTarrif;

@Repository
@Transactional
public class PageIncomeTarrifDaoImpl extends AbstractDao<Long, PageIncomeTarrif> implements PageIncomeTarrifDao {

	@Override
	public PageIncomeTarrif findById(Long id) {
		PageIncomeTarrif pageincomeTarrif = getByKey(id);
		return pageincomeTarrif;
	}

	@Override
	public boolean save(PageIncomeTarrif pageIncomeTarrif) {
		persist(pageIncomeTarrif);
		return true;
	}

	@Override
	public List<PageIncomeTarrif> findAllPageIncomeTarrif() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("page_income_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<PageIncomeTarrif> listPageIncomeTarrif = (List<PageIncomeTarrif>) criteria.list();

		return listPageIncomeTarrif;
	}

}
