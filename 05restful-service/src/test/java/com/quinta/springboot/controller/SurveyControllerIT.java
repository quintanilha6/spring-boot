package com.quinta.springboot.controller;

import static org.junit.Assert.assertTrue;

import java.util.Arrays;
import java.util.List;

import org.json.JSONException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.skyscreamer.jsonassert.JSONAssert;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringRunner;

import com.quinta.springboot.Application;
import com.quinta.springboot.model.Question;


/*
 *	Part 1 : Initialize and launch Spring Boot Application
 *		@RunWith(SpringRunner.class)
 *		@SpringBootTest(classes = Application.class, 
 *			webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
 *		@LocalServerPort
 *		private int port;
 *	
 *	Part2 : Invoke the url /survey/Survey1/questions/Question1
 *		private TestRestTemplate template = new TestRestTemplate();
 */

@RunWith(SpringRunner.class)
@SpringBootTest(classes = Application.class, webEnvironment = SpringBootTest.WebEnvironment.RANDOM_PORT)
class SurveyControllerIT {
	
	@LocalServerPort
	private int port;
	
	TestRestTemplate restTemplate = new TestRestTemplate();
	HttpHeaders headers = new HttpHeaders();
	
	@BeforeEach
	public void before() {
		headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	}
	
	@Test
	public void testJsonAssert() throws JSONException {
		JSONAssert.assertEquals("{id:1}", "{id:1,name:quinta}", false);
		//						expected, actual, strict
		// with strict mode on, the validator makes sure the whole content matches
	}
	
	@Test
	public void testRetrieveSurveyQuestion() throws JSONException {
		String url = createURLWithPort("/surveys/Survey1/questions/Question1");
		
		HttpEntity<String> entity = new HttpEntity<String>(null, headers);
		ResponseEntity<String> response = restTemplate.exchange(url, HttpMethod.GET, entity, String.class);
		
		String expected = "{\"id\":\"Question1\",\"description\":\"Largest Country in the World\",\"correctAnswer\":\"Russia\",\"options\":[\"India\",\"Russia\",\"United States\",\"China\"]}";

		JSONAssert.assertEquals(expected, response.getBody(), false);
	}

	@Test
	public void retrieveAllSurveyQuestions() throws Exception {
		String retrieveAllQuestions = "/surveys/Survey1/questions";
		String url = createURLWithPort(retrieveAllQuestions);

		ResponseEntity<List<Question>> response = restTemplate.exchange(url,
				HttpMethod.GET, new HttpEntity<String>("DUMMY_DOESNT_MATTER", headers),
				new ParameterizedTypeReference<List<Question>>() {
				});

		Question sampleQuestion = new Question("Question1",
				"Largest Country in the World", "Russia", Arrays.asList(
						"India", "Russia", "United States", "China"));

		assertTrue(response.getBody().contains(sampleQuestion));
	}
	
	@Test
	public void addQuestion() {
		String addQuestionURI = "/surveys/Survey1/questions/";
		String url = createURLWithPort(addQuestionURI);

		Question question = new Question("DOESNTMATTER", "Question1", "Russia",
				Arrays.asList("India", "Russia", "United States", "China"));

		HttpEntity<Question> entity = new HttpEntity<Question>(question, headers);

		ResponseEntity<String> response = restTemplate.exchange(url,
				HttpMethod.POST, entity, String.class);

		String actual = response.getHeaders().get(HttpHeaders.LOCATION).get(0);

		assertTrue(actual.contains("/surveys/Survey1/questions/"));

	}

	private String createURLWithPort(String uri) {
		return "http://localhost:" + port + uri;
	}
}
