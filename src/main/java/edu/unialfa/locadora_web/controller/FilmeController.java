package edu.unialfa.locadora_web.controller;

import edu.unialfa.locadora_web.model.Filme;
import edu.unialfa.locadora_web.repository.FilmeRepository;
import edu.unialfa.locadora_web.service.FilmeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FilmeController {

    @Autowired
    private FilmeService service;

    @RequestMapping("/")
    public String iniciar(){
        service.criarNovo();
        return "filmes";
    }
}
