/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria03ex02;

/**
 *
 * @author jota
 */
public class Carro {

    public String modelo, cor;
    public int ano, km;
    public double preco;
    
    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public String getCor() {
        return cor;
    }

    public void setCor(String cor) {
        this.cor = cor;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public int getKm() {
        return km;
    }

    public void setKm(int km) {
        this.km = km;
    }

    public double getPreco() {
        return preco;
    }

    public void setPreco(double preco) {
        this.preco = preco;
    }
    
   public Carro(){
       
   }
   public Carro(String modelo, String cor, int ano){
       
       this.ano = ano;
       this.cor = cor;
       this.modelo = modelo;
       
   }
   
   public Carro(String modelo, String cor, int ano, int km, double preco){
       
       this.ano = ano;
       this.cor = cor;
       this.modelo = modelo;
       this.km = km;
       this.preco = preco;
   }
    
    
}
