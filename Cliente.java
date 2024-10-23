package Bank;

public class Cliente {
	private String nome;
	private Banco conta;


	public Cliente(String string, Banco banco) {
		
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public Banco getconta() {
		return conta;
	}

	public void setconta(Banco conta) {
		this.conta = conta;
	}

}
