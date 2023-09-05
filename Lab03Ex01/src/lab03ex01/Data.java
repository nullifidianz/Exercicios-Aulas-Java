
package lab03ex01;


public class Data {
    private int dia, mes, ano;
    private String mesTexto;

    public String getMesTexto() {
        return mesTexto;
    }

    public void setMesTexto(String mesTexto) {
        this.mesTexto = mesTexto;
    }
    
    
    
    public int getDia() {
        return dia;
    }

    public void setDia(int dia) {
        this.dia = dia;
    }

    public int getMes() {
        return mes;
    }

    public void setMes(int mes) {
        this.mes = mes;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }
    
    public void converteInt(int mes){
        switch(mes){
            case 1 -> this.mesTexto = "Janeiro";
            case 2 -> this.mesTexto = "Fevereiro";
            case 3 -> this.mesTexto = "Março";
            case 4 -> this.mesTexto = "Abril";
            case 5 -> this.mesTexto = "Maio";
            case 6 -> this.mesTexto = "Junho";
            case 7 -> this.mesTexto = "Julho";
            case 8 -> this.mesTexto = "Agosto";
            case 9 -> this.mesTexto = "Setembro";
            case 10 -> this.mesTexto = "Outubro";
            case 11 -> this.mesTexto = "Novembro";
            case 12 -> this.mesTexto = "Dezembro";
                
        }
        
        
    }
    
    public void converteString(String mesTexto){
        switch(mesTexto){
            case "Janeiro" -> this.mes = 1;
            case "Fevereiro"-> this.mes = 2;
            case "Março" -> this.mes = 3;
            case "Abril" -> this.mes = 4;
            case "Maio" -> this.mes = 5;
            case "Junho" -> this.mes = 6;
            case "Julho" -> this.mes = 7;
            case "Agosto" -> this.mes = 8;
            case "Setembro" -> this.mes = 9;
            case "Outubro" -> this.mes = 10;
            case "Novembro" -> this.mes = 11;
            case "Dezembro" -> this.mes = 12;
        }
        
    }
    
    
    
    

    public Data(int dia, int ano){
        this.ano = ano;
        this.dia = dia;
        this.mes = 1;
        this.mesTexto = "Janeiro";
        
    }

    public Data(int dia, int mes, int ano) {
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
        converteInt(mes);
    }
    
    public Data(int dia, String mesTexto, int ano){
        this.dia = dia;
        this.mesTexto = mesTexto;
        this.ano = ano;
    }

    @Override
    public String toString() {
        return "Data{" + "mes=" + mes + ", dia=" + dia + ", ano=" + ano + "\n" + 
                "mes =" + mesTexto + ", dia=" + dia + ", ano=" + ano + "\n" + 
                ", dia=" + dia + ", ano=" + ano +'}';
        
       
    }
    
    
    
    
    
    
}
