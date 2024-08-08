import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        String agencia;
        int numeroConta;
        String usuario;
        double saldo;

        // Conhecer e importar a classe Scanner

        Scanner scanner = new Scanner(System.in);

        // Exibir as mensagens para o nosso usuário

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Digite o número da conta:");
        numeroConta = Integer.parseInt(scanner.nextLine());

        System.out.println("Por favor, digite o Nome do Cliente: ");
        usuario = scanner.nextLine();

        System.out.println("Digite o Saldo da Conta:");
        saldo = Double.parseDouble(scanner.nextLine());

        // Obter pela classe scanner os valores digitados no terminal

        // Exibir a mensagem conta criada
        System.out.println("Olá " + usuario + ", obrigado por criar uma conta em nosso Banco, sua agência é: " + agencia
                + ", Conta Corrente: " + numeroConta + " e seu saldo: " + saldo + " já está disponivel para saque!");

    }
}
