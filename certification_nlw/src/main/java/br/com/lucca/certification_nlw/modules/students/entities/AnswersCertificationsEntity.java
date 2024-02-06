package br.com.lucca.certification_nlw.modules.students.entities;

import java.util.UUID;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Coloca automaticamente os Getters e Setters (MUITO UTIL BRIGADO LOMBOK)
@AllArgsConstructor // Coloca os construtores automaticamente para todos os atributos
@NoArgsConstructor  
public class AnswersCertificationsEntity {
    

    private UUID id;
    private UUID certificationID;
    private UUID studentID;
    private UUID questionID;
    private UUID answerID;
    private boolean isCorrect;
}
