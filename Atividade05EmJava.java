

import java.util.Scanner;
public class Atividade05EmJava {

    public static void main(String[] args) {
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Informe o valor mínimo do salário: ");
        double salarioMinimo = Scanner.nextDouble();

        System.out.println("Agora informa o seu salároio: ");
        double salarioUsuario = Scanner.nextDouble();

        double quantidadesSalariosMinimos = salarioUsuario * salarioMinimo;

        System.out.println("Aqui esta a quantidade de salários mínimos ganhos: " + quantidadesSalariosMinimos);

        Scanner.close();


    }

}