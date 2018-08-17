package com.capg.feedbackcommon.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.capg.feedbackcommon.service.IFeedbackCommonService;

@Controller
public class FeedbackCommonController {
	
	@Autowired
	IFeedbackCommonService service;
	
	
	
	@RequestMapping("/feedbackcommon/{id}/{feedback}")
	public void addFeedbackCommon(@PathVariable int id,@PathVariable String feedback) {
		
		
		service.addFeedback(id, feedback);
		
	}
	
	
	


}
