package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.ReviewerRemarkDao;
import com.javerian.erp.mlm.model.workflow.ReviewerRemark;
import com.javerian.erp.mlm.service.workflow.ReviewerRemarkService;

@Service
public class ReviewerRemarkServiceImpl implements ReviewerRemarkService {

	@Autowired
	ReviewerRemarkDao reviewerremarkDao;

	@Override
	public ReviewerRemark findById(Long id) {

		return reviewerremarkDao.findById(id);
	}

	@Override
	public boolean save(ReviewerRemark reviewerRemark) {

		return reviewerremarkDao.save(reviewerRemark);
	}

	@Override
	public List<ReviewerRemark> findAllReviewerRemark() {

		return reviewerremarkDao.findAllReviewerRemark();
	}

	@Override
	public List<ReviewerRemark> findByReviewerId(Long id) {
		return reviewerremarkDao.findByReviewerId(id);
	}

}
