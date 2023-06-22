package Banco;
import Banco.tipoCuenta;




public class Test {

	public static void main(String[] args) {
		
	Domicilio direccion1 = new Domicilio();
	direccion1.setCalle("yatai");
	direccion1.setBarrio("240");
	direccion1.setAltura("Almagro");
	
	Persona persona1 = new Persona("fulano", "gomez", "232323", direccion1);

	
	CuentaBancaria cuenta1 = new CuentaBancaria(tipoCuenta.CAJA_DE_AHORRO, persona1);

	
	
	
	}

}
