import java.util.Scanner;

public class Exerc20{
    public static void main(String args[]){
        Scanner teclado = new Scanner(System.in);

        String sexo;
        double altura, pesoIdeal;

        System.out.println("Digite o sexo do individuo");
        sexo = teclado.nextLine();
        System.out.println("Digite a altura");
        altura = teclado.nextDouble();

        switch(sexo){
            case "M":
            case "Masc":
            case "m":
            case "masc":
            case "Masculino":
            case "masculino":
            case "homem":
            case "Homem":
                pesoIdeal = 72.7 * altura - 58;
                System.out.println("O peso ideal masculino vale "+pesoIdeal);
                break;
            
            case "F":
            case "f":
            case "Fem":
            case "fem":
            case "Feminino":
            case "feminino":
            case "Mulher":
            case "mulher":
                pesoIdeal = 62.1 * altura - 44.7;
                System.out.println("O peso ideal feminino vale "+pesoIdeal);
                break;
            default:
                System.out.println("Opcao nao reconhecida");
        }
    }
}