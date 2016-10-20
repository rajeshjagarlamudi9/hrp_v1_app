package com.hrp.rest.controller;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hrp.model.Questions;
import com.hrp.service.QuestionsService;
import com.hrp.util.ServiceStatus;

@RestController
@RequestMapping("/questions")
public class QuestionsController {

	@Autowired
	private QuestionsService questionsService;

	private Random randomGenerator;

	@RequestMapping(value = "/getRandomQuestion", method = RequestMethod.GET, produces = "application/json")
	public @ResponseBody ServiceStatus getRandomQuestionFromDB(@PathVariable("questionId") Long questionId) {
		ServiceStatus serviceStatus = new ServiceStatus();

		List<Questions> questionsList = questionsService.getTotalNumberOfQuestionsNotDeleted();

		randomGenerator = new Random();
		int index = randomGenerator.nextInt(questionsList.size());
		Questions question = questionsList.get(index);
		if (question != null) {
			serviceStatus.setResult(question);
			serviceStatus.setMessage("Successfully Retrieved a random question from the DB");
			serviceStatus.setStatus("success");
		} else {
			serviceStatus.setMessage("Could not retrieve a question from the DB. Got NULL as the random question.");
			serviceStatus.setStatus("failure");
		}
		return serviceStatus;
	}

	@RequestMapping(value = "/addQuestion", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ServiceStatus addQuestion(Questions question) {
		ServiceStatus serviceStatus = new ServiceStatus();

		try {
			questionsService.addQuestion(question);
			serviceStatus.setMessage("Successfully added a question to the DB");
			serviceStatus.setStatus("success");
		} catch (Exception ex) {
			serviceStatus.setMessage("An exception occurred : unable to add question to the DB");
			serviceStatus.setStatus("failure");
		}
		return serviceStatus;
	}

	@RequestMapping(value = "/updateQuestion", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ServiceStatus updateQuestion(Questions question) {
		ServiceStatus serviceStatus = new ServiceStatus();
		try {
			questionsService.updateQuestion(question);
			serviceStatus.setMessage("Successfully updated the given question to the DB");
			serviceStatus.setStatus("success");
		} catch (Exception ex) {
			serviceStatus.setMessage("An exception occurred : unable to update the given question to the DB");
			serviceStatus.setStatus("failure");
		}
		return serviceStatus;
	}

	@RequestMapping(value = "/deleteQuestionById/{questionId}", method = RequestMethod.POST, produces = "application/json")
	public @ResponseBody ServiceStatus deleteQuestionById(@PathVariable("questionId") Long questionId) {
		ServiceStatus serviceStatus = new ServiceStatus();
		try {
			questionsService.deleteQuestionById(questionId);
			serviceStatus.setMessage("Successfully deleted a question to the DB");
			serviceStatus.setStatus("success");
		} catch (Exception ex) {
			serviceStatus.setMessage("An exception occurred : unable to delete the question to the DB");
			serviceStatus.setStatus("failure");
		}
		return serviceStatus;
	}

}
