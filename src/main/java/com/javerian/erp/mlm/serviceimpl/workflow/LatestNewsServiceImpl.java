package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.LatestNewsDao;
import com.javerian.erp.mlm.model.workflow.LatestNews;
import com.javerian.erp.mlm.service.workflow.LatestNewsService;

@Service
public class LatestNewsServiceImpl implements LatestNewsService {

	@Autowired
	LatestNewsDao latestNewsDao;

	@Override
	public LatestNews findById(Long id) {
		return latestNewsDao.findById(id);
	}

	@Override
	public boolean save(LatestNews latestNews) {

		return latestNewsDao.save(latestNews);

	}

	@Override
	public List<LatestNews> findAllLatestNews() {
		return latestNewsDao.findAllLatestNews();
	}

}
