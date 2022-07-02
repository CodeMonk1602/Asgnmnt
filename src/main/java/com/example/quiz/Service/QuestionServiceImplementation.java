package com.example.quiz.Service;

import com.example.quiz.Models.Question;
import com.example.quiz.Repository.QuestionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class QuestionServiceImplementation implements QuestionService{
    @Autowired
    public QuestionRepository questionRepository;




    @Override
    public Question createQuestionBody(Question qsn){
        System.out.println("Question Body Created");
       return questionRepository.save(qsn);
    }

    public List<Question> getQuestionByLanguage(String qsnLanguage, int noOfQsns){
        List<Question> finalQsnList = new ArrayList<>();
        List<Question> qsnList =  questionRepository.findByLanguage(qsnLanguage);
        Random randomizer = new Random();
        for (int i=0; i<noOfQsns; i++){
            int randomIndex = randomizer.nextInt(qsnList.size());
            finalQsnList.add(qsnList.get(randomIndex));
        }
        return finalQsnList;
    }
    public List<Question> getQuestionByLanguageAndTag(String qsnLanguage, String qsnTag){
        return questionRepository.findByLanguageAndTag(qsnLanguage,qsnTag);

    }
    public List<Question> getQuestionByLanguageAndtag(String qsnLanguage, String qsnTag){
        return questionRepository.findByLanguageAndtag(qsnLanguage,qsnTag);

    }




}
