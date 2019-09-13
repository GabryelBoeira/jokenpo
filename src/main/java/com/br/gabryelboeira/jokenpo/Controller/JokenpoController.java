package com.br.gabryelboeira.jokenpo.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class JokenpoController {

    @GetMapping("/exemplo/pagina")
    public String exemplo() {
        return "exemplo";
    }
}


