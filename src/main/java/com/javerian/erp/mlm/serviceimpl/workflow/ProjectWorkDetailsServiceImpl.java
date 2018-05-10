package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.ProjectWorkDetailsDao;
import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;
import com.javerian.erp.mlm.service.workflow.ProjectWorkDetailsService;

@Service
public class ProjectWorkDetailsServiceImpl implements ProjectWorkDetailsService {

	@Autowired
	ProjectWorkDetailsDao projectworkDetailsDao;

	@Override
	public ProjectWorkDetails findById(Long id) {

		return projectworkDetailsDao.findById(id);
	}

	@Override
	public boolean save(ProjectWorkDetails projectworkDetails) {

		return projectworkDetailsDao.save(projectworkDetails);
	}

	@Override
	public List<ProjectWorkDetails> findAllProjectWorkDetails() {

		return projectworkDetailsDao.findAllProjectWorkDetails();
	}

	@Override
	public List<ProjectWorkDetails> findListOfProjectWorkDetailsByTicketId(String ticketId) {
		return projectworkDetailsDao.findListOfProjectWorkDetailsByTicketId(ticketId);
	}

	@Override
	public boolean updateProject(ProjectWorkDetails projectworkDetails) {
		return projectworkDetailsDao.updateProject(projectworkDetails);
	}

	@Override
	public ProjectWorkDetails findByDocumentId(String document_id) {
		return projectworkDetailsDao.findByDocumentId(document_id);
	}

}
