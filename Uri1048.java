import java.util.Scanner;

public class Uri1048{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double salario, reajuste, novoSalario;
        int    percentual;

        salario = teclado.nextDouble();

        if (salario <= 400.00){         // é menor que 400??
            percentual = 15;
        }
        else if (salario <= 800.00){    // ja sei que é maior que 400, só testo se é menor q 800
            percentual = 12;
        }
        else if (salario <= 1200){      // ja sei que é maior q 800, só testo se é <= 1200
            percentual = 10;
        }
        else if (salario <= 2000){      // ja sei que é maior q 1200, só testo se é 
            percentual = 7;
        }
        else {
            percentual = 4;
        }
        reajuste = salario * percentual / 100;
        novoSalario = salario + reajuste;
        System.out.printf("Novo salario: %.2f\n", novoSalario);
        System.out.printf("Reajuste ganho: %.2f\n", reajuste);
        System.out.printf("Em percentual: %d %%\n", percentual);



    }
}
