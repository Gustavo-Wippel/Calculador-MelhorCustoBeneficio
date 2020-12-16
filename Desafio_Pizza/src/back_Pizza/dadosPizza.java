package back_Pizza;

import pizzas_E_CB.calcCB;

public class dadosPizza {
	
	private String nomeComercial;
	private float tamanhoPizza;
	private float precoPizza;
	private float custoBeneficio;
	
	public dadosPizza(String nomeComercial, float tamanhoPizza, float precoPizza) {
		setNomeComercial(nomeComercial);
		setPrecoPizza(precoPizza);
		setTamanhoPizza(tamanhoPizza);
		calcCB calculo = new calcCB();
		setCB(calculo.calculaCB(tamanhoPizza, precoPizza));
	}
	
	public String getNomeComercial() {
		return nomeComercial;
	}
	
	public void setNomeComercial(String nomeComercial) {
		this.nomeComercial = nomeComercial;
	}
	
	public float getTamanhoPizza() {
		return tamanhoPizza;
	}
	
	public void setTamanhoPizza(float tamanhoPizza) {
		this.tamanhoPizza = tamanhoPizza;
	}
	
	public float getPrecoPizza() {
		return precoPizza;
	}
	
	public void setPrecoPizza(float precoPizza) {
		this.precoPizza = precoPizza;
		
	}
	
	public float getCB() {
		return custoBeneficio;
	}
	
	public void setCB(float cb) {
		this.custoBeneficio = cb;
	}
	

}
