package com.example.quiz.Repository;

import com.example.quiz.Models.Question;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.repository.Aggregation;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface QuestionRepository extends MongoRepository<Question, String> {
    MongoTemplate questionMongoTemplate=null;
    @Query(value = "{language: ?0}")
    List<Question> findByLanguage(String qsnLanguage);

    @Query(value = "{language: ?0, tag1: ?1}")
    List<Question> findByLanguageAndTag(String qsnLanguage, String qsnTag);

    @Query(value = "{language: ?0, tag2: ?1}")
    List<Question> findByLanguageAndtag(String qsnLanguage, String qsnTag);
}
