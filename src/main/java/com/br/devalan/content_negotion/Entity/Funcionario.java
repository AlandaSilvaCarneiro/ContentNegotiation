package com.br.devalan.content_negotion.Entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "tb_f")
public class Funcionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String nome;

    public Funcionario(String nome, Double sal) {
        this.nome = nome;
        this.sal = sal;
    }

    private Double sal;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Funcionario() {
    }

    public String getNome() {
        return nome;
    }

    public Funcionario(Long id, String nome, Double sal) {
        this.id = id;
        this.nome = nome;
        this.sal = sal;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Double getSal() {
        return sal;
    }

    public void setSal(Double sal) {
        this.sal = sal;
    }
}
