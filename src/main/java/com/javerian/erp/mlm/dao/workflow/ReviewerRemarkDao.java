package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.ReviewerRemark;

public interface ReviewerRemarkDao {

	ReviewerRemark findById(Long id);

	boolean save(ReviewerRemark reviewerRemark);

	List<ReviewerRemark> findAllReviewerRemark();

	public List<ReviewerRemark> findByReviewerId(Long id);

	public Integer getAssignedProject(Long user_id);

}
