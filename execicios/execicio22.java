package execicios;

import java.util.Scanner;

/**
 *
 * faça um algoritimo que receba o preço de custo e o preço de venda de 40
 * produtos. e mostre como resultado se houve lucro,prejuizo ou empate para cada
 * produto informe o valor de custo de cada produto, o valor de venda de cada
 * produto a media de preço de custo e do preço de venda.
 */
public class execicio22 {

    public static void main(String[] args) {
        String nomeProduto = "";
        float precoCusto = 0.0f;
        float precoVenda = 0.0f;

        float totalCusto = 0.0f;
        float totalVenda = 0.0f;

        Scanner leitor = new Scanner(System.in);
        for (int i = 0; i < 40; i++) {

            System.out.println("Digite o nome do produto  : ");
            nomeProduto = leitor.next();

            System.out.println("Digite o Preço do produto :");
            precoCusto = leitor.nextFloat();

            System.out.println("Digite o preço de venda do produto : ");
            precoVenda = leitor.nextFloat();

            totalCusto = totalCusto + precoCusto;
            totalVenda = totalVenda + precoVenda;

            if (precoCusto == precoVenda) {
                System.out.println("Houve um empate entre o preço de custo e venda");
            } else if (precoCusto > precoCusto) {
                System.out.println("Prejuizo ");
            } else {
                System.out.println(" Lucro");
            }
        }

        System.out.println(nomeProduto + " Preço de custo = " + precoCusto + "preço de venda = " + precoVenda);

    }
}
