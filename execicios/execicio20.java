/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicios;

import java.util.Scanner;

/**
 *
 * A concessionária de veículos “CARANGO VELHO” está vendendo os seus veículos
 * com desconto. Faça um algoritmo que calcule e exiba o valor do desconto e o
 * valor a ser pago pelo cliente de vários carros. O desconto deverá ser
 * calculado de acordo com o ano do veículo. Até 2000 - 12% e acima de 2000 -
 * 7%. O sistema deverá perguntar se deseja continuar calculando desconto até
 * que a resposta seja: “(N) Não”. Informar total de carros com ano até 2000 e
 * total geral;
 */
public class execicio20 {

    public static void main(String[] args) {

        int ano;
        float valorVeiculo = 0.0f;
        String avanca = "";
        Scanner leitor = new Scanner(System.in);
        float porcentagemDesconto = 0.0f;
        float valorDes = 0.0f;
        int cont;

        System.out.println("--------Seja bem-vindo------- \n -----Loja Carango Velho-------");
        System.out.println("Quer comprar um veiculo ? S ou N  :");
        avanca = leitor.next();
        
        if ("s".equals(avanca) || "S".equals(avanca)) {
            
            boolean repetir = true;
            while (repetir == true) {

                System.out.println("Digite o ano do veiculo");
                ano = leitor.nextInt();
                
                System.out.println("Digite o valor ");
                valorVeiculo = leitor.nextFloat();
                if(ano <= 2000){
                // 12%
                porcentagemDesconto = 0.12f;
                
                float valorDesconto = valorVeiculo * porcentagemDesconto;
                System.out.println("Valor final = " + valorDesconto);
                
                System.out.println("1- Tentar dnv \n 2- sair :");
                cont = leitor.nextInt();
                if(cont == 1){
                    System.out.println("Ok---------=-------- reiniciando");
                }else{
                    System.out.println("Ok--------- Muito-obrigado--");
                 break;
                }
                
                }else{
                //7%
                porcentagemDesconto = 0.07f;
                float valorDesconto = valorVeiculo * porcentagemDesconto;
                System.out.println("Valor final = " + valorDesconto);
                
                System.out.println("1- Tentar dnv \n 2- sair :");
                cont = leitor.nextInt();
                
                if(cont == 1){
                    System.out.println("Ok---------=-------- reiniciando");
                }else{
                    System.out.println("Ok--------- Muito-obrigado--");
                 break;
                }
                
                }

            }
        } else {
            System.out.println("Até a proxima meu nobre");
        }
    }
}
