package execicios;

import java.util.Scanner;

/**
 * 02 Faça um algoritmo que receba dois números e ao final mostre a soma,
 * subtração, multiplicação e a divisão dos dois números lidos.
 *
 * @author janae
 */
public class Execicio02 {

    public static void main(String[] args) {

        Scanner Opcao = new Scanner(System.in);

        System.out.println("Escolha uma opcao:\n A-Soma \n B- Subtração \n C-divisão \n D-Multiplicação \n :");
        String opcao = Opcao.next();

        System.out.println("Digite o primeiro Numero :");
        float n1 = Opcao.nextFloat();

        System.out.println("Digite o primeiro Segundo Numero :");
        float n2 = Opcao.nextFloat();

        if ("A".equals(opcao) || "a".equals(opcao)) {
            float result = n1 + n2;

            System.out.println("Seu resultado de soma e :" + result);

        } else if ("B".equals(opcao) || "b".equals(opcao)) {
            float result = n1 - n2;

            System.out.println("Seu resultado de Subtração e :" + result);
        } else if ("C".equals(opcao) || "c".equals(opcao)) {
            float result = n1 / n2;

            System.out.println("Seu resultado de Divisão e :" + result);
        } else if ("D".equals(opcao) || "d".equals(opcao)) {
            float result = n1 * n2;

            System.out.println("Seu resultado de Multiplicação e :" + result);
        }
    }
}
