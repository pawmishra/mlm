package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.LatestNews;

public interface LatestNewsDao {

	LatestNews findById(Long id);

	boolean save(LatestNews latestNews);

	List<LatestNews> findAllLatestNews();
	
	List<LatestNews> ValidUptoLatestNews();

}
