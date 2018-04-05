package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.PageIncomeTarrif;

public interface PageIncomeTarrifDao {

	PageIncomeTarrif findById(Long id);

	boolean save(PageIncomeTarrif pageincomeTarrif);

	List<PageIncomeTarrif> findAllPageIncomeTarrif();
}
