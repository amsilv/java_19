import java.util.Scanner;

public class Uri1010{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int   codP1, qtdP1, codP2, qtdP2;
        float precoP1, precoP2, total;

        codP1   = teclado.nextInt();
        qtdP1   = teclado.nextInt();
        precoP1 = teclado.nextFloat();

        codP2   = teclado.nextInt();
        qtdP2   = teclado.nextInt();
        precoP2 = teclado.nextFloat();

        total = qtdP1 * precoP1 + qtdP2 * precoP2;

        System.out.printf("VALOR A PAGAR: R$ %.2f\n", total);
    }
}