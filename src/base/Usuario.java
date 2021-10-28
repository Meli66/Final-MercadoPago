package base;

public class Usuario {

	private String usuario;
	private String password;
	private String email;
	private String nombre;
	private String apellido;
	private String dni;
	private String telefono;
	
	
	public Usuario(String usuario, String password, String nombre, String apellido, String dni, String email, String telefono){
		
		this.usuario = usuario;
		this.password = password;
		this.nombre = nombre;
		this.apellido = apellido;
		this.dni = dni;
		this.email = email;
		this.telefono = telefono;
		
	}
	
	
	public String getUsuario() {
		
		return usuario;
		
	}
	
	public String getPassword() {
		
		return password;
		
	}
	
	public String getNombre() {
		
		return nombre;
		
	}
	
	public String getApellido() {
		
		return apellido;
		
	}
	
	public String getDni() {
		
		return dni;
		
	}
	
	public String getEmail() {
		
		return email;
		
	}
	
	public String getTelefono() {
		
		return telefono;
		
	}
	
	public String setUsuario(String usuario) {
		
		return usuario;
		
	}
	
	public String setPassword(String password) {
		
		return password;
		
	}
	
	public String setEmail(String email) {
		
		return email;
		
	}

	
	
	
	
	
	
	
}
