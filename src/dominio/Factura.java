package dominio;

public class Factura {

	private String tipo;
	private String empresa;

	public Factura(String tipo, String empresa) {

		this.tipo = tipo;
		this.empresa = empresa;

	}

	public String getTipo() {

		return tipo;

	}

	public String getEmpresa() {

		return empresa;
	}

}
