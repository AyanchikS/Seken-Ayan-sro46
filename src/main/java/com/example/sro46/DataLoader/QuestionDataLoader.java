package com.example.sro46.DataLoader;
import com.example.sro46.Repository.QuestionRepository;
import com.example.sro46.model.Question;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.List;

@Component
public class QuestionDataLoader implements CommandLineRunner {

    private final QuestionRepository questionRepository;

    public QuestionDataLoader(QuestionRepository questionRepository) {
        this.questionRepository = questionRepository;
    }

    @Override
    public void run(String... args) {
        if (questionRepository.count() == 0) {
            List<Question> questions = List.of(
                    new Question(null, "What is the capital of France?", "Paris"),
                    new Question(null, "Who wrote 'Romeo and Juliet'?", "William Shakespeare"),
                    new Question(null, "What is 5 + 7?", "12"),
                    new Question(null, "Which planet is known as the Red Planet?", "Mars"),
                    new Question(null, "Who painted the Mona Lisa?", "Leonardo da Vinci")
            );
            questionRepository.saveAll(questions);
            System.out.println("Test questions have been inserted into the database.");
        }
    }
}

