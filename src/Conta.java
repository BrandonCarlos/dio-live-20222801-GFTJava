
// Uma CLASSE ABSTRATA não pode ser INSTÂNCIADA, ou seja conter OBJETOS
public abstract class Conta implements IConta {
	private static final int AGENCIA_PADRAO = 1;//agencia sempre vai ser padrão = 1
	private static int SEQUENCIAL = 1;
	
//	Aqui será a SUPER CLASSE(classe pai, classe mãe)
//	Vamos deixar tudo public por enquanto, depois vemos o modificador de acesso ex: public, private, protected
	protected int agencia; //com o PROTECTED nas classes FILHAS podem usar o SUPER
	protected int numero;
	protected double saldo; 
	private Cliente cliente;
	

//	Constructor
	public Conta(Cliente cliente){
//		Com o SUPER podemos acessar os ATRIBUTOS da CLASSE BASE(classe pai)
		this.agencia = Conta.AGENCIA_PADRAO; 
		this.numero = SEQUENCIAL++;//incrementando o número
		this.cliente = cliente;
	}
	
//	@Override "sobrepondo" o método
	public void sacar(double valor) {
		saldo -= valor;
		
	}

	@Override
	public void depositar(double valor) {
		saldo += valor;
	}

	@Override
//	Usamos IConta ou Conta = parâmetro genêrica que pode ter multiplos TIPOS
//	como contaCorrente ou contaPoupanca isso é POLIMORFISMO 
//	diminui a quantidade de código
	public void transferir(double valor, IConta contaDestino) {
		this.sacar(valor);
		contaDestino.depositar(valor);
		
	}
	
//	Faz sentido apenas termos GET, não faz sentido termos SET pois não faz sentido
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
