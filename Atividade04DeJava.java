import java.util.Scanner;
public class Atividade04DeJava {

    public static void main(String[] args){
        Scanner Scanner = new Scanner(System.in);

        System.out.println("Informe a porcentagem do ipi a ser acrescido: ");
        double ipi = Scanner.nextDouble();

        System.out.println("Informe o código da peça 1: ");
        int codigo1 = Scanner.nextInt();
        System.out.println("Informe o valor unitário da peça 1: ");
        double valorUnitario1 = Scanner.nextDouble();
        System.out.println("Informe a quantidade de peça 1: ");
        int quantidade1 = Scanner.nextInt();

        System.out.println("Informe o código da peça 2: ");
        int codigo2 = Scanner.nextInt();
        System.out.println("Informe o valor unitário da peça 2: ");
        double valorUnitario2 = Scanner.nextDouble();
        System.out.println("Informe a quantidade de peça 2: ");
        int quantidade2 = Scanner.nextInt();

        double valorTotal = (valorUnitario1 * quantidade1 + valorUnitario2 * quantidade2) * (ipi / 100*1);

        System.out.println("O valor total a ser pago é: " + valorTotal);

        Scanner.close();
    }
}
