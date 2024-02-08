package br.com.lucca.certification_nlw.modules.students.useCases;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.lucca.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;
import br.com.lucca.certification_nlw.modules.students.repositories.CertificationStudentRepository;

@Service // significa essa será a camada de serviço
public class VerifyIfHasCertificationUseCase {
    
    @Autowired
    private CertificationStudentRepository certificationStudentRepository;

    public boolean execute( VerifyHasCertificationDTO dto ) {
        var result = this.certificationStudentRepository.findByStudentEmailAndTechnology(dto.getEmail(), dto.getTechnology());
        if (!result.isEmpty()) {
            return true;
        } else {
            return false;
        }
    }
}
