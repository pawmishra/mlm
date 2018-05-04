package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;

public interface ProjectWorkDetailsService {

	ProjectWorkDetails findById(Long id);

	boolean save(ProjectWorkDetails projectworkDetails);

	List<ProjectWorkDetails> findAllProjectWorkDetails();

	List<ProjectWorkDetails> findListOfProjectWorkDetailsByTicketId(String ticketId);

	boolean updateProject(ProjectWorkDetails projectworkDetails);
}
