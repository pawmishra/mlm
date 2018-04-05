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

}
