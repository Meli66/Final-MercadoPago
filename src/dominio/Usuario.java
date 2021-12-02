package dominio;

public class Usuario {

	private String email;
	private String password;
	private double saldo;
	
	
	

	
	
	public Usuario(String email, String password, double saldo){
		
		this.email = email;
		this.password = password;
		this.saldo = saldo;
		
		
		
	}
	
	

	
	public String getPassword() {
		
		return password;
		
	}
	
	
	public String getEmail() {
		
		return email;
		
	}
	
    public double getSaldo() {
    	
    	return saldo;
    	
    }
	

	
	public String setEmail(String email) {
		
		return email;
		
	}


	public String setPassword(String password) {
		
		return password;
		
	}
	
	
	public double setSaldo(double saldo) {
		
		return saldo;
		
	}
	
	
	
	
}
