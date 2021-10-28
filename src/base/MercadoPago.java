package base;

public abstract class MercadoPago {
	
	
	public abstract String ingresarDinero(Usuario usuario, double montoAIngresar);
	
	public abstract String extraerDinero(Usuario usuario, double montoAExtraer);
	
	

}
