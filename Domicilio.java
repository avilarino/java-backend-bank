package Banco;

public class Domicilio {

	String calle;
	String altura;
	String barrio;
	
	
	Domicilio(){
		this.setCalle(calle);
		this.setAltura(altura);
		this.setBarrio(barrio);
	}
	
	public void setCalle(String calle) {
		this.calle = calle;
	}


	public void setAltura(String altura) {
		this.altura = altura;
	}

	public void setBarrio(String barrio) {
		this.barrio = barrio;
	}

	
	public String getCalle() {
		return calle;
	}


	public String getAltura() {
		return altura;
	}


	public String getBarrio() {
		return barrio;
	}

	@Override
	public String toString() {
		return "Domicilio [calle=" + calle + ", altura=" + altura + ", barrio=" + barrio + "]";
	}
	
	
	
	
	
}
