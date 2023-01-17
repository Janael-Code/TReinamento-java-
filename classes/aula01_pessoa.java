/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classes;

/**
 *
 * @author janae
 */
public class aula01_pessoa {
    //atributos
    
    private float peso;
    private float altura;
    
    //metodo Construtor
    public aula01_pessoa(){
    
        this.altura = altura;
        this.peso = peso;
    }
    //metodo
    public float calcularIMC(){
    
        float imc = peso / (altura * altura);
        return imc;
        
    }
    
    public void setPeso(float peso){
    this.peso = peso;
    }
    
    public void setAltura(float altura){
    this.peso = altura;
    }
    
    public float getPeso(){
    return peso;
    }
    
    public float getAltura(){
    return altura;
    }
}
