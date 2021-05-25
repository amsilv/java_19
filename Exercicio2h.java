import java.util.Scanner;

public class Exercicio2h{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double diametro, raio, altura,volume;

        System.out.println("Digite o diametro e a altura do cilindro");
        diametro = teclado.nextDouble();
        altura   = teclado.nextDouble();

        raio = diametro / 2;
        volume = 3.14 * raio * raio * altura;

        System.out.printf("O volume do cilindro vale %.2f\n",volume);
    }
}