package dominio;

public class Transporte {

	private String red;
	private double saldo;
	
	
	public Transporte (String red, double saldo) {
		
		this.red = red;
		this.saldo = saldo;
		
		
	}
	
	
	public String getRed() {
		
		return red;
		
	}
	
	
	public double getSaldo() {
		
		return saldo;
		
	}
	
	
	public void setSaldo(double saldo) {
		
		this.saldo = saldo;
		
	}
	
	
	
}
