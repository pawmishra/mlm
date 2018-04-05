package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.OrganisationDao;
import com.javerian.erp.mlm.model.workflow.Organisation;
import com.javerian.erp.mlm.service.workflow.OrganisationService;

@Service
public class OrganisationServiceImpl implements OrganisationService {

	@Autowired
	OrganisationDao organisationDao;

	@Override
	public Organisation findById(Long id) {

		return organisationDao.findById(id);
	}

	@Override
	public boolean save(Organisation organisation) {

		return organisationDao.save(organisation);
	}

	@Override
	public List<Organisation> findAllOrganisation() {

		return organisationDao.findAllOrganisation();
	}

}
