package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.MemberDetails;

public interface MemberService {

	MemberDetails findById(Long id);

	boolean save(MemberDetails memberDetails);

	List<MemberDetails> findAllMembers();
}
