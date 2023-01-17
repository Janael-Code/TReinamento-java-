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
public class execicio03 {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o total de Km rodados :");
        float km = leitor.nextInt();
        
        System.out.println("Digite o total Cobustivel gasto :");
        float combustivel = leitor.nextInt();
        
       float total = km /combustivel;
       
       System.out.println("Seu veiculo esta fazendo "+total+" por km rodado");
    }
}
