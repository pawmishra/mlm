package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Address;

public interface AddressService {

	Address findById(Long id);

	boolean save(Address address);

	List<Address> findAllAddress();
}
