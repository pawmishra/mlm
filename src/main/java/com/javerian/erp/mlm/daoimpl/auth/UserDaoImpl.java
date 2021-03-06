package com.javerian.erp.mlm.daoimpl.auth;

import java.util.ArrayList;
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
		// Session newSession = getSessionFactory().openSession();
		// newSession.saveOrUpdate(user);
		// newSession.flush();
		// newSession.close();
		getSession().merge(user);
	}

	@SuppressWarnings({ "rawtypes", "unchecked" })
	@Override
	public List<User> getChildOfSponserById(Long id) {

		Query query = getSession().createQuery("from User where sponser_id = :user_id");
		query.setParameter("user_id", id);
		List<User> list = query.list();
		return list;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<User> getLowestLevelUsers() {

		List<User> listuser = new ArrayList<>();
		Query query = getSession().createQuery("select max(level_from_root) from User");
		List list = query.list();

		if (list != null && list.size() > 0) {
			Query queryUser = getSession().createQuery("from User where level_from_root >= :level order by id asc")
					.setParameter("level", Long.parseLong(list.get(0).toString()) - 1);
			listuser.addAll(queryUser.list());
		}
		return listuser;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<User> getChildsOfSponserById(Long id, int depth) {

		List<User> listuser = new ArrayList<>();
		Query query = getSession().createNativeQuery("select u1.*,u2.depth from mlmschema.user u1 join ("
				+ "WITH RECURSIVE children AS (SELECT id, 1 AS depth FROM mlmschema.user WHERE id = " + id
				+ " UNION ALL SELECT a.id, depth+1 FROM mlmschema.user a JOIN children b ON(a.sponser_id = b.id)) "
				+ "SELECT id, depth FROM children where depth <= " + depth + ") u2 on u1.id= u2.id order by u1.id");

		List<Object[]> rows = query.list();
		for (Object[] row : rows) {
			User user = new User();
			user.setId(Long.parseLong(row[0].toString()));
			user.setFirstName(row[1].toString());
			user.setLastName(row[2].toString());
			user.setEmail(row[3].toString());
			user.setUsername(row[4].toString());
			user.setPassword(row[5].toString());
			user.setSponser_id(Long.parseLong(row[6].toString()));
			user.setSponser_name(row[7].toString());
			user.setPosition_left_or_right(row[8].toString());
			user.setEligibility_status(Boolean.parseBoolean(row[10].toString()));
			user.setLevel_from_root(Long.parseLong(row[11].toString()));

			listuser.add(user);
		}

		return listuser;
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	@Override
	public List<User> getSponsersOfChildById(Long id, int depth) {
		List<User> listuser = new ArrayList<>();
		Query query = getSession().createNativeQuery("select u1.*,u2.depth from mlmschema.user u1 join ("
				+ "WITH RECURSIVE children AS (SELECT id, 1 AS depth FROM mlmschema.user WHERE id = " + id
				+ " UNION ALL SELECT a.sponser_id, depth+1 FROM mlmschema.user a JOIN children b ON(a.id = b.id)) "
				+ "SELECT id, depth FROM children where depth <= " + depth + ") u2 on u1.id= u2.id order by u1.id");

		List<Object[]> rows = query.list();
		for (Object[] row : rows) {
			User user = new User();
			user.setId(Long.parseLong(row[0].toString()));
			user.setFirstName(row[1].toString());
			user.setLastName(row[2].toString());
			user.setEmail(row[3].toString());
			user.setUsername(row[4].toString());
			user.setPassword(row[5].toString());
			user.setSponser_id(Long.parseLong(row[6].toString()));
			user.setSponser_name(row[7].toString());
			user.setPosition_left_or_right(row[8].toString());
			user.setEligibility_status(Boolean.parseBoolean(row[10].toString()));
			user.setLevel_from_root(Long.parseLong(row[11].toString()));

			listuser.add(user);
		}

		return listuser;
	}
}
