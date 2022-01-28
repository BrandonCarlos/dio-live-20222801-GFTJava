
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("===Extrato conta corrente===");
		//utilizamos o SUPER para acessar m�todos e atributos da classe BASE
		// classe M�E, classe PAI = SUPER
//		Quando temos o PROTECTED significa que s� os FILHOS HERDEIROS v�o usar
//		os m�todos e atributos
		super.imprimirInfosComuns();

	}
}
