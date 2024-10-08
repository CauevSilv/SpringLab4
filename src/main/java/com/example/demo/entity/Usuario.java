package com.example.demo.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "usr_usuario")
public class Usuario {
    @Id
    @Column(name = "usr_id")
    private Long id;

    @Column(name = "usr_nome")
    private String nome;

    @Column(name = "usr_senha")
    private String senha;
}
