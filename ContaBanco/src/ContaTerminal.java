import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //TODO:Conhecer e importar a classe Scanner
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);
        
        //Exibir as mensagens para o nosso usuário
        //Obter pela scanner os valores digitados no terminal
        System.out.println("Por favor, digite o seu nome.");
        String nome = scanner.next();

        System.out.println("Por favor, digite o número da Agência.");
        String agencia = scanner.next();

        System.out.println("Por favor, digite sua conta.");
        int numero = scanner.nextInt();

        System.out.println("Por favor, digite seu saldo.");
        double saldo = scanner.nextDouble();
         
         //Exibir a mensagem conta criada

         System.out.println("Olá " + nome + ", obrigado por criar uma conta em nosso banco, sua agência é: " + agencia + " e o seu saldo de R$" + saldo + " já está disponível para saque.");

    }
}
