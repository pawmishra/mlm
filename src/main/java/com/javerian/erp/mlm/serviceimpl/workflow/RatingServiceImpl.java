package com.javerian.erp.mlm.serviceimpl.workflow;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.javerian.erp.mlm.dao.workflow.RatingDao;
import com.javerian.erp.mlm.model.workflow.Rating;
import com.javerian.erp.mlm.service.workflow.RatingService;

@Service
public class RatingServiceImpl implements RatingService {

	@Autowired
	RatingDao ratingDao;

	@Override
	public Rating findById(Long id) {

		return ratingDao.findById(id);
	}

	@Override
	public boolean save(Rating rating) {

		return ratingDao.save(rating);
	}

	@Override
	public List<Rating> findAllRating() {

		return ratingDao.findAllRating();
	}

}
