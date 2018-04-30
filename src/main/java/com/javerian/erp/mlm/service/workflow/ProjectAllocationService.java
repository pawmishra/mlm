package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.ProjectAllocation;

public interface ProjectAllocationService {

	ProjectAllocation findById(Long id);

	boolean save(ProjectAllocation projectAllocation);

	List<ProjectAllocation> findAllProjectAllocation();

}
