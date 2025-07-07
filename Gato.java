/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.loja_de_animal;


public class Gato extends Animal{
    public String pelagem;
    
    public Gato(String nome, int idade, String pelagem){
        super(nome,idade);
        this.pelagem = pelagem;
    }
    
    @Override
    public String emitirSom(){
        return "Nome: " + nome + " (" + pelagem + ") - SOM: MIAU MIAU";
    }
    
}
