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
public class execicio15 {
    public static void main(String[] args) {
        int num;
        
        Scanner leitor = new Scanner(System.in);
        System.out.println("digite um numero numero  :");
        num = leitor.nextInt();
        
        if(num >= 100 && num <= 200){
         System.out.println("O numero esta no intervalo.");
        }else {
         System.out.println("o numero Não está no intervalo. ");
        }
    }
}
