import static java.lang.System.out;

import java.util.Scanner;

/**
 * AppMain.java 
 * E' a classe main do programa.
 * Ela chama o menu principal e recebe a opcao que o usuario escolher, chamando o metodo defineAcao da classe Utils, que e' o switch principal. 
 * @author Graci
 *
 */
public class AppMain {

	private static Scanner scanner;

	public static void main(String[] args) {
			Utils util = new Utils();
			scanner = new Scanner(System.in);
			
			while(true){
			 out.println("Op��es: \nDigite Cliente para cadastrar um cliente\n"+
								"Digite Avi�o para cadastrar um avi�o\n"+
								"Digite Voo para cadastrar um voo\n"+
								"Digite Venda para efetuar uma venda\n"+
								"Digite Relatorio para visualizar os relatorios"+
								"\nOu digite Sair para fechar o programa.");
			 String acao = scanner.nextLine();
			 util.defineAcao(acao.toLowerCase());
			
			 

			}
	}

}
