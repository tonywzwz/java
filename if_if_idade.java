import java.util.Scanner;

public class oitava_tiv {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in); 

        int idade;

        System.out.println("Digite a sua idade: ");
        idade = sc.nextInt();

        if (idade < 12) {

            System.out.println("Você é uma criança.");
            
        }

        else if (idade < 17) {

            System.out.println("Você é um adolescente.");
            
        }

        else if (idade < 58) {

            System.out.println("Você é um adulto.");

        } else {

            System.out.println("Você é um idoso");

        }




        sc.close();



    }

}
