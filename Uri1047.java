import java.util.Scanner;

public class Uri1047{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int horaI, minuI, horaF, minuF;
        int durI, durF, tempoTotal;
        int tempoH, tempoM;

        horaI = teclado.nextInt();
        minuI = teclado.nextInt();
        horaF = teclado.nextInt();
        minuF = teclado.nextInt();

        durI = horaI * 60 + minuI;
        durF = horaF * 60 + minuF;

        tempoTotal = durF - durI;

        if (tempoTotal <= 0){
            tempoTotal = tempoTotal + 24 * 60; // ou 1440
        }

        tempoH = tempoTotal / 60;
        tempoM = tempoTotal % 60;

        System.out.println("O JOGO DUROU "+tempoH+" HORA(S) E "+tempoM+" MINUTO(S)");

    }
}