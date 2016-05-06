package views;

import static java.lang.System.out;

import java.util.Scanner;

import utils.Utils;

/**
 * Classe que controla os menus
 * @author Graci
 *
 */

public class MenuController {

	public Utils util;
	public MenuController(){
		util = new Utils();
	}
	private static Scanner scanner;

	/**
	 *Metodo que chama os metodos ligados ao cliente 
	 * @param acao
	 */
	
	public void menuCliente(String acao){
		switch (acao){
		case "adicionar":
			util.addCliente();
			break;
		case "listar":
			util.listaCliente();
			break;
		case "remover":
			util.removeCliente();
			break;
		}
	}
	
	/**
	 *Metodo que chama os metodos ligados ao aviao 
	 * @param acao
	 */
	
	public void menuAviao(String acao){
		switch (acao){
		case "adicionar":
			util.addAviao();
			break;
		case "listar":
			util.listaAviao();
			break;
		case "remover":
			util.removeAviao();
			break;
		}
	}

	/**
	 *Metodo que chama os metodos ligados ao voo 
	 * @param acao
	 */
	
	public void menuVoo(String acao){
		switch (acao){
		case "adicionar":
			util.addVoo();
			break;
		case "listar":
			util.listaVoo();
			break;
		case "remover":
			util.removeVoo();
			break;
		}
	}

	/**
	 * Switch com opcoes do menu
	 * @param acao A opcao escolhida pelo usuario.
	 */

	public void defineAcao(String acao) {

		scanner = new Scanner(System.in);

		switch(acao){
		case "cliente":
			out.println("Opções: \nDigite Adicionar para cadastrar um cliente\n"+					
					"Digite Listar para exibir a lista de clientes cadastrados\n"+
					"Digite Remover para remover um cliente");
			acao = scanner.nextLine();
			menuCliente(acao);
			break;
		case "aviao":
			out.println("Opções: \nDigite Adicionar para cadastrar um aviao\n"+					
					"Digite Listar para exibir a lista de avioes cadastrados\n"+
					"Digite Remover para remover um aviao");
			acao = scanner.nextLine();
			menuAviao(acao);
			break;
		case "voo":
			out.println("Opções: \nDigite Adicionar para cadastrar um voo\n"+					
					"Digite Listar para exibir a lista de voos cadastrados\n"+
					"Digite Remover para remover um voo");
			acao = scanner.nextLine();
			menuVoo(acao);
			break;
		case "venda":
			util.addVenda();
			break;
		case "relatorio":
			util.relatorio();
			break;
		case "sair":
			System.exit(0);
			break;
		default:
			out.println("Opcao invalida. Digite novamente.");
			break;
		}
	}
}
