/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author laispaivaportela
 */
import java.util.Scanner;
public class Gato implements Animal {
    public Gato(){
        //construtor
    }
    @Override
    public void animalzinho(){
        Scanner input = new Scanner(System.in);
        System.out.printf("Digite o nome: ");
        String nome = input.nextLine();
        System.out.printf("Digite a idade: ");
        String idade = input.nextLine();
        produzirSom();
        mover();
    }
    @Override
    public void produzirSom(){
        System.out.println("Miar");
    }
    @Override
    public void mover(){
        System.out.println("Andar");
    }
}