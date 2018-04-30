package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;

import com.javerian.erp.mlm.dao.workflow.ProjectAllocationDao;

import com.javerian.erp.mlm.model.workflow.ProjectAllocation;

@Repository
@Transactional
public class ProjectAllocationDaoImpl extends AbstractDao<Long, ProjectAllocation> implements ProjectAllocationDao {

	@Override
	public ProjectAllocation findById(Long id) {
		ProjectAllocation projectAllocation = getByKey(id);
		return projectAllocation;
	}

	@Override
	public boolean save(ProjectAllocation projectAllocation) {
		persist(projectAllocation);
		return true;
	}

	@Override
	public List<ProjectAllocation> findAllProjectAllocation() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<ProjectAllocation> listProjectAllocation = (List<ProjectAllocation>) criteria.list();

		return listProjectAllocation;
	}

}
