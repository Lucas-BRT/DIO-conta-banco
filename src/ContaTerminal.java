import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Bem vindo(a) ao banco DIO!");

        System.out.print("por favor, digite o número da sua conta: ");
        long numeroConta = Long.parseLong(scanner.nextLine());

        System.out.print("digite a agência incluindo o dígito: ");
        String agencia = scanner.nextLine();

        System.out.print("qual é o seu nome? ");
        String nomeCliente = scanner.nextLine();

        System.out.print("digite o saldo da sua conta: ");
        float saldo = Float.parseFloat(scanner.nextLine());

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque.", nomeCliente, agencia, numeroConta, saldo);

    }

}