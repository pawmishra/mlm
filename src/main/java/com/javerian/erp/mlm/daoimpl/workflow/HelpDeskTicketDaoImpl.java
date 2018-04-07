package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.HelpDeskTicketDao;
import com.javerian.erp.mlm.model.workflow.HelpDeskTicket;

@Repository
@Transactional
public class HelpDeskTicketDaoImpl extends AbstractDao<Long, HelpDeskTicket> implements HelpDeskTicketDao {

	@Override
	public HelpDeskTicket findById(Long id) {
		HelpDeskTicket helpdeskTicket = getByKey(id);
		return helpdeskTicket;
	}

	@Override
	public boolean save(HelpDeskTicket helpdeskTicket) {
		persist(helpdeskTicket);
		return true;
	}

	@Override
	public List<HelpDeskTicket> findAllHelpDeskTicket() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<HelpDeskTicket> listHelpDeskTicket = (List<HelpDeskTicket>) criteria.list();

		return listHelpDeskTicket;
	}

}
