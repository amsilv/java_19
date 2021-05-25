import java.util.Scanner;

public class Uri1005{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, media;

        n1 = teclado.nextDouble();
        n2 = teclado.nextDouble();

        media = (n1 * 3.5 + n2 * 7.5)/11.0;

        System.out.printf("MEDIA = %.5f\n", media);
    }
}