
public class ContaPoupanca extends Conta {
		
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
//Agora est� CLASSE possui todo que tem na classe Conta pois est� HERDANDO tudo de l�
	public void imprimirExtrato() {
		System.out.println("===Extrato conta Poupan�a===");
		super.imprimirInfosComuns();

	}

	
}
