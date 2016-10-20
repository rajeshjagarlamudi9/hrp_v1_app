package com.hrp.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.hrp.dao.QuestionsDao;
import com.hrp.dao.QuestionsDaoImpl;
import com.hrp.model.Questions;

@Service("questionsService")
@Transactional("transactionManager")
public class QuestionsServiceImpl implements QuestionsService {

	@Autowired
	QuestionsDao questionsDao;
	
	@Override
	public void addQuestion(Questions question) {
		// TODO Auto-generated method stub
		questionsDao.save(question);
	}

	@Override
	public void updateQuestion(Questions question) {
		// TODO Auto-generated method stub
		questionsDao.update(question);

	}

	@Override
	public List<Questions> getTotalNumberOfQuestionsNotDeleted() {
		// TODO Auto-generated method stub
		List<Questions> questionsList = questionsDao.getTotalNumberOfQuestionsNotDeleted();
		return questionsList;
	}

	@Override
	public Questions getQuestionById(Long id) {
		// TODO Auto-generated method stub
		return questionsDao.getQuestionById(id);
	}

	@Override
	public void deleteQuestionById(Long id) {
		// TODO Auto-generated method stub
		questionsDao.deleteQuestionById(id);
	}

}
