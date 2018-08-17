package com.capg.feedbackcommon.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.capg.feedbackcommon.bean.Feedback;


@Repository
public interface FeedbackCommonRepoFeedback extends CrudRepository<Feedback, Integer>{

}
