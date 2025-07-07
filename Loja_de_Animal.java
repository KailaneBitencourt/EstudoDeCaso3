/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package estudodecaso.loja_de_animal;


public class Loja_de_Animal {

    public static void main(String[] args) {
        Animal[] animais = new Animal[3];

        animais[0] = new Cachorro("Chocolate", 3, "Pinscher"); 
        animais[1] = new Gato("Mingau", 5, "Laranja");
        animais[2] = new Ave("Blue", 1, "Arara");

        for (Animal item : animais) {
            System.out.println(item.emitirSom());
        }
    }
}
