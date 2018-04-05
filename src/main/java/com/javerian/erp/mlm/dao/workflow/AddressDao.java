package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Address;

public interface AddressDao {

	Address findById(Long id);

	boolean save(Address address);

	List<Address> findAllAddress();
}
