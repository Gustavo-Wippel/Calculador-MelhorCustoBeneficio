package pizzas_E_CB;

import back_Pizza.dadosPizza;

public class adicionaEntradas {

	private dadosPizza novaPizza;
	private dadosPizza[] adicionaPizza = new dadosPizza[40];
	private int qtdCadastrada = 0;
	
	/**
	 * Função responsável por adicionarPizzas a um array, com o objetivo
	 * de possibilitar o acréscimo de várias pizzas.
	 * @param pizza - Recebe os dados gerais da pizza
	 */
	public void adicionaPizza(dadosPizza pizza) {
		adicionaPizza = expandeArray(adicionaPizza);
		for (int i = 0; i < adicionaPizza.length; i++) {
			if (adicionaPizza[i] == null) {
				adicionaPizza[i] = pizza;
				break;
			}
		}
	}
	
	/**
	 * Função responsável por expandir o array das pizzas, permitindo o cadastro de várias.
	 * @param arrayPizza - Parâmetro que contém os dados do tipo "dadosPizza".
	 * @return - retorna o tamanho do array
	 */
	private dadosPizza[] expandeArray(dadosPizza[] arrayPizza) {
		dadosPizza[] expansor = new dadosPizza[arrayPizza.length + 1];
		
		for (int i = 0; i < arrayPizza.length; i++) {
			if (expansor[i] == null) {
				expansor[i] = arrayPizza[i];
				
			}
		}
		return expansor;
	}
	
	/**
	 * Função responsável por informar os dados de uma pizza
	 * @return - retorna dados de uma Pizza indexados de I
	 */
	public dadosPizza getPizzas() {
		for (int i = 0; i < adicionaPizza.length; i++) {
			if (adicionaPizza[i] != null) {
				return adicionaPizza[i];
			}
		}
		return null;
	}
	/**
	 * Função responsável por captar o tamanho de uma pizza, verificando se há iguais.
	 * Em caso verdadeiro, retorna nulo.
	 * Em caso falso, retorna uma mensagm de que a pizza foi adicionada ao array "adicionaPizza"
	 * @param pizza - parâmetro com dados da pizza
	 * 
	 */
	public String verificaTamanho(dadosPizza pizza) {
		for (int i = 0; i < this.adicionaPizza.length; i++) {
			if (adicionaPizza[0] == null) {
				adicionaPizza(pizza);
				qtdCadastrada++;
				break;
			}
			
			if (this.adicionaPizza[i] != null && pizza.getCB() != this.adicionaPizza[i].getTamanhoPizza()) {
				adicionaPizza(pizza);
				qtdCadastrada++;
				System.out.println(qtdCadastrada);
				break;
				
			}else {
				System.out.println("Tamanho já cadastrado");
				break;
			}
		}
		return null;
	}
	/**s
	 * Função responsável por ordenar o array adicionaPizza em forma de que o melhor custo benefício fique no primeira posição.
	 */
	public void ordenaArray() {
		dadosPizza trocaDados;
		int i = 0;
		int k = 0;
		for (i = 0; i < qtdCadastrada ; i++) {
			float captaPrimeiroValor = this.adicionaPizza[i].getCB();
			for (k = 0; k < qtdCadastrada; k++) {
				
				//System.out.println(this.adicionaPizza[2].getCB());
	
				float captaSegundoValor = this.adicionaPizza[k].getCB();

				if (captaPrimeiroValor < captaSegundoValor) {
					trocaDados = this.adicionaPizza[i];
					this.adicionaPizza[i] = adicionaPizza[k];
					this.adicionaPizza[k] = trocaDados;
					break;
				}
			}
		}
	}
	/**
	 * Método que realiza o relatório completo, colocando em primeira linha o melhor custo benefício, assim como os outros.
	 * Em alguns casos é viável gerar o relatório mais de uma vez, afinal ocorrem alguns bugs.
	 */
	public void geradorRelatorio() {
		int i = 0;
		
		if (this.adicionaPizza[i].getNomeComercial() != null) {
			
			while(this.adicionaPizza[i]!= null && this.adicionaPizza[i].getNomeComercial() != null) {
				if (i == 0) {
					System.out.println("Nome da Pizza: " + this.adicionaPizza[0].getNomeComercial() + "| Tamanho: " + this.adicionaPizza[0].getTamanhoPizza() + "| "
							+ "CB: " + this.adicionaPizza[0].getCB() + " | Melhor CB");
					i++;
				}
				else {
					System.out.println("Nome da Pizza: " + this.adicionaPizza[i].getNomeComercial() + "| Tamanho: " + this.adicionaPizza[i].getTamanhoPizza() + "| "
							+ "CB: " + this.adicionaPizza[i].getCB() + " | Percentual: " + ((adicionaPizza[i].getCB() * 100) / adicionaPizza[0].getCB() - 100 +"%"));
					i++;
				}
			}
		} else {
			System.out.println("Relatório já foi gerado ou não há pizzas cadastradas");
		}
	}
}
