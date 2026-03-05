package com.example.rh.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import com.example.rh.Repository.FuncionarioRepository;

import org.springframework.ui.Model;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;



@Controller
public class listarController{

    @Autowired
    private FuncionarioRepository fr;

    @GetMapping("/listarfuncionarios")
    public String listarFuncionarios(Model model) {
        model.addAttribute("funcionarios", fr.findAll());
        return "funcionario/listarfuncionarios";
    }
}