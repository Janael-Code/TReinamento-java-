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
public class vendedor extends funcionario {

    private int totalVendido;
    private float comissao;

    public vendedor() {
        super();
    }
    public float calcularSalario(){
     return super.getSalario() + (this.comissao*totalVendido);
    }

    public int getTotalVendido() {
        return totalVendido;
    }

    public void setTotalVendido(int totalVendido) {
        this.totalVendido = totalVendido;
    }

    public float getComissao() {
        return comissao;
    }

    public void setComissao(float comissao) {
        this.comissao = comissao;
    }
    
}
