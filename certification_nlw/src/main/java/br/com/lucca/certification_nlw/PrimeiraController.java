package br.com.lucca.certification_nlw;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("./primeiracontroller")
public class PrimeiraController {

    @GetMapping("/retornarPrimeiraController")
    public String retornoPrimeiraController() {
        return "Criando a minha primeira controller";
    }
}
