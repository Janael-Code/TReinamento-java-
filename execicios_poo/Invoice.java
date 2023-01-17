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
public class Invoice {

    private int codicoItem;
    private String descricao;
    private int quantidade;
    private float precoUnitario;

    public Invoice(int codicoItem, String descricao, int quantidade, float precoUnitario) {
        this.setCodicoItem(codicoItem);
        this.setDescricao(descricao);
        this.setPrecoUnitario(precoUnitario);
        this.setQuantidade(quantidade);

    }

    public double getInvoiceAmout() {
        return quantidade * precoUnitario;
        
    }

    public int getCodicoItem() {
        return codicoItem;
    }

    public void setCodicoItem(int codicoItem) {
        this.codicoItem = codicoItem;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        if (quantidade < 0) {
            this.quantidade = 0;
        } else {

            this.quantidade = quantidade;
        }

    }

    public float getPrecoUnitario() {
        return precoUnitario;
    }

    public void setPrecoUnitario(float precoUnitario) {
        if (precoUnitario < 0) {
            this.precoUnitario = 0;

        } else {
            this.precoUnitario = precoUnitario;
        }
    }

}
