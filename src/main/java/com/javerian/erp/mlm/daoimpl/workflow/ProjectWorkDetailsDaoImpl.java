package com.javerian.erp.mlm.daoimpl.workflow;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.criterion.Order;
import org.hibernate.query.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.workflow.ProjectWorkDetailsDao;
import com.javerian.erp.mlm.model.workflow.ProjectWorkDetails;

@Repository
@Transactional
public class ProjectWorkDetailsDaoImpl extends AbstractDao<Long, ProjectWorkDetails> implements ProjectWorkDetailsDao {

	@Override
	public ProjectWorkDetails findById(Long id) {
		ProjectWorkDetails projectworkDetails = getByKey(id);
		return projectworkDetails;
	}

	@Override
	public boolean save(ProjectWorkDetails projectworkDetails) {
		persist(projectworkDetails);
		return true;
	}

	@Override
	public List<ProjectWorkDetails> findAllProjectWorkDetails() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("prj_work_details_id"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<ProjectWorkDetails> listProjectWorkDetails = (List<ProjectWorkDetails>) criteria.list();

		return listProjectWorkDetails;
	}

	@Override
	public List<ProjectWorkDetails> findListOfProjectWorkDetailsByTicketId(String ticketId) {

		Query query = getSession().createQuery("from ProjectWorkDetails where status = 1 and ticket_id=:ticketId");
		query.setParameter("ticketId", ticketId);
		List<ProjectWorkDetails> list = query.list();
		return list;
	}

	@Override
	public boolean updateProject(ProjectWorkDetails projectworkDetails) {
		getSession().merge(projectworkDetails);
		return true;
	}

}
