package com.javerian.erp.mlm.service.workflow;

import java.util.List;

import com.javerian.erp.mlm.model.workflow.Rating;

public interface RatingService {

	Rating findById(Long id);

	boolean save(Rating rating);

	List<Rating> findAllRating();
}
