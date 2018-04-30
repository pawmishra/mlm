package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.ProjectAllocationDao;
import com.javerian.erp.mlm.model.workflow.ProjectAllocation;
import com.javerian.erp.mlm.service.workflow.ProjectAllocationService;

@Service
public class ProjectAllocationServiceImpl implements ProjectAllocationService {

	@Autowired
	ProjectAllocationDao projectAllocationDao;

	@Override
	public ProjectAllocation findById(Long id) {
		return projectAllocationDao.findById(id);
	}

	@Override
	public boolean save(ProjectAllocation projectAllocation) {
		return projectAllocationDao.save(projectAllocation);
	}

	@Override
	public List<ProjectAllocation> findAllProjectAllocation() {
		return projectAllocationDao.findAllProjectAllocation();
	}

}
