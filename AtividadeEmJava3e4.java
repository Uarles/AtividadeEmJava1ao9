import java.util.Scanner;
public class AtividadeEmJava3e4 {
    public static void main(String[] args){

        System.out.println("Informar um saldo e imprimir o saldo com reajuste de 1%.\n ");

        double saldo,saldo_reajustado;

        Scanner leitor = new Scanner(System.in);
        System.out.println("Informe o saldo original:");
        saldo = leitor.nextDouble();

        System.out.println("Foi informado saldo de: " +saldo);
        leitor.close();

        System.out.println("O saldo reajustado é:" +(saldo * 1.01));



    }

}



