/*
   1 min = 60 s
   1 hor = 60 min = 3600 s

   T / 3600 --> H

   556 / 3600 
    R     H

   R / 60
   S    M
*/

import java.util.Scanner;

public class Uri1019{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        int T, H, M, S, R;

        T = teclado.nextInt();

        H = T / 3600;  // aqui tenho a quantidade de horas
        R = T % 3600;  // aqui tem o quanto sobrou das horas --> R = T - 3600 * H

        M = R / 60;
        S = R % 60;   // ou alternativamente S = R - M * 60

        System.out.println(H+":"+M+":"+S);
    }
}