package dominio;

public class Celular {
	
	private String numero;
	private String empresa;
	private double saldo;
	
	
	public Celular (String numero, String empresa, double saldo) {
		
		this.numero = numero;
		this.empresa = empresa;
		this.saldo = saldo;
		
		
	}

	
	public String getNumero() {
		
		return numero;		
		
	}
	
	
	public String getEmpresa() {
		
		
		return empresa;
		
	}
	
	public double getSaldo() {
		
		return saldo;
		
	}
	
	
	public double setSaldo(double saldo) {
		
		return saldo;
		
	}
	

}
