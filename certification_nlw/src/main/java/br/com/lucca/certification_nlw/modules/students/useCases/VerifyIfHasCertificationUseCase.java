package br.com.lucca.certification_nlw.modules.students.useCases;

import org.springframework.stereotype.Service;

import br.com.lucca.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

@Service // significa essa será a camada de serviço
public class VerifyIfHasCertificationUseCase {
    
    public boolean execute( VerifyHasCertificationDTO dto ) {
        if (dto.getEmail().equals("luaccminerva2323@outlook.com") && dto.getTechnology().equals("Java")) {
            return true;
        } else {
            return false;
        }
    }
}
