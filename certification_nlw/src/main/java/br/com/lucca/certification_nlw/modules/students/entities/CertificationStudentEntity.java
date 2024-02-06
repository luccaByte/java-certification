package br.com.lucca.certification_nlw.modules.students.entities;

import java.util.UUID;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // Coloca automaticamente os Getters e Setters (MUITO UTIL BRIGADO LOMBOK)
@AllArgsConstructor // Coloca os construtores automaticamente para todos os atributos
@NoArgsConstructor  
public class CertificationStudentEntity {
    
    private UUID id;
    private UUID studentID;
    private String technology;
    private int grate;
    List<AnswersCertificationsEntity> answersCertificationsEntity;
}
