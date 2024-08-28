import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o número da conta: ");
        int numero = scanner.nextInt();
        scanner.nextLine(); 

        System.out.println("Digite o número da agência: ");
        String agencia = scanner.nextLine();


        System.out.println("Digite o seu nome: ");
        String nomeCliente = scanner.nextLine();

        System.out.println("Digite saldo em conta: ");
        double saldo = scanner.nextDouble();


        System.out.println("Olá " + nomeCliente + " obrigado por criar uma conta em nosso banco, sua agência é " + 
        agencia + " conta " + numero + " e seu saldo " + saldo + " já está disponível para saque");

        scanner.close();
    }
}
