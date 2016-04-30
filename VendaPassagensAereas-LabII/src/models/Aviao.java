package models;

/**
 * Classe modelo que representa o modelo de dados para a criacao de objetos Aviao.
 * @author Graci
 */

public class Aviao {
	private int codigo;
	private String nome;
	private int qtdAssentos;
	
   /**	 
	 * Inicializa um objeto Aviao. Dados: codigo, nome e quantidade de assentos do aviao.
	 * @param codigo O codigo do aviao.
	 * @param nome O modelo do aviao.
	 * @param qtdAssentos A quantidade de assentos do aviao.
	 */
	
	public Aviao(int codigo, String nome, int qtdAssentos) {
		this.codigo = codigo;
		this.nome = nome;
		this.qtdAssentos = qtdAssentos;
	}
	
	/**
	 * Retorna o codigo do aviao.
	 * @return O codigo do aviao.
	 */
	
	public int getCodigo() {
		return codigo;
	}
	
	/**
	 * Permite a configuracao do codigo do aviao.
	 * @param codigo O codigo do aviao.
	 */
	
	public void setCodigo(int codigo) {
		this.codigo = codigo;
	}
	
	/**
	 * Retorna o nome do aviao.
	 * @return O nome do aviao.
	 */
	
	public String getNome() {
		return nome;
	}
	
	/**
	 * Permite a configuracao do nome do aviao.
	 * @param nome O nome (marca) do aviao.
	 */
	
	public void setNome(String nome) {
		this.nome = nome;
	}
	
	/**
	 * Retorna a quantidade de assentos do aviao.
	 * @return A quantidade de assentos do aviao.
	 */
	
	public int getQtdAssentos() {
		return qtdAssentos;
	}
	
	/**
	 * Permite a configuracao da quantidade de assentos do aviao.
	 * @param qtdAssentos A quantidade de assentos do aviao.
	 */
		
	public void setQtdAssentos(int qtdAssentos) {
		this.qtdAssentos = qtdAssentos;
	}

	/**
	 * Retorna uma representacao do objeto em forma de string.
	 * Neste caso utilizo StringBuilder, que permite a concatenacao de strings.
	 */
	
	public String toString() {
		StringBuilder tmp = new StringBuilder("Aviao codigo: "+this.codigo+" nome: "+this.nome+" assentos: "+this.qtdAssentos);
		return tmp.toString();
	}

}
