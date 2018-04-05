package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.CategoryDao;
import com.javerian.erp.mlm.model.workflow.Category;

@Repository
@Transactional
public class CategoryDaoImpl extends AbstractDao<Long, Category> implements CategoryDao {

	@Override
	public Category findById(Long id) {
		Category category = getByKey(id);
		return category;
	}

	@Override
	public boolean save(Category category) {
		persist(category);
		return true;
	}

	@Override
	public List<Category> findAllCategory() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("user_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<Category> listCategory = (List<Category>) criteria.list();

		return listCategory;
	}

}
