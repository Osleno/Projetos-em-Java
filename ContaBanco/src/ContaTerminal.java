import java.util.Scanner;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {
        //Classe Scanner declarada
        Scanner sc = new Scanner(System.in);
        
        //Exibindo a mensagem ao úsuario para digitar o número da conta
        System.out.println("Por favor, digite o número da conta!");
        int numero = sc.nextInt();
        sc.nextLine();
        
        //Exibindo a mensagem ao úsuario para digitar o número da Agência
        System.out.println("Por Favor, digite o número da Agência!");
        String agencia = sc.nextLine();
        
        //Exibindo a mensagem ao úsuario para digitar o seu nome
        System.out.println("Por favor, digite o seu nome!");
        String nomeCliente = sc.nextLine();

        //Exibindo a mensagem ao úsuario para digitar o seu saldo 
        System.out.println("Por favor, digite o seu saldo!");
        double saldo = sc.nextDouble();

        sc.close();

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco, sua agência é "
         + agencia + ", conta " + numero + " e seu saldo " + saldo +" já está disponível para saque.");
    }
}   
