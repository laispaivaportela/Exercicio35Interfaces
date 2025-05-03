/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/*
Exercício: Vamos construir Interfaces ?
Toda Ave e Cachorro produzem algum tipo de som. Ave deve cantar e Cachorro deve latir.
Além disto toda Ave e Cachorro possuem uma forma de se mover, mas cada um de seu jeito,
ou seja Ave voa e Cachorro anda.
Imagine que você precisa criar uma Interface Animal com métodos produzirSom() e mover().
Estes métodos não possuem parâmetros ou retorno. As classes Ave e Cachorro devem
IMPLEMENTAR esta Interface. Para cachorro produzirSom() escreve na tela "Latir" e a Ave
escreve "Cantar". O método mover() de cachorro escreve na tela "Andar" e a Ave "Voar". Veja
que Ave e Cachorro podem ter seus próprios atributos e métodos se você quiser. Por exemplo
nome.
Crie o programa principal para testar as classe Cachorro e Ave. Lembre-se de organizar
as classe em pacotes.
*/
package principal;

import model.Cachorro;
import model.Gato;
import model.Ave;
/**
 *
 * @author laispaivaportela
 */
import java.util.Scanner;
import model.Animal;

public class Principal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Animal: \n1.Cachorro\n2.Gato\n3.Ave");
        int escolha = input.nextInt();
        input.nextLine(); //pro input limpar a linha
        switch (escolha) {
            case 1 -> {
                Animal cachorro = new Cachorro();
                cachorro.animalzinho();
            }
            case 2 -> {
                Animal gato = new Gato();
                gato.animalzinho();
            }

            case 3 -> {
                Animal ave = new Ave();
                ave.animalzinho();
            }

        }

    }
}
