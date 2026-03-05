package com.example.teste_thymeleaf;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;




@Controller
public class indexController {
    
    //Método de Requisição do tipo GET
    @GetMapping(value = "/")
    public ModelAndView abrirIndex() {
        // model para manipualação de html na página index
        ModelAndView mv = new ModelAndView("index");
        String mensagem = "Olá Visitante !";
        mv.addObject("msg", mensagem);
        return mv;
    }
    
    // criar as rotas de navegação
    //sobre
    @GetMapping("/sobre")
    public String abrirSobre() {
        return "sobre";
    }
    
    // produtos

    @GetMapping("/produto")
    public String abrirProduto() {
        return "produto";
    }

    // contato

    @GetMapping("/contato")
    public String abrirContato() {
        return "contato";
    }

    // método para enviar o formulário com o nome do usuário
    @PostMapping("/home")
    public ModelAndView postHome(@RequestParam ("nome") String nome) {
        ModelAndView mv = new ModelAndView("index");
        String mensagem = "Olá, " + nome;
        mv.addObject("msg", mensagem);
        mv.addObject("nome", "");
        return mv;
    }
    
    
    
    
}
