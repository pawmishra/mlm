package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.MemberDetailsDao;
import com.javerian.erp.mlm.model.workflow.MemberDetails;
import com.javerian.erp.mlm.service.workflow.MemberDetailsService;

@Service
public class MemberDetailsServiceImpl implements MemberDetailsService {

	@Autowired
	MemberDetailsDao memberDao;

	@Override
	public MemberDetails findById(Long id) {
		return memberDao.findById(id);
	}

	@Override
	public boolean save(MemberDetails memberDetails) {
		return memberDao.save(memberDetails);
	}

	@Override
	public List<MemberDetails> findAllMembers() {
		return memberDao.findAllMembers();
	}

}
