package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.PageIncomeTarrif;

public interface PageIncomeTarrifService {

	PageIncomeTarrif findById(Long id);

	boolean save(PageIncomeTarrif pageincomeTarrif);

	List<PageIncomeTarrif> findAllPageIncomeTarrif();
}
