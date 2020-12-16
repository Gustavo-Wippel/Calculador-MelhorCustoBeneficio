package telaPrincipal;

import java.util.Scanner;

import back_Pizza.dadosPizza;
import pizzas_E_CB.adicionaEntradas;
import pizzas_E_CB.calcCB;

public class telaPizza {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		calcCB cb = new calcCB();
		adicionaEntradas addEntradas = new adicionaEntradas();
		
		Scanner sc = new Scanner(System.in);
		
		boolean continuar = true;
		int escolha = 0;
		
		String nomeComercial;
		float tamanhoPizza;
		float precoPizza;
		
		
		while(continuar) {
			System.out.println("1 - Cadastrar Pizza");
			System.out.println("2 - Gerar Relatório");
			System.out.println("3 - Finalizar Programa");
			escolha = sc.nextInt();
			
			switch (escolha) {
			case 1:
				System.out.println("Informe o nome da pizza: ");
				nomeComercial = sc.next();
				
				System.out.println("Informe o tamanho da pizza em diâmetros: ");
				tamanhoPizza = sc.nextFloat();
				
				System.out.println("Informe o preço da Pizza: ");
				precoPizza = sc.nextFloat();
				
				dadosPizza addPizza = new dadosPizza(nomeComercial, tamanhoPizza, precoPizza);
				cb.calculaCB(addPizza.getTamanhoPizza(), addPizza.getPrecoPizza());
				addEntradas.verificaTamanho(addPizza);
				continuar = true;
				break;

			case 2:
				addEntradas.ordenaArray();
				addEntradas.geradorRelatorio();
				continuar = true;
				
			case 3:
				System.out.println("Finalizando o programa...");
				continuar = false;
				break;
			default:
				System.out.println("Opção não presente, finalizando execução");
				continuar = false;
				break;
			}
			
		}
	}

}
