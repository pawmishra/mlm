package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.MemberChain;

public interface MemberChainService {

	MemberChain findById(Long id);

	boolean save(MemberChain memberChain);

	List<MemberChain> findAllMembers();
}
