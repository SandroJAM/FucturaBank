package agencia;

import java.util.Scanner;
import modelo.ContaCorrente;
import modelo.ContaPoupanca;

public class Executavel {

	public static void main(String[] args) {
		// O projeto precisará de uma classe Principal, que contenha o método main. Nesta classe
		// será feita a criação de objetos, chamadas de métodos e atribuição de valores aos atributos.
		
		Scanner entrada = new Scanner(System.in);
		
		ContaPoupanca cp = null;
		ContaCorrente cc = null;

		int opcao = 0;
		
		System.out.println("#### -- FucturaBANK --####");
		System.out.println();
		
		do {
			System.out.println("1 - Abrir Contas");
			System.out.println("2 - Sacar");
			System.out.println("3 - Depositar");
			System.out.println("4 - Aplicar");
			System.out.println("5 - Resgatar");
			System.out.println("6 - Consultar Saldo");
			System.out.println("7 - Exibir Dados");
			System.out.println("0 - Sair");
			
			opcao = entrada.nextInt();
			
			if(opcao == 1) {
				
				cp = new ContaPoupanca();
				cc = new ContaCorrente();
				System.out.println("ABERTURA de CONTAS");
				System.out.println("\nNúmero de sua Conta Popuança: " + cp.getNumeroContaPoupanca());
				System.out.println("Número de sua Conta Corrente: " + cc.getNumeroContaCorrente());
				System.out.println();
			}else if(opcao == 2) {
				System.out.println("Informe o valor do SAQUE? ");
				
			}else if(opcao == 3) {
				System.out.println("Informe o valor do DEPÓSITO? ");
			}else if(opcao == 4) {
				System.out.println("Informe o valor a APLICAR? ");
			}else if(opcao == 5) {
				System.out.println("Informe o valor do RESGATAR? ");
			}else if(opcao == 6) {
				System.out.println("Consulta de Saldo");
				System.out.println("Saldo da sua Conta Poupança: " + cp.getSaldoDisponivel());
				System.out.println("Saldo da sua Conta Corrente: " + cc.getSaldoDisponivel());
			}else if(opcao == 7) {
				System.out.println("Exbindo DADOS do CLIENTE:");
				System.out.println();
				System.out.println("Nome do Titular: " + cp.getNomeTitular());
				System.out.println("Número de sua Conta Poupança: " + cp.getNumeroContaPoupanca() + " Seu Saldo: " + cp.getSaldoDisponivel());
				System.out.println("Número de sua Conta Corrente: " + cc.getNumeroContaCorrente() + " Seu Saldo: " + cc.getSaldoDisponivel());
				System.out.println("Saldo Total: " + (cp.getSaldoDisponivel()+cc.getSaldoDisponivel()));
			}
			
		}while(opcao != 0);
		
		entrada.close();


	}

}