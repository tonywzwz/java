import java.util.Scanner;

public class segunda_tiv {
    
public static void main(String[] args) {
    
    Scanner scanner = new Scanner(System.in);

    System.out.println("Digite o valor da força(em Nwtows): ");
    double força = scanner.nextDouble();

    System.out.println( "Digite a distância percorrida(em metros): ");
    double distancia = scanner.nextDouble();

    double trabalho = força * distancia;

    System.out.println("O trabalho realizado é: " + trabalho + " Joules.");

    scanner.close();






























}

}
