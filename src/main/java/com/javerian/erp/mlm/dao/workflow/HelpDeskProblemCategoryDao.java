package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.HelpDeskProblemCategory;

public interface HelpDeskProblemCategoryDao {

	HelpDeskProblemCategory findById(Long id);

	boolean save(HelpDeskProblemCategory helpdeskproblemCategory);

	List<HelpDeskProblemCategory> findAllHelpDeskProblemCategory();
}
