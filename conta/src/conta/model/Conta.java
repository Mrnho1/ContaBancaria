package conta.model;

public abstract class Conta {
	
	private int numero;
	private int agencia;
	private int tipo;
	private String titular;
	private float saldo;
	public Conta(int numero, int agenda, int tipo, String titular, float saldo) {
		this.numero = numero;
		this.agencia = agenda;
		this.tipo = tipo;
		this.titular = titular;
		this.saldo = saldo;
	}
	public int getNumero() {
		return numero;
	}
	public void setNumero(int numero) {
		this.numero = numero;
	}
	public int getAgenda() {
		return agencia;
	}
	public void setAgenda(int agenda) {
		this.agencia = agenda;
	}
	public int getTipo() {
		return tipo;
	}
	public void setTipo(int tipo) {
		this.tipo = tipo;
	}
	public String getTitular() {
		return titular;
	}
	public void setTitular(String titular) {
		this.titular = titular;
	}
	public float getSaldo() {
		return saldo;
	}
	public void setSaldo(float saldo) {
		this.saldo = saldo;
	}
	
	public boolean sacar(float valor) {
		if (this.getSaldo() < valor) {
			System.out.println("\nSaldo insuficiente! Você é pobre demais para esse saque");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	
	public void depositar(float valor) {
		this.setSaldo(this.getSaldo() + valor);
	}
	
	
	
	
	public void visualizar() {
		
		String tipo = "";
		
		switch(this.tipo) {
			case 1 -> tipo = "Conta Corrente";
			case 2 -> tipo = "Conta Poupança";
		}
		
		System.out.println("==========================");
		System.out.println("      DADOS DA CONTA      ");
		System.out.println("==========================");
		System.out.println("Número da Conta: "+this.numero);
		System.out.println("Número da Agência: "+this.agencia);
		System.out.println("Tipo da Conta: "+tipo);
		System.out.println("Nome do Titular: "+this.titular);
		System.out.println("Saldo da Conta: "+this.saldo);
		
	}
	
	
	
}
