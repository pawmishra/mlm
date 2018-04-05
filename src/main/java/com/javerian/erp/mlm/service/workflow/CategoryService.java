package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Category;

public interface CategoryService {

	Category findById(Long id);

	boolean save(Category category);

	List<Category> findAllCategory();

	Category findByName(String catName);
}
