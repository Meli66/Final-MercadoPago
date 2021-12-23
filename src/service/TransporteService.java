package service;

import dominio.Transporte;

public class TransporteService {

	
	public String cargarPase(Transporte transporte, double monto) {
		
		
		
		transporte.setSaldo(transporte.getSaldo() + monto);
		
		return "Tu saldo actual del pase es de: " + transporte.getSaldo();
		
		
	}
	
	
}
