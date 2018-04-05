package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.CategoryDao;
import com.javerian.erp.mlm.model.workflow.Category;
import com.javerian.erp.mlm.service.workflow.CategoryService;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	CategoryDao categoryDao;

	@Override
	public Category findById(Long id) {
		return categoryDao.findById(id);
	}

	@Override
	public boolean save(Category category) {

		Category cat = findByName(category.getCategoryName());
		if (cat == null) {
			return categoryDao.save(category);
		}
		return false;
	}

	@Override
	public List<Category> findAllCategory() {

		return categoryDao.findAllCategory();
	}

	@Override
	public Category findByName(String catName) {
		return categoryDao.findByName(catName);
	}

}
