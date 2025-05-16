package com.soumya.quiz.service;

import com.soumya.quiz.entity.QuizQuestion;
import com.soumya.quiz.repo.QuestionRepo;
import com.soumya.quiz.repo.QuestionRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class QuestionService {

    @Autowired
    QuestionRepo questionRepo;

    public List<QuizQuestion> getAllQuestions(String category)
    {
        List<QuizQuestion> questionRepoAll = questionRepo.findByCategory(category);
        return questionRepoAll;
    }

    public QuizQuestion saveQuestion(QuizQuestion question){
        QuizQuestion save = questionRepo.save(question);
        return save;
    }
}