package br.com.lucca.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucca.certification_nlw.modules.questions.repositories.QuestionRepository;
import br.com.lucca.certification_nlw.modules.students.dto.StudentCertificationAnswersDTO;
import br.com.lucca.certification_nlw.modules.students.repositories.StudentRepository;
import br.com.lucca.certification_nlw.modules.questions.entities.QuestionEntity;

import java.util.List;

@Service
public class StudentCertificationAnswersUseCase {
    
    @Autowired
    private StudentRepository studentRepository;

    @Autowired
    private QuestionRepository questionRepository;

    public void execute(StudentCertificationAnswersDTO dto) throws Exception {
        // verificar se o usuario existe

        var student = studentRepository.findByEmail(dto.getEmail());

        if (student.isEmpty()) {
            throw new Exception("E-mail do estudante incorreto.");
        }

        // buscar as alternativas das perguntas
        // - correct or incorrect

        List<QuestionEntity> questionsEntity = questionRepository.findByTechnology(dto.getTechnology());

        dto.getQuestionAnswers()
            .stream().forEach(questionAnswer -> {
                var question = questionsEntity.stream().filter(q -> q.getId().equals(questionAnswer.getQuestionID()))
                .findFirst().get();

                var findCorrectAlternative = question.getAlternatives().stream()
                .filter(alternative -> alternative.isCorrect()).findFirst().get();

                if (findCorrectAlternative.getId().equals(questionAnswer.getAlternativeID())) {
                    questionAnswer.setCorrect(isCorrect:true);
                } else {
                    questionAnswer.setCorrect(isCorrect:false);
                }
            });

        return dto;

        // salvar as informações da certificação
    }
}
