package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.HelpDeskProblemCategory;

public interface HelpDeskProblemCategoryService {

	HelpDeskProblemCategory findById(Long id);

	boolean save(HelpDeskProblemCategory helpdeskproblemCategory);

	List<HelpDeskProblemCategory> findAllHelpDeskProblemCategory();
}
