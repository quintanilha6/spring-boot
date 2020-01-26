package com.quinta.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.quinta.springboot.model.Question;
import com.quinta.springboot.service.SurveyService;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	@GetMapping("/surveys/{_surveyId}/questions")
	public List<Question> retrieveQuestionsOfSurvey(@PathVariable String _surveyId) {
		return surveyService.retrieveQuestions(_surveyId);
	}
}
