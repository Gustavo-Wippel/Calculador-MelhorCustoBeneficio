package pizzas_E_CB;

public class calcCB {
	
	/**
	 * Função responsável pelo cálculo do custo benefício
	 * @param tamanho - tamanho da pizza em diâmetros
	 * @param preco - preço da pizza
	 * @return - retorna o custoBenefício da pizza cujo tamanho e preço foram passados nos parâmetros
	 */
	public float calculaCB(float tamanho, float preco) {
		float raioPizza = tamanho/2;
		float circunferenciaPizza = (float) Math.PI *(raioPizza * raioPizza);
		float custoBeneficio = preco/circunferenciaPizza;
		
		return custoBeneficio;
	}
	
	

}
