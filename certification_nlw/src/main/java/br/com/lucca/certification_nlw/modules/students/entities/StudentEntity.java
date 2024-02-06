package br.com.lucca.certification_nlw.modules.students.entities;

import java.util.UUID;
import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Coloca automaticamente os Getters e Setters (MUITO UTIL BRIGADO LOMBOK)
@AllArgsConstructor // Coloca os construtores automaticamente para todos os atributos
@NoArgsConstructor  
public class StudentEntity {
    
    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntity;
}
