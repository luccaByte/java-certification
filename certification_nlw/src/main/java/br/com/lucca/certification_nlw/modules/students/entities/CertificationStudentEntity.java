package br.com.lucca.certification_nlw.modules.students.entities;

import java.util.UUID;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data // Coloca automaticamente os Getters e Setters (MUITO UTIL BRIGADO LOMBOK)
@AllArgsConstructor // Coloca os construtores automaticamente para todos os atributos
@NoArgsConstructor
@Entity(name = "Certifications")  // nome da entidade
public class CertificationStudentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;
    
    @JoinColumn(name = "student_id")
    private UUID studentID;

    @Column(length = 100)
    private String technology;

    @Column(length = 10)
    private int grate;

    @ManyToOne
    @JoinColumn(name = "student_id", insertable = false, updatable = false)
    private StudentEntity studentEntity;
    // List<AnswersCertificationsEntity> answersCertificationsEntity;
}
