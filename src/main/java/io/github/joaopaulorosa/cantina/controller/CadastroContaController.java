/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.controller;

import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

import io.github.joaopaulorosa.cantina.model.cadastro.responsavel.Responsavel;

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

	@RequestMapping(value="/validaCPF/{cpf}")
	public boolean validaCPF(@PathVariable String cpf) {
		System.out.println(cpf);
		return true;
	}

	@RequestMapping(value="/buscaCPF/{cpf}")
	public Responsavel buscaCPF(@PathVariable String cpf) {
		System.out.println(cpf);

		return null;
	}


}
