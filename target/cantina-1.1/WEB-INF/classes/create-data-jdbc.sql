/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 * Author:  joao
 * Created: 30/06/2017
 */
CREATE TABLE `cantina`.`tb_chamado` (
  `id` INT NOT NULL AUTO_INCREMENT,
  `assunto` VARCHAR(256) NOT NULL,
  `status` VARCHAR(32) NOT NULL,
  `mensagem` VARCHAR(2048) NOT NULL,
  PRIMARY KEY (`id`));


