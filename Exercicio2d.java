import java.util.Scanner;
public class Exercicio2d{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double d1, d2, area;

        System.out.println("Digite o valor das diagonais 1 e 2");
        d1 = teclado.nextDouble();
        d2 = teclado.nextDouble();

        area= d1 * d2;

        System.out.println("O valor da area vale = "+area);
    }
}