
package teoria03ex05;


public class ContaComum {
   private int numero, senha;
   private int situacao = 1;
   private String data, data_enc;
   private double saldo;

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public int getSenha() {
        return senha;
    }

    public void setSenha(int senha) {
        this.senha = senha;
    }

    public int getSituacao() {
        return situacao;
    }

    public void setSituacao(int situacao) {
        this.situacao = situacao;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getData_enc() {
        return data_enc;
    }

    public void setData_enc(String data_enc) {
        this.data_enc = data_enc;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public ContaComum() {
    }

    public ContaComum(int numero, int senha, String data, String data_enc, double saldo) {
        this.numero = numero;
        this.senha = senha;
        this.data = data;
        this.data_enc = data_enc;
        this.saldo = saldo;
    }

    @Override
    public String toString() {
        return "ContaComum{" + "numero=" + numero + ", senha=" + senha + ", situacao=" + situacao + 
                ", data=" + data + ", data_enc=" + data_enc + ", saldo=" + saldo + '}';
    }
   
    
   
}
