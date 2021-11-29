package dominio;




public class Tarjeta {
	
	private int numeroDeCuenta;
	private String claveSeguridad;
	private double saldo;
	
	
	public Tarjeta(int numeroDeCuenta, String claveSeguridad, double saldo) {
		
		this.numeroDeCuenta = numeroDeCuenta;
		this.claveSeguridad = claveSeguridad;
		this.saldo = saldo;
		
		
	}
	
	
	public int getNumeroDeCuenta() {
		
		return numeroDeCuenta;
		
	}


	public String getClaveSeguridad() {
		
		
		return claveSeguridad;
		
	}
	
	public double getSaldo() {
		
		return saldo;
		
	}
	
	public double setSaldo(double saldo) {
		
		return saldo;
		
	}

}
