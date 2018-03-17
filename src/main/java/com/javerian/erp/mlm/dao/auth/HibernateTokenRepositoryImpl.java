package com.javerian.erp.mlm.dao.auth;

import java.util.Date;

import org.hibernate.Criteria;
import org.hibernate.criterion.Restrictions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.security.web.authentication.rememberme.PersistentRememberMeToken;
import org.springframework.security.web.authentication.rememberme.PersistentTokenRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.javerian.erp.mlm.model.auth.PersistentLogins;

@Repository("tokenRepositoryDao")
@Transactional
public class HibernateTokenRepositoryImpl extends AbstractDao<String, PersistentLogins>
		implements PersistentTokenRepository {

	static final Logger logger = LoggerFactory.getLogger(HibernateTokenRepositoryImpl.class);

	public void createNewToken(PersistentRememberMeToken token) {

		logger.info("Creating Token for user : {}", token.getUsername());
		PersistentLogins PersistentLogins = new PersistentLogins();
		PersistentLogins.setUsername(token.getUsername());
		PersistentLogins.setSeries(token.getSeries());
		PersistentLogins.setToken(token.getTokenValue());
		PersistentLogins.setLast_used(token.getDate());
		persist(PersistentLogins);
	}

	public PersistentRememberMeToken getTokenForSeries(String seriesId) {
		logger.info("Fetch Token if any for seriesId : {}", seriesId);
		try {
			Criteria crit = createEntityCriteria();
			crit.add(Restrictions.eq("series", seriesId));
			PersistentLogins PersistentLogins = (PersistentLogins) crit.uniqueResult();

			return new PersistentRememberMeToken(PersistentLogins.getUsername(), PersistentLogins.getSeries(),
					PersistentLogins.getToken(), PersistentLogins.getLast_used());
		} catch (Exception e) {
			logger.info("Token not found...");
			return null;
		}
	}

	public void removeUserTokens(String username) {
		logger.info("Removing Token if any for user : {}", username);
		Criteria crit = createEntityCriteria();
		crit.add(Restrictions.eq("username", username));
		PersistentLogins PersistentLogins = (PersistentLogins) crit.uniqueResult();
		if (PersistentLogins != null) {
			logger.info("rememberMe was selected");
			delete(PersistentLogins);
		}

	}

	public void updateToken(String seriesId, String tokenValue, Date lastUsed) {
		logger.info("Updating Token for seriesId : {}", seriesId);
		PersistentLogins PersistentLogins = getByKey(seriesId);
		PersistentLogins.setToken(tokenValue);
		PersistentLogins.setLast_used(lastUsed);
		update(PersistentLogins);
	}

}
