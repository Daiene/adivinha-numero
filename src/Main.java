import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*Crie um programa que simula um jogo de adivinhação, que deve gerar um número aleatório entre 0 e 100 e pedir
        para que o usuário tente adivinhar o número, em até 5 tentativas. A cada tentativa, o programa deve informar se
        o número digitado pelo usuário é maior ou menor do que o número gerado.

        Dicas:

        Para gerar um número aleatório em Java: new Random().nextInt(100);
        Utilize o Scanner para obter os dados do usuário;
        Utilize uma variável para contar as tentativas;
        Utilize um loop para controlar as tentativas;
        Utilize a instrução break; para interromper o loop.*/

        Scanner leitura = new Scanner(System.in);
        int numero = new Random().nextInt(100);
        int tentativas = 0;
        int numeroDoUsuario = 0;

        while(tentativas < 5 && numero != numeroDoUsuario) {
            System.out.println("Adivinhe o número do jogo (De 1 a 100): ");
            numeroDoUsuario = leitura.nextInt();
            tentativas++;

            if (numeroDoUsuario == numero) {
                System.out.println("Você acertou em" + tentativas + "! O número do jogo é: " + numero);
                break;
            } else if (numeroDoUsuario < numero) {
                System.out.println("Não foi dessa vez. O número do jogo é maior que " + numeroDoUsuario);
            } else {
                System.out.println("Não foi dessa vez. O número do jogo é menor que " + numeroDoUsuario);
            }
        }

        if (tentativas == 5 && numero != numeroDoUsuario) {
            System.out.println("O número do jogo era: " + numero);
        }
    }
}
