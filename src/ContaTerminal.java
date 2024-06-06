public class ContaTerminal {
    public static void main(String[] args) {
       
        //int numero = 1021;
        //string numeroAgencia = "067";
        //char digitoVerificador = '8';
        //string agencia = numeroAgencia + "-" + digitoVerificador; 
        //string nomeCliente = "MARIO ANDRADE";
        //Double SaldoBancario = 234.8; 

        int numeroConta = Integer.valueOf(args[0]);
        string numeroAgencia = args[1];
        string digitoVerificador = args[2];
        string agencia = numeroAgencia + "-" + digitoVerificador;
        string nomeCliente = args[3];
        double saldoBancario = Double.valueOf(args[4]);

        System.out.println("Olá "+ nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é " + agencia + ", conta " + numeroConta + " e seu saldo de " + saldoBancario + " já está disponível para saque");

    }
}
