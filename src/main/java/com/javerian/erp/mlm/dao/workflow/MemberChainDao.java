package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.MemberChain;

public interface MemberChainDao {

	MemberChain findById(Long id);

	boolean save(MemberChain memberChain);

	List<MemberChain> findAllMembers();
}
