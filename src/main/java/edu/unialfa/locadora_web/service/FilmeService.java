package edu.unialfa.locadora_web.service;

import edu.unialfa.locadora_web.model.Filme;
import edu.unialfa.locadora_web.repository.FilmeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FilmeService {

    @Autowired
    private FilmeRepository repository;

    public void criarNovo(){
        var filme = new Filme();
        filme.setNome("The Lord of the Rings");
        repository.save(filme);
    }
}
