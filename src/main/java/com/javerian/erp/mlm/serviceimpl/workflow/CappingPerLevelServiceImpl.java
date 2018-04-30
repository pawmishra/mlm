package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.CappingPerLevelDao;
import com.javerian.erp.mlm.model.workflow.CappingPerLevel;
import com.javerian.erp.mlm.service.workflow.CappingPerLevelService;

@Service
public class CappingPerLevelServiceImpl implements CappingPerLevelService {

	@Autowired
	CappingPerLevelDao cappingPerLevelDao;

	@Override
	public CappingPerLevel findById(Long id) {
		return cappingPerLevelDao.findById(id);
	}

	@Override
	public boolean save(CappingPerLevel cappingPerLevel) {
		return cappingPerLevelDao.save(cappingPerLevel);
	}

	@Override
	public List<CappingPerLevel> findAllCappingPerLevel() {
		return cappingPerLevelDao.findAllCappingPerLevel();
	}

}
