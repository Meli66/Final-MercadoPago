package dominio;

public class Usuario {

	private String email;
	private String password;
	private double saldo;

	public Usuario(String email, String password, double saldo) {

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

	public void setEmail(String email) {

		this.email = email;

	}

	public void setPassword(String password) {

		this.password = password;

	}

	public void setSaldo(double saldo) {

		this.saldo = saldo;

	}

}
