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
public class execicio04 {
    public static void main(String[] args) {
        float pocetagem =  (float) (15.0 / 100.0);
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite seu nome  :");
        String nome = leitor.next();
        
        System.out.println("Digite seu salario !  :");
        float salarioF = leitor.nextFloat();
        
        System.out.println("Digite quantos $ Reais foram vendidos no mês !  :");
        int totalVendido = leitor.nextInt();
        
        float salarioTotal =  salarioF + (totalVendido * pocetagem) ;
        
        System.out.println("O Vendedor(a): "+nome+" Com o salario fixo de "+salarioF+" salario + comissâo = "+salarioTotal);
    }
}
