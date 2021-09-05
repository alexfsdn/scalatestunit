package com.reactive.reactive.services;

import com.reactive.reactive.models.Livro;
import com.reactive.reactive.repository.LivroRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;

@Service
public class LivroServiceImpl implements LivroService {

    @Autowired
    private LivroRepository livroRepository;

    @Override
    public Flux<Livro> findAll() {
        return livroRepository.findAll();
    }

    @Override
    public Mono<Livro> findById(String id) {
        UUID uuid = UUID.fromString(id);
        return livroRepository.findById(uuid);
    }

    @Override
    public Mono<Livro> save(Livro livro) {
        return livroRepository.save(livro);
    }
}
