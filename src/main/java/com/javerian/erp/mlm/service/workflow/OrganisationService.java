package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Organisation;

public interface OrganisationService {

	Organisation findById(Long id);

	boolean save(Organisation organisation);

	List<Organisation> findAllOrganisation();

	public Organisation findByName(String orgName);
}
