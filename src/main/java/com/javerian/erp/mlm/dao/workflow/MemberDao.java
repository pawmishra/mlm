package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.MemberDetails;

public interface MemberDao {

	MemberDetails findById(Long id);

	boolean save(MemberDetails memberDetails);

	List<MemberDetails> findAllMembers();
}
