package br.com.lucca.certification_nlw.modules.students.entities;

import java.util.UUID;
import java.util.List;

public class CertificationStudentEntity {
    
    private UUID id;
    private UUID studentID;
    private String technology;
    private int grate;
    List<AnswersCertificationsEntity> answersCertificationsEntity;
}
