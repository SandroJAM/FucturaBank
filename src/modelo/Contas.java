package modelo;

import java.util.Random;

public abstract class Contas {
	
	Random random = new Random(); // Cria um Objeto da Classe Random;
	
	private int numeroContaPoupanca = random.nextInt(100000); // Gerar um número aleatório de 0 a 7;
	private int numeroContaCorrente = random.nextInt(100000); // Gerar um número aleatório de 0 a 7;
	private String nomeTitular;
	private double saldoDisponivel;
	


	public Random getRandom() {
		return random;
	}

	public void setRandom(Random random) {
		this.random = random;
	}

	public int getNumeroContaPoupanca() {
		return numeroContaPoupanca;
	}

	public void setNumeroContaPoupanca(int numeroContaPoupanca) {
		this.numeroContaPoupanca = numeroContaPoupanca;
	}

	public int getNumeroContaCorrente() {
		return numeroContaCorrente;
	}

	public void setNumeroContaCorrente(int numeroContaCorrente) {
		this.numeroContaCorrente = numeroContaCorrente;
	}

	public String getNomeTitular() {
		return nomeTitular;
	}

	public void setNomeTitular(String nomeTitular) {
		this.nomeTitular = nomeTitular;
	}

	public double getSaldoDisponivel() {
		return saldoDisponivel;
	}

	public void setSaldoDisponivel(double saldoDisponivel) {
		this.saldoDisponivel = saldoDisponivel;
	}

	public String sacar(double valor) {
		if(valor < saldoDisponivel) {
			saldoDisponivel = saldoDisponivel - valor;
			return "Saque Realizado!";
		} else {
			return "Saldo Insuficiente!";
		}
	}
	
	public String depositar(double valor) {
		saldoDisponivel = saldoDisponivel + valor;
		return "Deposito Realizado!";
	}
	
	public String exibirDados() {
		return nomeTitular;
	}
	
	
}