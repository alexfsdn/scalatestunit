package com.reactive.reactive.config;

import com.reactive.reactive.models.Livro;
import com.reactive.reactive.repository.LivroRepository;
import com.reactive.reactive.services.LivroServiceImpl;
import org.springframework.boot.ApplicationRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import reactor.core.publisher.Flux;
import reactor.core.publisher.Mono;

import java.util.UUID;
import java.util.stream.Stream;

@Configuration
public class R2dbcConfiguration {

  //  @Bean
    /*ApplicationRunner init(LivroRepository repository, DatabaseClient client) {
        return args -> {
            client.sql("create table IF NOT EXISTS LIVRO" +
                    "(id varchar (255) primary key, nome varchar (255) not null, capa_dura bit, numero_paginas int, nome_da_editora varchar(255));").fetch().first().subscribe();
            //client.sql("DELETE FROM LIVRO;").fetch().first().subscribe();

            Livro livro = new Livro(UUID.randomUUID(), "Livro 1", true, 200, "Editora 1");
            Livro livro2 = new Livro(UUID.randomUUID(), "Livro 2", true, 200, "Editora 2");
            Livro livro3 = new Livro(UUID.randomUUID(), "Livro 3", true, 200, "Editora 3");
            Livro livro4 = new Livro(UUID.randomUUID(), "Livro 4", true, 200, "Editora 4");
            Livro livro5 = new Livro(UUID.randomUUID(), "Livro 5", true, 200, "Editora 5");

            repository.save(livro);
            repository.save(livro2);
            repository.save(livro3);
            repository.save(livro4);
            repository.save(livro5);

            /*
            Stream<Livro> stream = Stream.of(livro, livro2, livro3, livro4, livro5);

            // initialize the database

            repository.saveAll(Flux.fromStream(stream))
                    .then()
                    .subscribe(); // execute

        };
    }

     */

}
