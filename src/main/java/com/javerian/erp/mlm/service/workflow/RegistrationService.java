package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Registration;

public interface RegistrationService {

	Registration findById(Long id);

	boolean save(Registration registration);

	List<Registration> findAllRegistration();
}
