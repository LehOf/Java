package Fixacao;

public class ContaBancaria {

	private String nome;
	private int numeroConta;
	private double balance;

	public ContaBancaria(String nome, int numeroConta, double initialDeposit) {
		this.nome = nome;
		this.numeroConta = numeroConta;
		deposit(initialDeposit);
	}

	public ContaBancaria(String nome, int numeroConta) {
		this.nome = nome;
		this.numeroConta = numeroConta;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getNumeroConta() {
		return numeroConta;
	}

	public double getBalance() {
		return balance;
	}

	public void deposit(double amount) {
		balance += amount;
	}

	public void withdraw(double amount) {
		balance -= amount + 5.0;
	}

	public String toString() {
		return "Account " 
		+ numeroConta
		+ ", Holder: " 
		+ nome + 
		", Balance: $ " 
		+ String.format("%.2f",balance);
	}

}
