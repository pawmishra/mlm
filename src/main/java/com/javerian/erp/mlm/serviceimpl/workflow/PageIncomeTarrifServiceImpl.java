package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.PageIncomeTarrifDao;
import com.javerian.erp.mlm.model.workflow.PageIncomeTarrif;
import com.javerian.erp.mlm.service.workflow.PageIncomeTarrifService;

@Service
public class PageIncomeTarrifServiceImpl implements PageIncomeTarrifService {

	@Autowired
	PageIncomeTarrifDao pageincometarrifDao;

	@Override
	public PageIncomeTarrif findById(Long id) {

		return pageincometarrifDao.findById(id);
	}

	@Override
	public boolean save(PageIncomeTarrif pageIncomeTarrif) {

		return pageincometarrifDao.save(pageIncomeTarrif);
	}

	@Override
	public List<PageIncomeTarrif> findAllPageIncomeTarrif() {

		return pageincometarrifDao.findAllPageIncomeTarrif();
	}

}
