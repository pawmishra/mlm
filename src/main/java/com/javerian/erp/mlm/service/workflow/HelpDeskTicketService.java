package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.HelpDeskTicket;

public interface HelpDeskTicketService {

	HelpDeskTicket findById(Long id);

	boolean save(HelpDeskTicket helpdeskTicket);

	List<HelpDeskTicket> findAllHelpDeskTicket();
}
