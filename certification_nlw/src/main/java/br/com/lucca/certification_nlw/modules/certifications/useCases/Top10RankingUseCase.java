package br.com.lucca.certification_nlw.modules.certifications.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

import br.com.lucca.certification_nlw.modules.students.entities.CertificationStudentEntity;
import br.com.lucca.certification_nlw.modules.students.repositories.CertificationStudentRepository;

@Service
public class Top10RankingUseCase {
    
    
    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public List<CertificationStudentEntity> execute() {

        var result = this.certificationStudentRepository.findTop10ByOrderByGradeDesc();

        return result;
    }
}
