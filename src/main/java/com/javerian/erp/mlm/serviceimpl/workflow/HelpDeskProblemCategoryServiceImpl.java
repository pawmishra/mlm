package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.HelpDeskProblemCategoryDao;
import com.javerian.erp.mlm.model.workflow.HelpDeskProblemCategory;
import com.javerian.erp.mlm.service.workflow.HelpDeskProblemCategoryService;

@Service
public class HelpDeskProblemCategoryServiceImpl implements HelpDeskProblemCategoryService {

	@Autowired
	HelpDeskProblemCategoryDao helpdeskproblemCategoryDao;

	@Override
	public HelpDeskProblemCategory findById(Long id) {

		return helpdeskproblemCategoryDao.findById(id);
	}

	@Override
	public boolean save(HelpDeskProblemCategory helpdeskproblemCategory) {

		return helpdeskproblemCategoryDao.save(helpdeskproblemCategory);
	}

	@Override
	public List<HelpDeskProblemCategory> findAllHelpDeskProblemCategory() {

		return helpdeskproblemCategoryDao.findAllHelpDeskProblemCategory();
	}

}
