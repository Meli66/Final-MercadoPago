package derivadas;
import base.MercadoPago;
import base.Usuario;

public class TarjetaMercadoPago extends MercadoPago{
	
	
	private double saldo;
	
	public TarjetaMercadoPago(double saldo){
		
		this.saldo = saldo;
		
		
		
	}

	@Override
	public String ingresarDinero(Usuario usuario, double montoAIngresar) {
		
		return null;
	}

	@Override
	public String extraerDinero(Usuario usuario, double montoAExtraer) {
		// TODO Auto-generated method stub
		return null;
	}
	
	
	public double getSaldo(){
		
		return saldo;
		
	}
	
	public double setSaldo(double saldo) {
		
		return saldo;
		
	}
	
	
	
	

}
