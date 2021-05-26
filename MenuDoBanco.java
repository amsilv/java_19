import java.util.Scanner;

public class MenuDoBanco{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int opcao;

        do{
            System.out.println("======= IsiTAU =========");
            System.out.println(" Digite: ");
            System.out.println(" 1 - Deposito");
            System.out.println(" 2 - Saque");
            System.out.println(" 3 - Extrato");
            System.out.println(" 0 - Encerrar");
            opcao = teclado.nextInt();

            switch(opcao){
                case 1: 
                    System.out.println(" ---- aqui entra o modulo de deposito");
                    break;
                case 2: 
                    System.out.println(" ---- aqui entra o modulo de saque");
                    break;
                case 3: 
                    System.out.println(" ---- aqui entra o modulo de extrato");
                    break;                  
                case 0: 
                    System.out.println(" Obrigado pela preferencia!!!");
                    break;                     
                default:
                    System.out.println("Opcao INVALIDA!");
            }
        } while (opcao != 0);
    }
}