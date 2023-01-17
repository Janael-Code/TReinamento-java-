package execicios;

import java.util.Scanner;

/**
 *
 * Faça um algoritima que receba n: numeros e mostre se e positivo ou negativo
 * ou zero para cada numero
 */
public class execicio24 {

    public static void main(String[] args) {

        Scanner leitor = new Scanner(System.in);

        char continuar = 'S';
        
        

        while (continuar == 's' || continuar == 'S') {
             System.out.println("Digite um Numero :  ");
            int numero = leitor.nextInt();

            if (numero == 0) {
                System.out.println("O Numero e zero");
            } else if (numero > 0) {
                System.out.println("O numero e positivo");
            }else{
                System.out.println("O numero e negativo");
            }
            
            System.out.println("Deseja continuar  S - Sim \n N - Não ? : ");
            continuar = leitor.next().charAt(0);
        }
    }
}
