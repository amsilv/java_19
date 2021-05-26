import java.util.Scanner;

public class Uri1060{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor;
        int quantidade=0;
        for (int contador=1; contador<=6; contador++){
            valor = teclado.nextFloat();
            if (valor > 0){
                quantidade = quantidade + 1;
            }
        }
        System.out.println(quantidade + " valores positivos");
    }
}


// contador = contador + 1 --> contador++ --> contador += 1