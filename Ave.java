/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.loja_de_animal;


public class Ave extends Animal{
    public String tipo;
    
    public Ave(String nome, int idade, String tipo){
        super(nome, idade);
        this.tipo = tipo;
    }
    
    @Override
    public String emitirSom(){
        return "Nome: " + nome + " (" + tipo + ") - SOM: PIIIII";
    }
}
