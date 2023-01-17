/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package logicajava;

import java.util.Scanner;

public class aula02 {
    public static void main(String[] args){
        
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Escolha a Operação, A)-Soma B)-Multiplicação C)-Subtração :");
        
        String contar = sc.next();
        
        System.out.println("Digite o primeiro Numero :");
        int n1 = sc.nextInt();
        
        System.out.println("Digite o Segundo Numero :");
        int n2 = sc.nextInt();
        
        if(contar == "A"){
          float result = n1 + n2;
          
          System.out.println(result);
        }
        
    }
}
