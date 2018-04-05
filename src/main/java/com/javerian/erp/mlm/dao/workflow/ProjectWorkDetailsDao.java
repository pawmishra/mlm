package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;

public interface ProjectWorkDetailsDao {

	ProjectWorkDetails findById(Long id);

	boolean save(ProjectWorkDetails projectworkDetails);

	List<ProjectWorkDetails> findAllProjectWorkDetails();
}
