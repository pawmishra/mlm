package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.ReviewerRemark;

public interface ReviewerRemarkService {

	ReviewerRemark findById(Long id);

	boolean save(ReviewerRemark reviewerRemark);

	List<ReviewerRemark> findAllReviewerRemark();
}
