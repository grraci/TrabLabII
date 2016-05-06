package models;

/**
 * Classe modelo que representa o modelo de dados para a criacao de objetos Cliente.
 * @author Graci
 */

public class Cliente {
	private String nome;
	private String telefone;
	private String rg;

	/**	 
	 * Inicializa um objeto Cliente. Dados: nome, telefone e RG do Cliente.
	 * @param nome O nome do cliente.
	 * @param telefone O telefone do cliente.
	 * @param rg O RG do cliente.
	 */

	public Cliente(String nome, String telefone, String rg) {
		this.nome = nome;
		this.telefone = telefone;
		this.rg = rg;
	}

	/**
	 * Retorna o nome do cliente.
	 * @return O nome do cliente.
	 */

	public String getNome() {
		return nome;
	}

	/**
	 * Permite a configuracao do nome do cliente.
	 * @param nome O nome do cliente.
	 */

	public void setNome(String nome) {
		this.nome = nome;
	}

	/**
	 * Retorna o telefone do cliente.
	 * @return O telefone do cliente.
	 */

	public String getTelefone() {
		return telefone;
	}

	/**
	 * Permite a configuracao do telefone do cliente.
	 * @param telefone O telefone do cliente.
	 */	

	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}

	/**
	 * Retorna o rg do cliente.
	 * @return O rg do cliente.
	 */

	public String getRg() {
		return rg;
	}

	/**
	 * Permite a configuracao do rg do cliente.
	 * @param nome O rg do cliente.
	 */

	public void setRg(String rg) {
		this.rg = rg;
	}

	/**
	 * Retorna uma representacao do objeto em forma de string.
	 * Neste caso utilizo StringBuilder, que permite a concatenacao de strings.
	 */

	public String toString() {
		StringBuilder tmp = new StringBuilder("Nome: "+this.nome+". Telefone: "+this.telefone+". RG: "+this.rg+"\n");
		return tmp.toString();
	}
}
