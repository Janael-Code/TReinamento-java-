/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicios;
import java.util.Scanner;
/**
 *
 * @author janae
 */
public class execicio05 {
    public static void main(String[] args) {
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome");
        String nome = leitor.next();
        
        System.out.println("Digite a nota da prova 1 :");
        float nota1 = leitor.nextInt();
         
        System.out.println("Digite a nota da prova 2 :");
        float nota2 = leitor.nextInt();
          
        System.out.println("Digite a nota da prova 3  :");
        float nota3 = leitor.nextInt();
        
       float TotalMedia = nota1 + nota2 + nota3 / 3;
       
       System.out.println("Olá "+nome+" sua media e  : "+TotalMedia);
         
    }
}
