package br.com.lucca.certification_nlw.modules.students.controllers;

import org.springframework.web.bind.annotation.RestController;

import br.com.lucca.certification_nlw.modules.students.dto.VerifyHasCertificationDTO;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@RestController
@RequestMapping("/students")
public class StudentController {

    // Preciso usar o meu USE CASE
    @Autowired
    private VerifyIfHasCertificationUseCase verifyIfHasCertificationUseCase;
    
    @PostMapping("/verifyIfHasCertification")
    public String verifyIfHasCertification(@RequestBody VerifyHasCertificationDTO verifyHasCertificationDTO) {
        // Email
        // Technology

        var result = this.verifyIfHasCertificationUseCase.execute(verifyHasCertificationDTO);
        if (result) {
            return "O usuário já fez a prova";
        } else {
            return "O usuário pode fazer a prova";
        }
        System.out.println(verifyHasCertificationDTO);
        return "Usuário está liberado para a prova";
    }
}
