
public class ContaPoupanca extends Conta {
		
	public ContaPoupanca(Cliente cliente) {
		super(cliente);
	}
	
//Agora está CLASSE possui todo que tem na classe Conta pois está HERDANDO tudo de lá
	public void imprimirExtrato() {
		System.out.println("===Extrato conta Poupança===");
		super.imprimirInfosComuns();

	}

	
}
