package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.CappingPerLevel;

public interface CappingPerLevelDao {

	CappingPerLevel findById(Long id);

	boolean save(CappingPerLevel cappingPerLevel);

	List<CappingPerLevel> findAllCappingPerLevel();

}
