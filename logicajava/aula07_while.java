/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicajava;

import java.util.Scanner;

/**
 *
 * estrutura while
 */
public class aula07_while {

    public static void main(String[] args) {

        int totalAlunos = 1;

        Scanner leitor = new Scanner(System.in);

        while (totalAlunos > 0) {

            System.out.println("what's is your name ?  \n :");
            String nomeAluno = leitor.nextLine();

            System.out.println("how old are you ? \n  :");
            int idadeAluno = leitor.nextInt();
            System.out.println("o nome do auluno é : " + nomeAluno + " E sua idade é :" + idadeAluno);
            
            
            totalAlunos = totalAlunos -1;
        }
    }
}
