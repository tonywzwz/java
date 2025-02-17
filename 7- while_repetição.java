import java.util.Scanner;

public class setima_tiv {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int numero;

            System.out.println("Digite o numero, ao digitar um negativo encerra");
            numero = sc.nextInt();
            System.out.println("Você digitou: "+numero);

        while (numero >=0 ) {
            System.out.println("Digite o numero, ao digitar um negativo encerra");
            numero = sc.nextInt();
        }
            sc.close();

        






    

}

}
