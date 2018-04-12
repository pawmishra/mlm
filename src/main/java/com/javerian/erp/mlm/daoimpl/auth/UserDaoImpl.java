package com.javerian.erp.mlm.daoimpl.auth;

import java.util.List;

import org.hibernate.Criteria;
import org.hibernate.Hibernate;
import org.hibernate.criterion.Order;
import org.hibernate.criterion.Restrictions;
import org.hibernate.query.Query;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Repository;

import com.javerian.erp.mlm.dao.auth.AbstractDao;
import com.javerian.erp.mlm.dao.auth.UserDao;
import com.javerian.erp.mlm.model.auth.User;

@Repository("userDao")
public class UserDaoImpl extends AbstractDao<Long, User> implements UserDao {

	static final Logger logger = LoggerFactory.getLogger(UserDaoImpl.class);

	public User findById(Long id) {
		User user = getByKey(id);
		if (user != null) {
			Hibernate.initialize(user.getUserProfiles());
		}
		return user;
	}

	public User findBySSO(String username) {
		logger.info("Username : {}", username);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("username", username));
		User user = (User) crit.uniqueResult();
		if (user != null) {
			Hibernate.initialize(user.getUserProfiles());
		}
		return user;
	}

	@SuppressWarnings("unchecked")
	public List<User> findAllUsers() {
		Criteria criteria = createEntityCriteria().addOrder(Order.asc("firstName"));
		criteria.setResultTransformer(Criteria.DISTINCT_ROOT_ENTITY);// To avoid duplicates.
		List<User> users = (List<User>) criteria.list();

		// No need to fetch userProfiles since we are not showing them on list page. Let
		// them lazy load.
		// Uncomment below lines for eagerly fetching of userProfiles if you want.
		/*
		 * for(User user : users){ Hibernate.initialize(user.getUserProfiles()); }
		 */
		return users;
	}

	public void save(User user) {
		persist(user);
	}

	public void deleteBySSO(String username) {
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("username", username));
		User user = (User) crit.uniqueResult();
		delete(user);
	}

	@Override
	public void updateUser(User user) {
		getSession().merge(user);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<User> getChildOfSponserById(Long id) {

		Query query = getSession().createQuery("from User where sponser_id = :user_id ");
		query.setParameter("user_id", id);
		List<User> list = query.list();
		return list;
	}
}
