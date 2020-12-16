package pizzas_E_CB;

public class calcCB {
	
	/**
	 * Fun��o respons�vel pelo c�lculo do custo benef�cio
	 * @param tamanho - tamanho da pizza em di�metros
	 * @param preco - pre�o da pizza
	 * @return - retorna o custoBenef�cio da pizza cujo tamanho e pre�o foram passados nos par�metros
	 */
	public float calculaCB(float tamanho, float preco) {
		float raioPizza = tamanho/2;
		float circunferenciaPizza = (float) Math.PI *(raioPizza * raioPizza);
		float custoBeneficio = preco/circunferenciaPizza;
		
		return custoBeneficio;
	}
	
	

}
