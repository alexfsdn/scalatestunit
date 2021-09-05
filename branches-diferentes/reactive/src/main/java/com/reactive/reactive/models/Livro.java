package com.reactive.reactive.models;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;
import java.util.UUID;

@Data
@Entity
@Table(name = "LIVRO")
public class Livro implements Serializable {
    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID id;

    @Column(name = "nome")
    private String nome;

    @Column(name = "capa_dura")
    private boolean capaDura;

    @Column(name = "numero_paginas")
    private int numeroPaginas;

    @Column(name = "nome_da_editora")
    private String nomeDaEditora;

}