import java.util.Scanner;

public class Uri1014{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int dist;
        double qtLitros, consumo;

        dist     = teclado.nextInt();
        qtLitros = teclado.nextDouble();

        consumo = dist / qtLitros;

        System.out.printf("%.3f km/l\n",consumo);
    }
}