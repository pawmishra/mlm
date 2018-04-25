package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.AddressDao;
import com.javerian.erp.mlm.dao.workflow.RegistrationDao;
import com.javerian.erp.mlm.model.workflow.Address;
import com.javerian.erp.mlm.model.workflow.Registration;
import com.javerian.erp.mlm.service.workflow.AddressService;
import com.javerian.erp.mlm.service.workflow.RegistrationService;

@Service
public class RegistrationServiceImpl implements RegistrationService {

	@Autowired
	RegistrationDao registrationDao;

	@Override
	public Registration findById(Long id) {
		return registrationDao.findById(id);
	}

	@Override
	public boolean save(Registration registration) {
		return registrationDao.save(registration);
	}

	@Override
	public List<Registration> findAllRegistration() {
		return registrationDao.findAllRegistration();
	}

}
