package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.AddressDao;
import com.javerian.erp.mlm.model.workflow.Address;
import com.javerian.erp.mlm.service.workflow.AddressService;

@Service
public class AddressServiceImpl implements AddressService {

	@Autowired
	AddressDao addressDao;

	@Override
	public Address findById(Long id) {
		return addressDao.findById(id);
	}

	@Override
	public boolean save(Address address) {
		return addressDao.save(address);
	}

	@Override
	public List<Address> findAllAddress() {
		return addressDao.findAllAddress();
	}

}
