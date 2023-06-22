package Banco;

public class CuentaBancaria {

	private String cbu;
	private tipoCuenta tipo;
	private double saldo;
	private Persona titular;
	
	CuentaBancaria(tipoCuenta tipo, Persona titular){
		this.setCbu(this.generarCbu());
		this.setTipo(tipo);
		this.setSaldo(0);
		this.setTitular(titular);
	}
	
	private void setCbu(String cbu) {
		this.cbu = cbu;
	}

	private void setTipo(tipoCuenta tipo) {
		this.tipo = tipo;
	}
	
	

	private void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	private void setTitular(Persona titular) {
		this.titular = titular;
	}

	public String getCbu() {
		return cbu;
	}

	public tipoCuenta getTipo() {
		return tipo;
	}

	public double getSaldo() {
		return saldo;
	}

	public Persona getTitular() {
		return titular;
	}
	
	public double obtenerSaldo() {
		return this.saldo;
	}
	
	public void depositar(double valor) {
		 if(valor > 0) {
			 this.setSaldo(this.saldo + valor);
		 }
	
	}
	
	public boolean extraer(double valor) {
		boolean transaccion;
		if(valor >= this.getSaldo()) {
			transaccion = false;
			
		} else {
			transaccion = true;
			this.setSaldo(this.saldo - valor);
		}
		return transaccion;
		
	}


	private String generarCbu() {
		return "2323323";
	
	}

	@Override
	public String toString() {
		return "CuentaBancaria [cbu=" + cbu + ", tipo=" + tipo + ", saldo=" + saldo + ", titular=" + titular + "]";
	}
	
	
	
}
