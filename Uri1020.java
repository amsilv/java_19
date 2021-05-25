import java.util.Scanner;

public class Uri1020{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int idade;
        int dia, mes, ano;

        idade = teclado.nextInt();

        ano = idade / 365;
        mes = (idade % 365) / 30;
        dia = (idade % 365) % 30;

        System.out.println(ano + " ano(s)");
        System.out.println(mes + " mes(es)");
        System.out.println(dia + " dia(s)");
    }
}