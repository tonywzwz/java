import java.util.Scanner;

public class sexta_tiv {
    
    public static void main(String[] args) {
        
    Scanner sc = new Scanner(System.in);

    System.out.println("Digite o primeiro número: ");
    int primeironumero = sc. nextInt();

    System.out.println("Digite o segundo número: ");
    int segundonumero = sc. nextInt();

    if (primeironumero > segundonumero) {

        System.out.println("Primeiro número maior.");

    } else if (segundonumero > primeironumero){

    System.out.println("Segundo número maior");
    
    } else {

        System.out.println("Iguais.");

    }

    sc.close();




























    }

}
