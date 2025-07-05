import java.util.Scanner;

public class Atm {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da agência. ");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da conta. ");
        int conta = scanner.nextInt();
        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome. ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo. ");
        float saldo = scanner.nextFloat();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é " + agencia + ", conta " + conta + " e seu saldo " + saldo + " já está disponível para saque");


    }
}
