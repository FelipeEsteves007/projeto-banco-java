import java.util.Scanner;

public class ProjetoBanco {
        public  static void main(String[] args) {
            
            int opcao = 0;
            String nome = "Larissa Andrade";
            String conta = "Conta Corrente";
            double saldo = 2500.00;
            String menu = """
                    Digite a opção desejada:
                    1 - Saldo 
                    2 - Depositar
                    3 - Sacar
                    4 - Sair
                    """;
        
            System.out.println("Nome do cliente: " + nome);
            System.out.println("Tipo de conta: " + conta);
            System.out.println("Saldo inicial: " + saldo);

            Scanner leitura = new Scanner(System.in);
            while (opcao != 4) {
                System.out.println(menu);
                opcao = leitura.nextInt();
                switch (opcao) {
                    case 1:
                    System.out.println("Seu saldo é: " + saldo);
                    break;
                    case 2:
                    System.out.println("Digite o valor a ser depositado: ");
                    double valorDeposito = leitura.nextDouble();
                    saldo += valorDeposito;
                    System.out.println("Seu saldo atualizado é: " + saldo);
                    break;
                    case 3: 
                    System .out.println("Digite o valor a ser sacado: ");
                    double valorSacado = leitura.nextDouble();
                    if (valorSacado > saldo) {
                        System.out.println("Saldo insuficiente! ");
                    } else {
                        saldo -= valorSacado;
                        System.out.println("Seu saldo atualizado é: " + saldo);
                    }
                    break;
                    case 4: 
                    System.out.println("Saindo do sistema...");
                    break;
                }
            }
        }
} 