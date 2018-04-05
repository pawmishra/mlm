package com.javerian.erp.mlm.dao.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Rating;

public interface RatingDao {

	Rating findById(Long id);

	boolean save(Rating rating);

	List<Rating> findAllRating();
}
