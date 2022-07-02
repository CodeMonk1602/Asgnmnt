package com.example.quiz.Service;

import com.example.quiz.Models.Question;

import java.util.List;

public interface QuestionService {
    Question createQuestionBody(Question qsn);


    List<Question> getQuestionByLanguage(String qsnLanguage, int noOfQsns);

    List<Question> getQuestionByLanguageAndTag(String qsnLanguage, String qsnTag);

    List<Question> getQuestionByLanguageAndtag(String qsnLanguage, String qsnTag);
}
