/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.infnet.tp1.JavaNuvem2;

import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

/**
 *
 * @author Eduardo
 */
@Component
public class CnpjCliente {
    public Cnpj buscaCnpj(String cnpj){
      RestTemplate template = new RestTemplate();
      return template.getForObject("https://www.receitaws.com.br/v1/cnpj/{cnpj}",Cnpj.class,cnpj);
    }
}
