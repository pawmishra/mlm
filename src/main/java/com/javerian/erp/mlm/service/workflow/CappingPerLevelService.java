package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.CappingPerLevel;


public interface CappingPerLevelService {

	CappingPerLevel findById(Long id);

	boolean save(CappingPerLevel cappingPerLevel);

	List<CappingPerLevel> findAllCappingPerLevel();

}
