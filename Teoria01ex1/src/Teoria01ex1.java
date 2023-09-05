import java.util.Scanner;
import teoria01ex1.Pessoa;



/**
 *
 * @author jota
 */
public class Teoria01ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        
        Pessoa p1 = new Pessoa();
        Pessoa p2 = new Pessoa();
        Pessoa p3 = new Pessoa();
        
        System.out.println("Digite o nome da primera pessoa:");
        String nomeP1 = teclado.nextLine();
        p1.setNome(nomeP1);
        
        System.out.println("Digite o CPF da primera pessoa:");
        String cpfP1 = teclado.nextLine();
        p1.setCpf(cpfP1);
        
        System.out.println("Digite a idade da primera pessoa:");
        int idadeP1 = teclado.nextInt();
        p1.setIdade(idadeP1);
        
        teclado.nextLine();
        
        
        System.out.println("Digite o nome da segunda pessoa:");
        String nomeP2 = teclado.nextLine();
        p2.setNome(nomeP2);
        
        System.out.println("Digite o CPF da segunda pessoa:");
        String cpfP2 = teclado.nextLine();
        p2.setCpf(cpfP2);
        
        System.out.println("Digite a idade da segunda pessoa:");
        int idadeP2 = teclado.nextInt();
        p2.setIdade(idadeP2);
        
        teclado.nextLine();
        
        
        System.out.println("Digite o nome da terceira pessoa:");
        String nomeP3 = teclado.nextLine();
        p3.setNome(nomeP3);
        
        System.out.println("Digite o CPF da terceira pessoa:");
        String cpfP3 = teclado.nextLine();
        p3.setCpf(cpfP3);
        
        System.out.println("Digite a idade da terceira pessoa:");
        int idadeP3 = teclado.nextInt();
        p3.setIdade(idadeP3);
        
        System.out.println("Pessoa 1: ");
        System.out.println("CPF: " + p1.getCpf());
        System.out.println("Nome: " + p1.getNome());
        System.out.println("Idade: " + p1.getIdade());
        
        System.out.println("\nPessoa 1: ");
        System.out.println("CPF: " + p2.getCpf());
        System.out.println("Nome: " + p2.getNome());
        System.out.println("Idade: " + p2.getIdade());
        
        System.out.println("\nPessoa 3: ");
        System.out.println("CPF: " + p3.getCpf());
        System.out.println("Nome: " + p3.getNome());
        System.out.println("Idade: " + p3.getIdade());
        
        teclado.close();
        
    }
    
}
