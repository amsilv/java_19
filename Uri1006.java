import java.util.Scanner;

public class Uri1006{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, n3, media;
        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();
        n3 = teclado.nextDouble();

        media = (n1 * 2.0 + n2 * 3.0 + n3 * 5.0)/10;

        System.out.printf("MEDIA = %.1f\n",media);
    }
}