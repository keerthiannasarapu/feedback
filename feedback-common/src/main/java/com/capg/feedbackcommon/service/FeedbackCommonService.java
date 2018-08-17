package com.capg.feedbackcommon.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.capg.feedbackcommon.bean.Admin;
import com.capg.feedbackcommon.bean.Feedback;
import com.capg.feedbackcommon.bean.Merchant;
import com.capg.feedbackcommon.bean.Product;
import com.capg.feedbackcommon.repository.FeedbackCommonRepoFeedback;
import com.capg.feedbackcommon.repository.FeedbackCommonRepository;
import com.capg.feedbackcommon.repository.RepoMerchant;

@Service
public class FeedbackCommonService implements IFeedbackCommonService {
	Product p=new Product();
	Feedback feed=new Feedback();
	Merchant m=new Merchant();
	
	@Autowired
	FeedbackCommonRepository repo;
	
	@Autowired
	FeedbackCommonRepoFeedback repo1;
	
	@Autowired
	RepoMerchant repo2;

	@Override
	public void addFeedback(int id, String feedback) {
		// TODO Auto-generated method stub
		
		
	//	Admin admin=new Admin();
		
		p.setPid(id);
		p.setFeedback(feedback);
		feed.setFeedback(feedback);
		feed.setPid(id);
		m.setPid(id);
		m.setFeedback(feedback);
		
		

		repo1.save(feed);
		repo.save(p);
		repo2.save(m);
		
		
		
		
		
		
		
		
	}
	
	

}
