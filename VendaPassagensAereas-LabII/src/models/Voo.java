package models;

/**
 * Classe modelo que representa o modelo de dados para a criacao de objetos Voo.
 * @author Graci
 */

import models.Aviao;

public class Voo {

	private int idVoo;
	private Aviao aviao;
	private String origem;
	private String destino;
	private String horario;

	/**	 
	 * Inicializa um objeto Voo. Dados: aviao, origem, destino e horario.
	 * @param aviao Do objeto Aviao.
	 * @param origem A origem do voo.
	 * @param destino O destino do voo.
	 * @param horario O horario do voo.
	 */

	public Voo(Aviao aviao, String origem, String destino, String horario) {
		this.aviao = aviao;
		this.origem = origem;
		this.destino = destino;
		this.horario = horario;
	}

	/**
	 * Retorna o objeto aviao.
	 * @return O objeto Aviao.
	 */

	public Aviao getAviao() {
		return aviao;
	}
	
	/**
	 * Permite a configuracao do objeto aviao.
	 * @param aviao O objeto Aviao.
	 */

	public void setAviao(Aviao aviao) {
		this.aviao = aviao;
	}

	/**
	 * Retorna a origem do voo.
	 * @return A origem do voo.
	 */

	public String getOrigem() {
		return origem;
	}
	
	/**
	 * Permite a configuracao da origem do voo.
	 * @param origem A origem do voo.
	 */

	public void setOrigem(String origem) {
		this.origem = origem;
	}

	/**
	 * Retorna o destino do voo.
	 * @return O destino do voo.
	 */

	public String getDestino() {
		return destino;
	}
	
	/**
	 * Permite a configuracao do destino do voo.
	 * @param destino O destino do voo.
	 */

	public void setDestino(String destino) {
		this.destino = destino;
	}

	/**
	 * Retorna o horario do voo.
	 * @return O horario do voo.
	 */

	public String getHorario() {
		return horario;
	}
	
	/**
	 * Permite a configuracao do horario do voo.
	 * @param horario O horario do voo.
	 */

	public void setHorario(String horario) {
		this.horario = horario;
	}

	/**
	 * Retorna uma representacao do objeto em forma de string.
	 * Neste caso utilizo StringBuilder, que permite a concatenacao de strings.
	 */

	public String toString() {
		StringBuilder tmp = new StringBuilder("Voo ID:"+this.idVoo+". Origem: "+this.origem+". Destino: "+this.destino+" -- "+this.aviao);
		return tmp.toString();
	}
	
	/**
	 * Retorna o IdVoo do objeto Voo.
	 * @return O IdVoo do objeto Voo.
	 */

	public int getIdVoo() {
		return idVoo;
	}
	
	/**
	 * Permite a configuracao do IdVoo do objeto Voo.
	 * @param IdVoo O IdVoo do objeto Voo.
	 */

	public void setIdVoo(int idVoo) {
		this.idVoo = idVoo;
	}

}
