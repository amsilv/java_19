import java.util.Scanner;

public class CalculaMedia{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        double n1, n2, media;

        System.out.println("Digite a nota N1");
        n1 = teclado.nextDouble();
        System.out.println("Digite a nota N2");
        n2 = teclado.nextDouble();

        media = (n1 + n2)/2;

        System.out.println("A sua media vale "+media);

        if (media >= 7.0) {
            System.out.println("Parabens! Voce esta aprovado");
        }
        else{
           if (media >= 5 && media < 7){
               System.out.println("Voce esta de recuperacao!!!");
           }          
           else{
               System.out.println("Nos vemos ano que vem");
           }
        }

        System.out.println("Obrigado!");
    }
}