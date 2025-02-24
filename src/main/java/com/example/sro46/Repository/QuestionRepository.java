package com.example.sro46.Repository;

import com.example.sro46.model.Question;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import java.util.List;

@Repository
public interface QuestionRepository extends JpaRepository<Question, Long> {

    // Поиск вопросов по тексту (без учета регистра)
    List<Question> findByTextContainingIgnoreCase(String text);
}

