
public class ContaCorrente extends Conta {
	
	public ContaCorrente(Cliente cliente) {
		super(cliente);
	}
	
	public void imprimirExtrato() {
		System.out.println("===Extrato conta corrente===");
		//utilizamos o SUPER para acessar métodos e atributos da classe BASE
		// classe MÃE, classe PAI = SUPER
//		Quando temos o PROTECTED significa que só os FILHOS HERDEIROS vão usar
//		os métodos e atributos
		super.imprimirInfosComuns();

	}
}
