
// Uma CLASSE ABSTRATA n�o pode ser INST�NCIADA, ou seja conter OBJETOS
public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;//agencia sempre vai ser padr�o = 1
	private static int SEQUENCIAL = 1;
	
//	Aqui ser� a SUPER CLASSE(classe pai, classe m�e)
//	Vamos deixar tudo public por enquanto, depois vemos o modificador de acesso ex: public, private, protected
	protected int agencia; //com o PROTECTED nas classes FILHAS podem usar o SUPER
	protected int numero;
	protected double saldo; 
	private Cliente cliente;
	

//	Constructor
	public Conta(Cliente cliente){
//		Com o SUPER podemos acessar os ATRIBUTOS da CLASSE BASE(classe pai)
		this.agencia = Conta.AGENCIA_PADRAO; 
		this.numero = SEQUENCIAL++;//incrementando o n�mero
		this.cliente = cliente;
	}
	
//	@Override "sobrepondo" o m�todo
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
//	Usamos IConta ou Conta = par�metro gen�rica que pode ter multiplos TIPOS
//	como contaCorrente ou contaPoupanca isso � POLIMORFISMO 
//	diminui a quantidade de c�digo
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
//	Faz sentido apenas termos GET, n�o faz sentido termos SET pois n�o faz sentido
//	Alguem de fora modificar agencia, numero e saldo
	public int getAgencia() {
		return agencia;
	}

	public int getNumero() {
		return numero;
	}

	public double getSaldo() {
		return saldo;
	}
	
	protected void imprimirInfosComuns() {
		System.out.println(String.format("Titular: %s", this.cliente.getNome()));
		System.out.println(String.format("Agencia: %s", this.agencia));
		System.out.println(String.format("Numero: %d", this.numero));
		System.out.println(String.format("Saldo: %.2f", this.saldo));
	}
}
