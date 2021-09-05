package com.reactive.reactive.repository;

import com.reactive.reactive.models.Livro;
import org.springframework.data.r2dbc.repository.R2dbcRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface LivroRepository extends R2dbcRepository<Livro, UUID> {
}
