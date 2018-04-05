package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.HelpDeskTicket;

public interface HelpDeskTicketDao {

	HelpDeskTicket findById(Long id);

	boolean save(HelpDeskTicket helpdeskTicket);

	List<HelpDeskTicket> findAllHelpDeskTicket();
}
