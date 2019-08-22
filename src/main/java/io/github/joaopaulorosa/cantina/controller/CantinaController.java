package io.github.joaopaulorosa.cantina.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

@RestController
public class CantinaController {
	
	@RequestMapping(value="/login")
    public ModelAndView login(){
        return new ModelAndView("index");
    }

}
