package conta.model;

public class ContaCorrente extends Conta{
	
	private float limite;

	public ContaCorrente(int numero, int agenda, int tipo, String titular, float saldo, float limite) {
		super(numero, agenda, tipo, titular, saldo);
		this.limite = limite;
	}

	public float getLimite() {
		return limite;
	}

	public void setLimite(float limite) {
		this.limite = limite;
	}
	
	
	@Override//METODO SOBRECARREGADO
	public boolean sacar(float valor) {
		if (this.getSaldo() + this.getLimite() < valor) {
			System.out.println("\nSaldo insuficiente!");
			return false;
		}
		
		this.setSaldo(this.getSaldo() - valor);
		return true;
	}
	

	
	public void visualizar() {
		super.visualizar();
		System.out.println("Limite de crédito: " + this.limite);
	}
	
	
	
}
