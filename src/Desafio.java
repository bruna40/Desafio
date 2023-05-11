import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        String name = "Bruna Santiago";
        String accountType = "Corrente";
        double bankBalance = 2500;
        int option = 0;
        Scanner read = new Scanner(System.in);
        double transfer = 0;
        String menu = """
                \n** Digite sua opção **
                \n1 - Consultar saldo
                2 - Transferir valor
                3 - Receber valor
                4 - Sair

                """;


        System.out.println("***********************");
        System.out.println("Nome do cliente: " + name);
        System.out.println("Tipo conta: " + accountType);
        System.out.println("Saldo atual: " + bankBalance);
        System.out.println("***********************");

        while(option != 4 ) {
            System.out.println(menu);
            option = read.nextInt();
            if(option == 1){
                System.out.println("Saldo atual: " + bankBalance);
            } else if(option == 2) {
                System.out.println("Quanto deseja transferir? ");
                transfer = read.nextDouble();
                if(transfer > bankBalance ){
                    System.out.println("Impossivel fazer transferencia, valor insuficiente");
                } else {
                    bankBalance -= transfer;
                    System.out.println("Novo saldo: " + bankBalance);
                }
            } else if (option == 3) {
                System.out.println("Valor recebido: ");
                bankBalance += transfer;
                System.out.println("Novo saldo: " + bankBalance);
            } else {
                System.out.println("Opção inválida!");
            }
        }
    }
}
