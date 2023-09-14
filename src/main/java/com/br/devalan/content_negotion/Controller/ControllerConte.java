package com.br.devalan.content_negotion.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.br.devalan.content_negotion.Entity.Funcionario;
import com.br.devalan.content_negotion.Service.ServiceFuncio;

@RestController
@RequestMapping(value = "/funionarios")
public class ControllerConte {
    private ServiceFuncio serviceFuncio;

    public ControllerConte(ServiceFuncio serviceFuncio) {
        this.serviceFuncio = serviceFuncio;
    }

    @GetMapping
    public List<Funcionario> lista() {
        return serviceFuncio.lista();

    }

    @PostMapping(value = "/create")
    public List<Funcionario> createFuncio(@RequestBody Funcionario f) {
        return serviceFuncio.create(f);

    }

}
