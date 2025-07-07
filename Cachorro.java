/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package estudodecaso.loja_de_animal;


public class Cachorro extends Animal {
    public String raca;
    
    public Cachorro(String nome, int idade, String raca){
        super(nome,idade);
        this.raca = raca;
    }
    @Override
    public String emitirSom(){
        return "Nome: " + nome + " (" + raca + ") - SOM: auauau";
                
                
    }
}
