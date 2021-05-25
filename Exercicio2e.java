import java.util.Scanner;

public class Exercicio2e{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double baseM, basem, altura, area;

        System.out.println("Digite o valor das bases e da altura");
        baseM  = teclado.nextDouble();
        basem  = teclado.nextDouble();
        altura = teclado.nextDouble();

        area = (baseM + basem) * altura / 2;

        System.out.println("Area do trapezio = "+area);



    }
}