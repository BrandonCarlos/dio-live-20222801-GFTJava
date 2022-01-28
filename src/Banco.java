import java.util.List;

public class Banco {
//Abaixo temos os atributos da nossa classed depois teremos o método constructor e mais métodos	
	private String nome;
	private List<Conta> contas; 

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public List<Conta> getContas() {
		return contas;
	}

	public void setContas(List<Conta> contas) {
		this.contas = contas;
	}
	
}
