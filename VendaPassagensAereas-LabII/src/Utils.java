import java.util.*;

import static java.lang.System.out;
import models.Aviao;
import models.Cliente;
import models.Venda;
import models.Voo;

/**
 * Classe Utils, contem todos os metodos para incrementar o array dos 4 Beans (Aviao, Voo, Venda e Cliente)
 * Contem todos os metodos de validacao de todas as opcoes do menu (que tambem esta contido nesta classe)
 * @author Graci
 *
 */

	public class Utils {
	private Scanner scanner;
	private Cliente cliente;
	private Aviao aviao;
	private Voo voo;
	private Venda venda;
	
	public ArrayList<Cliente> listaCliente;
	public ArrayList<Aviao> listaAviao; 
	public ArrayList<Voo> listaVoo;
	public ArrayList<Venda> listaVenda;
	
	public static int increaseId = 0;
	
	public Utils() {
		scanner = new Scanner(System.in);
		listaCliente = new ArrayList<Cliente>();
		listaAviao = new ArrayList<Aviao>();
		listaVoo = new ArrayList<Voo>();
		listaVenda = new ArrayList<Venda>();
		
		Cliente c1 = new Cliente("Cliente 1", "99948568", "410022658");
		Cliente c2 = new Cliente("Cliente 2", "89948568", "410022659");
		Cliente c3 = new Cliente("Cliente 3", "88948568", "410022659");
		
		listaCliente.add(c1);
		listaCliente.add(c2);
		listaCliente.add(c3);
		
		Aviao a1 = new Aviao(1, "Airbus A380", 200);
		Aviao a2 = new Aviao(2, "Boeing 747", 10);
		Aviao a3 = new Aviao(3, "F-22", 2);
		
		listaAviao.add(a1);
		listaAviao.add(a2);
		listaAviao.add(a3);
		
		Voo v1 = new Voo(a1, "Munique", "Porto Alegre", "14:00"); v1.setIdVoo(increaseId++);
		Voo v2 = new Voo(a1, "Porto Alegre", "Munique", "16:00"); v2.setIdVoo(increaseId++);
		Voo v3 = new Voo(a2, "Porto Alegre", "Sao Paulo", "14:00"); v3.setIdVoo(increaseId++);
		Voo v4 = new Voo(a1, "Sao Paulo", "Porto Alegre", "10:00"); v4.setIdVoo(increaseId++);
		Voo v5 = new Voo(a3, "Sao Paulo", "Londres", "19:00"); v5.setIdVoo(increaseId++);
		Voo v6 = new Voo(a2, "Madrid", "Sao Paulo", "18:00"); v6.setIdVoo(increaseId++);
		
		listaVoo.add(v1);
		listaVoo.add(v2);
		listaVoo.add(v3);
		listaVoo.add(v4);
		listaVoo.add(v5);
		listaVoo.add(v6);
		
		listaVenda.add(new Venda(c1, v1)); a1.setQtdAssentos(a1.getQtdAssentos()-1);
		listaVenda.add(new Venda(c1, v2)); a1.setQtdAssentos(a1.getQtdAssentos()-1);
		listaVenda.add(new Venda(c1, v5)); a3.setQtdAssentos(a3.getQtdAssentos()-1);
		
		listaVenda.add(new Venda(c2, v4)); a1.setQtdAssentos(a1.getQtdAssentos()-1);
		listaVenda.add(new Venda(c2, v6)); a2.setQtdAssentos(a2.getQtdAssentos()-1);
		
		listaVenda.add(new Venda(c3, v1)); a1.setQtdAssentos(a1.getQtdAssentos()-1);
		listaVenda.add(new Venda(c3, v1)); a2.setQtdAssentos(a2.getQtdAssentos()-1);
	}
	
	/**
	 * Metodo para a verificacao das strings digitadas pelo usuario.
	 * Verifica se sao nulas ou nao, e retorna true quando nao sao.
	 *
	 */
	public boolean verificaString(String nome) {
		if(!nome.equals(null) && !nome.equals("") && !nome.isEmpty())
			return true;
		return false;
	}
	
	/**
	 * Metodo que verifica se o cliente ja existe na lista, atraves do RG
	 * @param rg O RG do cliente.
	 */
	
	public boolean clienteExiste(String rg) {
		for(Cliente x : listaCliente)
			if(x.getRg().equals(rg)) {
				return true;
			}
		return false;
	}

	/**
	 * Metodo que adiciona o cliente na lista.
	 * @param nome O nome do cliente.
	 * @param telefone O telefone do cliente (pode ser nulo).
	 * @param rg O RG do cliente.
	 */
	
	public void addCliente() {
		boolean isOver = false;
		 while(!isOver){
			 try{
				 scanner = new Scanner(System.in);
				 out.println("Digite o nome do cliente:");
				 String nome = scanner.nextLine();
					while (nome.isEmpty()) {
						System.err.println("Nome nao pode ser nulo");
						out.println("Digite o nome do cliente:");
						nome = scanner.nextLine();
					}
				 out.println("Digite o nome telefone:");
				 String telefone = scanner.nextLine();
				 out.println("Digite o RG do cliente:");
				 String rg = scanner.nextLine();
					while (rg.isEmpty() || !rg.matches("\\d{9}")) {
						System.err.println("RG nao pode ser nulo e deve conter 9 digitos.");
						out.println("Digite o RG do cliente:");
						rg = scanner.nextLine();
					}
				 
				 if(verificaString(nome) && verificaString(rg) && !clienteExiste(rg)) { //double check validation
					 this.cliente = new Cliente(nome, telefone, rg);
					 listaCliente.add(this.cliente);	
				 	 out.println("Cliente "+nome+" adicionado.");
					 isOver = true;
				 } else {
					 out.println("RG ja utilizado no sistema. Tente novamente.");
				 }
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		 }
	}
	
	/**
	 * Metodo que verifica se o aviao ja existe na lista.
	 * @param codigo O codigo do aviao.
	 */
	
	public boolean aviaoExiste(int codigo) {
		for(Aviao x : listaAviao)
			if(x.getCodigo() == codigo) {
				return true;
			}
		return false;
	}
		
	/**
	 * Metodo que busca o aviao na lista.
	 * @param codigo O codigo do aviao.
	 */
	
	public Aviao retornaAviao(int codigo) {
		for(int i = 0; i < listaAviao.size(); i++) {
			if(codigo == listaAviao.get(i).getCodigo())
				return listaAviao.get(i);
		}
		return null;
	}
	
	/**
	 * Metodo que adiciona o aviao na lista.
	 * @param nome O nome do aviao.
	 * @param codigo O codigo do aviao.
	 * @param qtdAssentos A quantidade de assentos do aviao.
	 */
	
	public void addAviao() {
		boolean isOver = false;
		 while(!isOver){
			 try{
				 scanner = new Scanner(System.in);
				 out.println("Digite o nome do aviao:"); //ARRUMAR
				 String nome = scanner.nextLine();
				 out.println("Digite o codigo do aviao:"); //ARRUMAR
				 int codigo = scanner.nextInt();
				 out.println("Digite a quantidade de assentos:"); //ARRUMAR
				 int qtdAssentos = scanner.nextInt();
				 
				 if(verificaString(nome) && (qtdAssentos > 0) && !aviaoExiste(codigo)) {
					 this.aviao = new Aviao(codigo, nome, qtdAssentos);			 
				 	 listaAviao.add(this.aviao);	
				 	 out.println("aviao adicionado!");
					 isOver = true;
				 } else {
					 out.println("aviao inválido, tente novamente!");
				 }
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		 }
	}

	/**
	 * Metodo que busca o voo na lista.
	 * @param 
	 */
	
	public Voo retornaVoo(int id) { //MUDAR PARA CODIGO VOO
		for(int i = 0; i < listaVoo.size(); i++) {
			if(id == listaVoo.get(i).getIdVoo())
				return listaVoo.get(i);
		}
		return null;
	}
	
	/**
	 * 
	 * @param 
	 */
	
	public void addVoo() {
		boolean isOver = false;
		 while(!isOver){
			 try{
				 scanner = new Scanner(System.in);
				 out.println("digite a origem do voo:");
				 String origem = scanner.nextLine();
				 out.println("digite o destino do voo:");
				 String destino = scanner.nextLine();
				 out.println("digite o horario do voo:");
				 String horario = scanner.nextLine();
				 out.println("digite o codigo do aviao:");
				 int codigo = scanner.nextInt();
				 this.aviao = retornaAviao(codigo);
				 
				 if(verificaString(origem) && verificaString(destino) && 
					 aviaoExiste(codigo) && this.aviao != null) {
					 this.voo = new Voo(this.aviao, origem, destino, horario);
					 this.voo.setIdVoo(increaseId++);
				 	 listaVoo.add(this.voo);	
				 	 out.println("voo adicionado! id do voo: "+this.voo.getIdVoo());
					 isOver = true;
				 } else {
					 out.println("voo inválido, tente novamente!");
				 }
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		 }
	}
	
	/**
	 * Metodo que busca o cliente na lista
	 * @param rg O RG do cliente.
	 */
	
	public Cliente retornaCliente(String rg) {
		for(int i = 0; i < listaCliente.size(); i++) {
			if(rg.equals(listaCliente.get(i).getRg())) {
				return listaCliente.get(i);
			}
		}
		return null;
	}
	
	/**
	 * Metodo que conclui a venda da passagem.
	 * @param rg O RG do cliente.
	 * @param MUDAR PARA CODIGO
	 */
	
	public void addVenda() {
		boolean isOver = false;
		 while(!isOver){
			 try{
				 scanner = new Scanner(System.in);
				 out.println("digite o rg do cliente:");
				 String rg = scanner.nextLine();
				 this.cliente = retornaCliente(rg);
				 out.println("digite o id do voo:");
				 int idVoo = scanner.nextInt();
				 this.voo = retornaVoo(idVoo);
				
				 if(retornaAviao(this.voo.getAviao().getCodigo()).getQtdAssentos() > 0) {
					 retornaAviao(this.voo.getAviao().getCodigo())
					  .setQtdAssentos(retornaAviao(this.voo.getAviao().getCodigo()).getQtdAssentos()-1);
					 
					 if(verificaString(rg) && this.voo != null && this.cliente != null) {
						 this.venda = new Venda(this.cliente, this.voo);
					 	 listaVenda.add(this.venda);	
					 	 out.println("venda efetuada!");
						 isOver = true;
					 } else {
						 out.println("venda invalida, tente novamente.");
					 }
				 }else {
					 out.println("o aviao está lotado!");
				 }
			 }catch(Exception e){
				 e.printStackTrace();
			 }
		 }
	}
	
	/**
	 * Metodo que verifica se o cliente ja existe na lista, atraves do RG
	 * @param rg O RG do cliente.
	 */
	
	public void relatorio() {
		out.println("\nTodas as Vendas:");
		HashMap<String, Integer> mapDestino = new HashMap<>();
		HashMap<String, Integer> mapOrigem = new HashMap<>();
 		for(int i = 0; i < listaVenda.size(); i++) {
 			String destinoVoo = listaVenda.get(i).getVoo().getDestino();
 			String origemVoo = listaVenda.get(i).getVoo().getOrigem();	
	 		 if(mapDestino.containsKey(destinoVoo)) {
	 			mapDestino.put(destinoVoo, mapDestino.get(destinoVoo)+1);
	 		 }else { 
	 			mapDestino.put(destinoVoo, 1);
	 		 }
	 		 if(mapOrigem.containsKey(origemVoo)) {
	 			mapOrigem.put(origemVoo, mapOrigem.get(origemVoo)+1);
	 		 } else { 
	 			mapOrigem.put(origemVoo, 1);
	 		 }
			out.println(listaVenda.get(i).getCliente()+"\tAviao: "+listaVenda.get(i).getVoo());
		}
 		out.println("\nDestinos com mais voos: ");
 		ordenador(mapDestino, "Destino");
 		out.println("\nOrigem das partidas dos voos: ");
 		ordenador(mapOrigem, "Origem");
 		out.println("\n");
	}
	
	/**
	 * Metodo que verifica se o cliente ja existe na lista, atraves do RG
	 * @param rg O RG do cliente.
	 */
	
	public void ordenador(HashMap<String, Integer> mapa, String direction) {
		  ArrayList<Integer> valuesDestino = new ArrayList<>();	
	      for (Integer valor  : mapa.values()) //pega valores do mapa
	 		   valuesDestino.add(valor);
	 	  for (Object i : valuesDestino.toArray()) //remove duplicados
	 	       if (valuesDestino.indexOf(i) != valuesDestino.lastIndexOf(i)) 
	 	          valuesDestino.remove(valuesDestino.lastIndexOf(i));
	 	  Collections.sort(valuesDestino); //ordena valores
	 	  out.println("\nRelatório "+direction+":");
	 	  for(int i = valuesDestino.size()-1; i >= 0; i--){
	 		for (Map.Entry<String, Integer> entry : mapa.entrySet())
	 		  if(valuesDestino.get(i) == entry.getValue())
	 			out.println(direction+": " + entry.getKey().toString() + " quantidade de voos: " + entry.getValue());
	 	   }
	}
	
	/**
	 * Switch com opcoes do menu
	 * @param acao A opcao escolhida pelo usuario.
	 */
	
	public void defineAcao(String acao) {
		switch(acao){
			 case "cliente":
				 addCliente();
			     break;
			 case "aviao":
				 addAviao();
				 break;
			 case "voo":
				 addVoo();
				 break;
			 case "venda":
				 addVenda();
				 break;
			 case "relatorio":
				 relatorio();
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
