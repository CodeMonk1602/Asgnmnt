package com.example.quiz.Controller;

import com.example.quiz.Models.Question;
import com.example.quiz.Service.QuestionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController

public class QuestionController {
    @Autowired
    private QuestionService questionService;

    @PostMapping("/createQuestion")
    public Question createQuestionBody(@RequestBody Question qsn){
         return questionService.createQuestionBody(qsn);
    }
    @GetMapping("/questions/language/{language}/{number}")
    public List<Question> getQuestionByLanguage(@PathVariable("language") String qsnLanguage,
                                                @PathVariable("number") int noOfQsns){
        return questionService.getQuestionByLanguage(qsnLanguage,noOfQsns);
    }
    // searching by first tag
    @GetMapping("/questions/language/{language}/tag1/{tag}")
    public List<Question> getQuestionByLanguageAndTag(@PathVariable("language") String qsnLanguage,
                                                @PathVariable("tag") String qsnTag){
        return questionService.getQuestionByLanguageAndTag(qsnLanguage,qsnTag);
    }
    // searching by second tag
    @GetMapping("/questions/language/{language}/tag2/{tag}")
    public List<Question> getQuestionByLanguageAndtag(@PathVariable("language") String qsnLanguage,
                                                      @PathVariable("tag") String qsnTag){
        return questionService.getQuestionByLanguageAndtag(qsnLanguage,qsnTag);
    }







}
