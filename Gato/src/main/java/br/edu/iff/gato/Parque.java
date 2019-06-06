/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package br.edu.iff.gato;

/**
 *
 * @author aluno
 */
public class Parque {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Gato kitten = new Gato ("Bolinha");
        kitten.nome = "Bolinha";
        kitten.miado();
        System .out.print("miau");
        Gato.kitten = new Gato ("Bob");
        kitten.nome = "Bob";
        kitten.miado();
        System .out.print("miau");
              
    }
    
}