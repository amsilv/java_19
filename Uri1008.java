import java.util.Scanner;

public class Uri1008{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int numFunc, qtdHoras;
        float valorHora, salario;

        numFunc   = teclado.nextInt();
        qtdHoras  = teclado.nextInt();
        valorHora = teclado.nextFloat();

        salario = qtdHoras * valorHora;

        System.out.printf("NUMBER = %d\n",numFunc);
        System.out.printf("SALARY = U$ %.2f\n",salario);

    }
}