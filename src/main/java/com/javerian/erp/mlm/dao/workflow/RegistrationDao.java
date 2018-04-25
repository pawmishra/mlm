package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Registration;

public interface RegistrationDao {

	Registration findById(Long id);

	boolean save(Registration registration);

	List<Registration> findAllRegistration();
}
