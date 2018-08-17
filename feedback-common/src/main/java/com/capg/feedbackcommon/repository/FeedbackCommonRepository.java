package com.capg.feedbackcommon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.feedbackcommon.bean.Product;
@Repository
public interface FeedbackCommonRepository extends CrudRepository<Product, Integer> {

}
