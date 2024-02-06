package br.com.lucca.certification_nlw.modules.students.entities;

import java.util.UUID;
import java.util.List;

public class AnswersCertificationsEntity {
    

    private UUID id;
    private UUID certificationID;
    private UUID studentID;
    private UUID questionID;
    private UUID answerID;
    private boolean isCorrect;
}
