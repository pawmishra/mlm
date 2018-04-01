package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.MemberDao;
import com.javerian.erp.mlm.model.workflow.MemberChain;
import com.javerian.erp.mlm.service.workflow.MemberService;

@Service
public class MemberServiceImpl implements MemberService {

	@Autowired
	MemberDao memberDao;

	@Override
	public MemberChain findById(Long id) {
		return memberDao.findById(id);
	}

	@Override
	public boolean save(MemberChain memberChain) {
		return memberDao.save(memberChain);
	}

	@Override
	public List<MemberChain> findAllMembers() {
		return memberDao.findAllMembers();
	}

}
