package br.com.lucca.certification_nlw.modules.students.entities;

import java.util.UUID;
import java.util.List;

public class StudentEntity {
    
    private UUID id;
    private String email;
    private List<CertificationStudentEntity> certificationStudentEntity;
}
