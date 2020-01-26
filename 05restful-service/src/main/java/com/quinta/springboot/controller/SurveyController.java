package com.quinta.springboot.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.quinta.springboot.model.Question;
import com.quinta.springboot.service.SurveyService;

@RestController
public class SurveyController {
	
	@Autowired
	private SurveyService surveyService;
	
	
	/***********
	*	GETS   *
	***********/
	@GetMapping("/surveys/{_surveyId}/questions")
	public List<Question> retrieveQuestionsOfSurvey(@PathVariable String _surveyId) {
		return surveyService.retrieveQuestions(_surveyId);
	}
	
	@GetMapping("/surveys/{_surveyId}/questions/{_questionId}")
	public Question retrieveDetailsForQuestion(@PathVariable String _surveyId, @PathVariable String _questionId) {
		return surveyService.retrieveQuestion(_surveyId, _questionId);
	}
	
	/***********
	*	POSTS  *
	***********/
	PostMapping("/surveys/{_surveyId}/questions/")
	public Question addQuestionToSurvey(@PathVariable String _surveyId, @RequestBody Question _newQuestion) {
		Question question = surveyService.addQuestion(_surveyId, _newQuestion);
		
		URI location = ServletUriComponentsBuilder.fromCurrentRequest().path("/{id}").buildAndExpand(question.getId()).toUri();
	}
}

