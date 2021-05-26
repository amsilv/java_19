import java.util.Scanner;

public class Uri1051{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, imposto;
        salario = teclado.nextDouble();

        if (salario <= 2000.0){
            System.out.println("Isento");
        }
        else if (salario <= 3000.0){
            imposto = (salario - 2000.0) * 0.08;
            System.out.printf("R$ %.2f\n", imposto);
        }
        else if (salario <= 4500.0){
            imposto = (salario - 3000.0) * 0.18 + 80.0; // 80 corresponde a 8% de 1000.00 da faixa entre 2000 e 3000
            System.out.printf("R$ %.2f\n", imposto);
        }
        else {
            imposto = (salario - 4500.0)* 0.28 + 80.0 + 270.0;// 80 da faixa entre 2000 e 3000 e 270 dos 18% da faixa entre 3000 e 45000
            System.out.printf("R$ %.2f\n", imposto);
        }
    }
}