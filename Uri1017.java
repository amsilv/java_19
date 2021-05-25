import java.util.Scanner;

public class Uri1017{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int tempo, velocidade, distancia;
        double litros;

        tempo = teclado.nextInt();
        velocidade = teclado.nextInt();

        distancia = tempo * velocidade;

        litros = distancia / 12.0;

        System.out.printf("%.3f\n", litros);

    }
}