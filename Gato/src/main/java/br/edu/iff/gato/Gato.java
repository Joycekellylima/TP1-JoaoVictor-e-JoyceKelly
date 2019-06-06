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
public class Gato {

    String nome;
    int idade;
    int registro;
    Gato raça;
    boolean macho;

    public Gato(String n) {
        this.nome = n;
    }

    public void miado() {
        if (idade >= 2) {
            System.out.print("Meow");
        } else {
            System.out.print("miau");
        }
    }
}
