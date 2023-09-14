package com.br.devalan.content_negotion.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.br.devalan.content_negotion.Entity.Funcionario;

public interface RepositoyFun extends JpaRepository<Funcionario, Long> {

}
