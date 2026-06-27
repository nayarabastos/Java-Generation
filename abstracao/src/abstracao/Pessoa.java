package abstracao;

public abstract class Pessoa {

	private String nome;

	/**
	 * @param nome
	 */
	public Pessoa(String nome) {
		this.nome = nome;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public abstract void cansou();
}
