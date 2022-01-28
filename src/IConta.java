
public interface IConta {
//	Interface de CONTA
//	Olá sou uma INTERFACE eu so assino contrato de USO, quem for me implementar 
//	Resolve meus métodos

//	Métodos ou seja coisas que podemos fazer com a ContaCorrente
//	Métodos são interface do uso da conta ou seja podemos acessar os método
//	Já acessar a agencia, número e saldo não é uma boa acessar isso na interface
// ou seja um método não retorna porém pode PRINTAR na tela uma mensagem
//	Método abstrato não deve especificar o corpo do método
	
//	Quando o cara quer SACAR ele quer sacar um VALOR, portanto DOUBLE
	void sacar(double valor);

	void depositar(double valor);

//	Transferência precisa de uma conta de destino(contaCOrrente ou contaPoupança) e o VALOR
//	Esse Conta e a contaCorrente ou contaPoupança
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

}
