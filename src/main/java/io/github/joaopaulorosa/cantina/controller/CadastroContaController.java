/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author joao
 */
@RestController
@RequestMapping(value="cadastroConta")
public class CadastroContaController {
    
    @RequestMapping(value="")
    public ModelAndView cadastroConta(){
        return new ModelAndView("cadastro/cadastroConta");
    }
    
    @RequestMapping(value="/buscaValidaCPF/{cpf}")
    public boolean buscaValidaCPF(@PathVariable String cpf) {
    	System.out.println(cpf);
    	return true;
    }
    
    
    
    @RequestMapping(value="/userdetails",method=RequestMethod.GET,produces="application/json")
    public UserDetails userdetails(){
        UserDetails userDetails = new UserDetails();
        userDetails.setName("JavaInterviewPoint");
        userDetails.setDepartment("Blogging");
        return userDetails;
    }
    
    
}
