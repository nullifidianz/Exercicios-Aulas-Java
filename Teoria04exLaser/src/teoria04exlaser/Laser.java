/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package teoria04exlaser;

/**
 *
 * @author jota
 */
class Laser {
    private String nome;
    private float fabricante, precisao, medida;
    
    public Laser(){
        
    }
    
    public Laser(String nome, float fabricante, float precisao, float medida) {
        this.nome = nome;
        this.fabricante = fabricante;
        this.precisao = precisao;
        this.medida = medida;
    }
    
    

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public float getFabricante() {
        return fabricante;
    }

    public void setFabricante(float fabricante) {
        this.fabricante = fabricante;
    }

    public float getPrecisao() {
        return precisao;
    }

    public void setPrecisao(float precisao) {
        this.precisao = precisao;
    }

    public float getMedida() {
        return medida;
    }

    public void setMedida(float medida) {
        this.medida = medida;
    }

    @Override
    public String toString() {
        return "Laser{" + "nome=" + nome + ", fabricante=" + fabricante + ", precisao=" + precisao + ", medida=" + medida + '}';
    }
    
    
    
    
}
