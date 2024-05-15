import java.util.Scanner;
public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Por favor, digite o número da Agência:");
        String agencia = scanner.nextLine();

        System.out.println("Por favor, digite o número da Conta:");
        double numero = scanner.nextDouble();

        scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        String nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        double saldo = scanner.nextDouble();

        scanner.close();

        
        String mensagem = "Olá ".concat(nomeCliente)
                          .concat(", obrigado por criar uma conta em nosso banco, sua agência é ")
                          .concat(agencia)
                          .concat(", sua conta é ")
                          .concat(String.valueOf(numero))
                          .concat(", e seu saldo de ")
                          .concat(String.valueOf(saldo))
                          .concat(" já está disponível para saque.");
        
        System.out.println(mensagem);
    }
}