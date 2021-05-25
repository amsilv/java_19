import java.util.Scanner;

public class Exercicio2a{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double lado, area;

        // entrada
        System.out.println("Por favor digite o valor do lado");
        lado = teclado.nextDouble();

        // processamento
        area = lado * lado;

        // saida
        System.out.println("A area do quadrado de lado "+ lado + " vale "+ area);       

    }
}