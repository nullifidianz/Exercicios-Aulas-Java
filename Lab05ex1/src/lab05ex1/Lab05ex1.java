/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab05ex1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author jota
 */
public class Lab05ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ArrayList<Funcionario> f1 = new ArrayList<>();
        ArrayList<Gerente> g1 = new ArrayList<>();
        
        System.out.println("Digite o nome do Funcionario:");
        String nomeF1 = teclado.next();
        
        System.out.println("Digite o CPF do Funcionario:");
        long cpfF1 = teclado.nextInt();
        
        System.out.println("Digite o dia de nascimento do Funcionario:");
        int diaNascF1 = teclado.nextInt();
        
        System.out.println("Digite o mes de nascimento do Funcionario:");
        int mesNascF1 = teclado.nextInt();
        
        System.out.println("Digite o ano de nascimento do Funcionario:");
        int anoNascF1 = teclado.nextInt();
        
        System.out.println("Digite o dia de admissao do Funcionario:");
        int diaAdmF1 = teclado.nextInt();
        
        System.out.println("Digite o mes de admissao do Funcionario:");
        int mesAdmF1 = teclado.nextInt();
        
        System.out.println("Digite o ano de admissao do Funcionario:");
        int anoAdmF1 = teclado.nextInt();
        
        System.out.println("Digite o salario do Funcionario:");
        double salarioF1 = teclado.nextDouble();
        
        System.out.println("Digite o nome do Gerente:");
        String nomeG1 = teclado.next();
        
        System.out.println("Digite o CPF do Gerente:");
        long cpfG1 = teclado.nextInt();
        
        System.out.println("Digite o dia de nascimento do Gerente:");
        int diaNascG1 = teclado.nextInt();
        
        System.out.println("Digite o mes de nascimento do Gerente:");
        int mesNascG1 = teclado.nextInt();
        
        System.out.println("Digite o ano de nascimento do Gerente:");
        int anoNascG1 = teclado.nextInt();
        
        System.out.println("Digite o dia de admissao do Gerente:");
        int diaAdmG1 = teclado.nextInt();
        
        System.out.println("Digite o mes de admissao do Gerente:");
        int mesAdmG1 = teclado.nextInt();
        
        System.out.println("Digite o ano de admissao do Gerente:");
        int anoAdmG1 = teclado.nextInt();
        
        System.out.println("Digite o dia de promocao do Gerente:");
        int diaProG1 = teclado.nextInt();
        
        System.out.println("Digite o mes de promocao do Gerente:");
        int mesProG1 = teclado.nextInt();
        
        System.out.println("Digite o ano de promocao do Gerente:");
        int anoProG1 = teclado.nextInt();
        
        System.out.println("Digite o departamento do Gerente:");
        int deptG1 = teclado.nextInt();
        
        System.out.println("Digite o salario do Gerente:");
        double salarioG1 = teclado.nextDouble();
        
        Data dataNascimentoF1 = new Data(diaNascF1, mesNascF1,
                anoNascF1);
        Data dataAdmF1 = new Data(diaAdmF1, mesAdmF1, diaAdmF1);
        
        f1.add(new Funcionario(dataAdmF1, salarioF1, nomeF1,
                cpfF1, dataNascimentoF1));
        
        Data dataNascimentoG1 = new Data(diaNascF1, mesNascF1, anoNascF1);
        Data dataAdmG1 = new Data(diaAdmG1, mesAdmG1, diaAdmG1);
        Data dataProG1 = new Data(diaProG1, mesProG1, anoProG1);
        
        g1.add(new Gerente(deptG1, dataProG1,
                dataAdmG1, salarioG1, nomeG1, cpfG1,
                dataNascimentoG1));
        
        for (Funcionario funcionario : f1) {
            System.out.println("Nome:" + nomeF1);
            System.out.println("CPF:" + cpfF1);
            System.out.println("Salario:" + salarioF1);
            System.out.println("Data de nascimento:" + diaNascF1 + "/" + mesNascF1 + "/" + anoNascF1);
            System.out.println("Data de admissao:" + diaAdmF1 + "/" + mesAdmF1 + "/" + anoAdmF1);
            System.out.println();
        }
        
        for (Gerente gerente : g1) {
            System.out.println("Nome:" + nomeG1);
            System.out.println("CPF:" + cpfG1);
            System.out.println("Salario:" + salarioG1);
            System.out.println("Data de nascimento:" + diaNascG1 + "/" + mesNascG1 + "/" + anoNascG1);
            System.out.println("Data de admissao:" + diaAdmG1 + "/" + mesAdmG1 + "/" + anoAdmG1);
            System.out.println("Data de promocao:" + diaProG1 + "/" + mesProG1 + "/" + anoProG1);
            System.out.println("Departamento do gerente:" + deptG1);
            System.out.println();
        }
        teclado.close();
        
    }
    
}
