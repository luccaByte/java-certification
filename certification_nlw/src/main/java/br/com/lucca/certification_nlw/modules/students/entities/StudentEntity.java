package br.com.lucca.certification_nlw.modules.students.entities;

import java.util.UUID;
import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data // Coloca automaticamente os Getters e Setters (MUITO UTIL BRIGADO LOMBOK)
@AllArgsConstructor // Coloca os construtores automaticamente para todos os atributos
@NoArgsConstructor  
@Entity (name = "students") // nome da entidade
public class StudentEntity {
    
    @Id
    @GeneratedValue(strategy = GenerationType.UUID)
    private UUID id;

    @Column(unique = true, nullable = false, length = 100) // email é unico e not null
    private String email;

    // OneToOne
    // OneToMany que é o caso da entidade estudante ( um estudante para muitas ... )
    // ManyToOne
    // ManyToMany

    @OneToMany(mappedBy = "studentEntity")
    private List<CertificationStudentEntity> certificationStudentEntity;
}
