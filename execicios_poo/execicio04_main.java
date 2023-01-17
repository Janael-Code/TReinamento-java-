/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package execicios_poo;

/**
 *
 * @author janae
 */
public class execicio04_main {
    public static void main(String[] args) {
        Invoice inv = new Invoice(1,"Mousepad",-
                
                
                10,50.0f);
        
        System.out.println("Valor total = "+ inv.getInvoiceAmout());
    }
}
