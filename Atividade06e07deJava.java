//Atividade 6 - Desenvolva um algoritmo em java que leia um numero inteiro e imprima o seu antecessor e seu sucessor.
import java.util.Scanner;
public class Atividade06e07deJava {

    public static void main(String[] args){
        Scanner leitor = new Scanner(System.in);



        System.out.println("Digite um numero inteiro");
        int numero = leitor.nextInt();

        int antecessor = numero - 1;
        int sucessor = numero + 1;

        System.out.println("Aqui esta o antecessor do numero informado:" + antecessor);
        System.out.println("E aqui esta o sucessor do numero informado:" + sucessor);

        //Atividade 07 - Escreva um algoritmo que exiba 20 vezes a mensagem "Eu gosto de estudar algoritmo


        for ( int i = 1 ; i < 21 ; i++) {
            System.out.println("Eu gosto de estudar algoritmo");
        }
    }
}
