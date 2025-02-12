
import java.util.Scanner;

public class quarta_tiv {
    
    public static void main(String[] args) {
        
    
    Scanner  scanner = new Scanner(System.in);

    System.out.println("Digite sua idade: ");
    int idade = scanner .nextInt();

    if (idade>18) {

        System.err.println("Você é maior de idade.");
    
    }   else if (idade == 18) {

        System.err.println("Você é maior de idade.");

    }   else {

        System.err.println("Você é menor de idade.");

    }
    
        scanner.close();
      
    }
}
