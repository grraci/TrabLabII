package models;

/**
 * Classe modelo que representa o modelo de dados para a criacao de objetos Venda.
 * @author Graci
 */

import models.Cliente;
import models.Voo;

public class Venda {
	private Cliente cliente;
	private Voo voo;

	/**	 
	 * Inicializa um objeto Venda. Dados: cliente (do objeto Cliente) e voo (do objeto Voo).
	 * @param cliente Do objeto Cliente.
	 * @param voo Do objeto Voo.
	 */

	public Venda(Cliente cliente, Voo voo){
		this.cliente = cliente;
		this.voo = voo;
	}

	/**
	 * Retorna o objeto cliente.
	 * @return O objeto Cliente.
	 */

	public Cliente getCliente() {
		return cliente;
	}
	
	/**
	 * Permite a configuracao do objeto Cliente.
	 * @param cliente O objeto Cliente.
	 */

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	/**
	 * Retorna o objeto voo.
	 * @return O objeto Voo.
	 */

	public Voo getVoo() {
		return voo;
	}
	
	/**
	 * Permite a configuracao do objeto Voo.
	 * @param voo O objeto Voo.
	 */

	public void setVoo(Voo voo) {
		this.voo = voo;
	}
}
