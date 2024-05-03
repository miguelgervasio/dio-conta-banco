import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Criando o objeto scanner
        Scanner scanner = new Scanner(System.in);

        //Criando o input e leitura dos dados
        System.out.println("Por favor, digite o número!");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        int agencia = scanner.nextInt();

        System.out.println("Por favor, digite o seu nome!");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número saldo para saque!");
        double saldo = scanner.nextDouble();

        //Impressão dos dados obtidos pelo input
        System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é "+ agencia + ", conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}