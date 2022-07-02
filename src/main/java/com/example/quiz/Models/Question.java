package com.example.quiz.Models;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;
import org.springframework.data.mongodb.core.mapping.MongoId;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder

@Document(collection = "QuestionsList")
public class Question {
    @MongoId
    private String questionId;

    private String correctOption;


    private String language;

    private String question;

    private String option1;

    private String option2;

    private String option3;

    private String option4;



    private String tag1;

    private String tag2;

}
