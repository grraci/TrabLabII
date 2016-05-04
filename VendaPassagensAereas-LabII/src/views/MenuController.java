package views;

import static java.lang.System.out;

import java.util.Scanner;

import utils.Utils;

public class MenuController {
	
	public Utils util;
	public MenuController(){
		util = new Utils();
	}
	private static Scanner scanner;
	
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
		
	public void menuAviao(String acao){
		switch (acao){
		case "adicionar":
			util.addAviao();
			break;
		case "listar":
			util.listaCliente();
			break;
		case "remover":
			util.removeCliente();
			break;
		}
	}
	
	public void menuVoo(String acao){
		switch (acao){
		case "adicionar":
			util.addAviao();
			break;
		case "listar":
			util.listaCliente();
			break;
		case "remover":
			util.removeCliente();
			break;
		}
	}
	
	public void menuVenda(String acao){
		switch (acao){
		case "adicionar":
			util.addAviao();
			break;
		case "listar":
			util.listaCliente();
			break;
		case "remover":
			util.removeCliente();
			break;
		}
	}
	
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
			out.println("Opções: \nDigite Adicionar para cadastrar um venda\n"+					
					"Digite Listar para exibir a lista de vendas cadastradas\n"+
					"Digite Remover para remover uma venda");
			acao = scanner.nextLine();
			menuVenda(acao);
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
