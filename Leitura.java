import java.util.Scanner;

public class Leitura{
    public static void main(String args[]){
        Scanner teclado;                   // declarei um componente do tipo Scanner
        teclado = new Scanner(System.in);  // crio esse componente dizendo q vai ler do teclado (entrada padrão)

        int a;
        float b;

        System.out.println("Digite um valor inteiro: ");
        a = teclado.nextInt();
        System.out.println("Agora digite um valor real: ");
        b = teclado.nextFloat();

        System.out.println("Voce digitou os valores: " + a + " e " + b);

    }
}