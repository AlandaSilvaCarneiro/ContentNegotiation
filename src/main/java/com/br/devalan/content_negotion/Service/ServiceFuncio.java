package com.br.devalan.content_negotion.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.br.devalan.content_negotion.Entity.Funcionario;
import com.br.devalan.content_negotion.Repository.RepositoyFun;

@Service
public class ServiceFuncio {
    private RepositoyFun repositoyFun;

    public ServiceFuncio(RepositoyFun repositoyFun) {
        this.repositoyFun = repositoyFun;
    }

    public List<Funcionario> lista() {
        List<Funcionario> fun = new ArrayList();
        fun = repositoyFun.findAll();
        return fun;
    }

    public List<Funcionario> create(Funcionario f) {
        repositoyFun.save(f);
        return lista();
    }

}
