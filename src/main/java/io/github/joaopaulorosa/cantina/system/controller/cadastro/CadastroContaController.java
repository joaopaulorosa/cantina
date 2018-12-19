/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.system.controller.cadastro;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 * @author joao
 */
@RestController
public class CadastroContaController {
    
    @RequestMapping(value="/hello")
    public ModelAndView hello(){
        return new ModelAndView("hello");
    }
    
    @RequestMapping(value="/cadastroConta")
    public ModelAndView cadastroConta(){
        return new ModelAndView("paginas/cadastro/cadastroConta");
    }
    
    @RequestMapping(value="/userdetails",method=RequestMethod.GET,produces="application/json")
    public UserDetails userdetails(){
        UserDetails userDetails = new UserDetails();
        userDetails.setName("JavaInterviewPoint");
        userDetails.setDepartment("Blogging");
        
        return userDetails;
    }    
}
