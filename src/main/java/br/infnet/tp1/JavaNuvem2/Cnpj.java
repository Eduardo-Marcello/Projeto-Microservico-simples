/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.infnet.tp1.JavaNuvem2;

import com.fasterxml.jackson.annotation.JsonProperty;

/**
 *
 * @author Eduardo
 */
public class Cnpj {
    @JsonProperty
    private String status;
    @JsonProperty
    private String message;
    @JsonProperty
    private String cnpj;
    @JsonProperty
    private String tipo;
    @JsonProperty
    private String abertura;
    @JsonProperty
    private String nome;
    @JsonProperty
    private String fantasia;
    
    @Override
    public String toString(){
        return "CPF{" +
                "status = " + status +
                ", message: " + message +
                ", cnpj = " + cnpj +
                ", nome = " + nome +
                ", fantasia = " + fantasia +
                ", tipo = " + tipo +
                "}";
    }
}
