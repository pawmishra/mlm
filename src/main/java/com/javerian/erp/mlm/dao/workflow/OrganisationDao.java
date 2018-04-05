package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Organisation;

public interface OrganisationDao {

	Organisation findById(Long id);

	boolean save(Organisation organisation);

	List<Organisation> findAllOrganisation();

	public Organisation findByName(String orgName);
}
