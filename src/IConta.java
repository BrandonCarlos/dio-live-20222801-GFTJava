
public interface IConta {
//	Interface de CONTA
//	Ol� sou uma INTERFACE eu so assino contrato de USO, quem for me implementar 
//	Resolve meus m�todos

//	M�todos ou seja coisas que podemos fazer com a ContaCorrente
//	M�todos s�o interface do uso da conta ou seja podemos acessar os m�todo
//	J� acessar a agencia, n�mero e saldo n�o � uma boa acessar isso na interface
// ou seja um m�todo n�o retorna por�m pode PRINTAR na tela uma mensagem
//	M�todo abstrato n�o deve especificar o corpo do m�todo
	
//	Quando o cara quer SACAR ele quer sacar um VALOR, portanto DOUBLE
	void sacar(double valor);

	void depositar(double valor);

//	Transfer�ncia precisa de uma conta de destino(contaCOrrente ou contaPoupan�a) e o VALOR
//	Esse Conta e a contaCorrente ou contaPoupan�a
	void transferir(double valor, IConta contaDestino);
	
	void imprimirExtrato();

}
