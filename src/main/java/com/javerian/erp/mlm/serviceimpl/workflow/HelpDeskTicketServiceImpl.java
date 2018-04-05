package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.HelpDeskTicketDao;
import com.javerian.erp.mlm.model.workflow.HelpDeskTicket;
import com.javerian.erp.mlm.service.workflow.HelpDeskTicketService;

@Service
public class HelpDeskTicketServiceImpl implements HelpDeskTicketService {

	@Autowired
	HelpDeskTicketDao helpdeskticketDao;

	@Override
	public HelpDeskTicket findById(Long id) {
		return helpdeskticketDao.findById(id);
	}

	@Override
	public boolean save(HelpDeskTicket helpdeskTicket) {

		return helpdeskticketDao.save(helpdeskTicket);
	}

	@Override
	public List<HelpDeskTicket> findAllHelpDeskTicket() {

		return helpdeskticketDao.findAllHelpDeskTicket();
	}

}
