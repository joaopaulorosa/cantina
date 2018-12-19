/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package io.github.joaopaulorosa.cantina.system.controller.cadastro;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;

/**
 *
 * @author joao
 */
@XmlRootElement
@XmlAccessorType(XmlAccessType.FIELD)
public class UserDetails {
    @XmlAttribute
    private String name;
    @XmlAttribute
    private String department;
    public UserDetails(){
        super();
    }
    public UserDetails(String name, String department){
        super();
        this.name = name;
        this.department = department;
    }
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getDepartment(){
        return department;
    }
    public void setDepartment(String department){
        this.department = department;
    }
}
