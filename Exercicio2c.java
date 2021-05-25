import java.util.Scanner;

public class Exercicio2c{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);
        double base, altura, area;

        System.out.println("Digite a base e a altura:");
        base = teclado.nextDouble();
        altura = teclado.nextDouble();

        area = base * altura / 2;

        System.out.println("A area do triangulo vale "+area);
    }
}