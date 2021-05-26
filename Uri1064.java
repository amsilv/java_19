import java.util.Scanner;
public class Uri1064{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        float valor;
        float soma, media;
        int qtd = 0;

        soma = 0;
        for (int cont=1; cont <= 6; cont++){  //cont++ equivale a cont = cont + 1
            valor = teclado.nextFloat();
            if (valor > 0){
                soma = soma + valor;
                qtd++;
            }
        }
        System.out.println(qtd+ " valores positivos");
        media = soma / qtd;
        System.out.printf("%.1f\n",media);
    }
}