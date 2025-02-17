
import java.util.Scanner;


    public class decima_tiv {
  
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int opcao = 0 ;

        while (opcao!=4) {

            System.out.println("\n===MENU===");
            System.out.println("Caixa de papelão - 1");
            System.out.println("Sacola plasatica - 2");
            System.out.println("Embalagem de vidro - 3");
            System.out.println("Cancelar - 4");
            System.out.println("Escolha uma opção:");
            opcao=sc.nextInt();

            switch (opcao) {

                case 1:
                    System.out.println("Você escolheu a caixa.");
                    break;
                case 2:
                    System.out.println("Você escoolheu a sacola plastica");
                    break;
                case 3:
                    System.out.println("Você escolheu a embalagem de vidro");
                    break;

                case 4:
                    System.out.println("Cancelar");
                    break;

            }



        }

sc.close();

    }

}
