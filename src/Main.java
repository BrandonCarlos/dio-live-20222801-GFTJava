
public class Main {

	public static void main(String[] args) {
		Cliente brandon = new Cliente();
		brandon.setNome("Brandon");
		
//		Vamos criar duas contas
//		Utilizando Polimorfismo criando uma CONTA do "tipo" ContaCorrente
//		Abaixo podemos colocar qualquer NIVEL DE HIERARQUIA como = Conta, IConta
		//ContaCorrent cc, ContaPoupanca cp
		Conta cc = new ContaCorrente(brandon);
		Conta poupanca = new ContaPoupanca(brandon);
		cc.depositar(100);
//		Abaixo estamos utilizando o POLIMORFISMO
//		Polimorfismo nada mais é que respeito de uma hierarquia
		cc.transferir(100, poupanca);//transferindo 100 reais para a conta poupança
		cc.imprimirExtrato();
		
		
		poupanca.imprimirExtrato();
		
	}

}
