package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.LatestNews;

public interface LatestNewsService {

	LatestNews findById(Long id);

	boolean save(LatestNews latestNews);

	List<LatestNews> findAllLatestNews();

	List<LatestNews> ValidUptoLatestNews();
}
