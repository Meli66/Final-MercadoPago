package dominio;

public class Usuario {

	private String email;
	private String password;
	
	
	

	
	
	public Usuario(String email, String password){
		
		this.email = email;
		this.password = password;
		
		
		
	}
	
	

	
	public String getPassword() {
		
		return password;
		
	}
	
	
	public String getEmail() {
		
		return email;
		
	}
	

	

	
	public String setEmail(String email) {
		
		return email;
		
	}


	public String setPassword(String password) {
		
		return password;
		
	}
	
	
	
	
	
	
}
