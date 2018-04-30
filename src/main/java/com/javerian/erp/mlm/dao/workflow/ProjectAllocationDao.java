package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.ProjectAllocation;

public interface ProjectAllocationDao {

	ProjectAllocation findById(Long id);

	boolean save(ProjectAllocation projectAllocation);

	List<ProjectAllocation> findAllProjectAllocation();

}
