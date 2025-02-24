import java.util.Scanner;

class ContaTerminal {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        Integer numero = 0;
        String agencia = "";
        String nomeClient = "";
        Double saldo = 0.0;

        System.out.println("Por favor, digite o número da conta!");
        numero = scanner.nextInt();

        System.out.println("Por favor, digite o número da agência!");
        agencia = scanner.next();

        scanner.nextLine();

        System.out.println("Por favor, digite o seu nome!");
        nomeClient = scanner.next();

        System.out.println("Por favor, digite o seu saldo!");
        saldo = scanner.nextDouble();

        System.out.printf("Olá %s, obrigado por criar uma conta em nosso banco, sua agência é %s, conta %d e seu saldo %.2f já está disponível para saque", nomeClient, agencia, numero, saldo);

        scanner.close();
    }
}
