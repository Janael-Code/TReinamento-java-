/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package heranca;

import java.util.Date;

/**
 *
 * @author janae
 */
public class Main {
    public static void main(String[] args) {
         vendedor v = new vendedor();
         v.setSalario(100.00f);
         v.setNome("janael");
         v.setCpf("077.582.465-83");
         v.setDataNascimento(new Date());
         v.setComissao(10.0f);
         v.setTotalVendido(10);
         
         System.out.println("O salario é "+ v.calcularSalario());
         
         
         motorista m = new motorista();
    }
}
