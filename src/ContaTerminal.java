import java.util.Locale;
import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) {
       
        //int numero = 1021;
        //string numeroAgencia = "067";
        //char digitoVerificador = '8';
        //string agencia = numeroAgencia + "-" + digitoVerificador; 
        //string nomeCliente = "MARIO ANDRADE";
        //Double SaldoBancario = 234.8; 
//--------------------------------------------------
        //int numeroConta = Integer.valueOf(args[0]);
        //String numeroAgencia = args[1];
        //char digitoVerificador = args[2].charAt(0);
        //String agencia = numeroAgencia + "-" + digitoVerificador;
       //String nomeCliente = args[3];
       // double saldoBancario = Double.valueOf(args[4]);
//-----------------------------------------------------------   
        double saldoBancario = 58.87;
        String msgSaque;
        Scanner scanner = new Scanner(System.in).useLocale(Locale.US);

        System.out.println("Digite o número da sua Conta:");
        int numeroConta = scanner.nextInt();

        System.out.println("Digite o número da sua agência:");
        String valor = scanner.next();
        String numeroAgencia= valor.substring(0, valor.length() - 1);
        char digitoVerificador = valor.charAt(valor.length() - 1);
        String agencia = numeroAgencia + "-" + digitoVerificador;

        scanner.nextLine();

        System.out.println("Digite sem nome e sobrenome:");
        String nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o valor que deseja retirar:");
        double valorDesejado = scanner.nextDouble();

        if ( valorDesejado >= saldoBancario ) {

            msgSaque = "já está disponível para saque";

        } else {
            
            msgSaque = "não está disponível para saque";
        }

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " /n" + "Seu saldo é de " + saldoBancario + " e o valor de " + valorDesejado+ msgSaque);

        scanner.close();

    }
}
