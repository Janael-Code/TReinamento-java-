/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;
import java.util.Scanner;
/**
 *
 * @author janae
 */
public class aula01 {
    public static void main(String[] args) {
        
        aula01_pessoa objetopessoa = new aula01_pessoa();
        
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite o peso da pessoa :");
        objetopessoa.setPeso (leitor.nextFloat());
        
        System.out.println("Digite a altura da pessoa :");
        objetopessoa.setAltura (leitor.nextFloat());
        
        System.out.println("IMC = " + objetopessoa.calcularIMC());
    }
}
