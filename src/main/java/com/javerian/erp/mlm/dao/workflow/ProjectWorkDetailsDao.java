package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;

public interface ProjectWorkDetailsDao {

	ProjectWorkDetails findById(Long id);

	boolean save(ProjectWorkDetails projectworkDetails);

	List<ProjectWorkDetails> findAllProjectWorkDetails();

	public List<ProjectWorkDetails> findListOfProjectWorkDetailsByTicketId(String ticketId);

	public boolean updateProject(ProjectWorkDetails projectworkDetails);

	public ProjectWorkDetails findByDocumentId(String document_id);
}
