package service;


import java.util.ArrayList;
import java.util.List;

import dominio.Tarjeta;


public class TarjetaService {
	
	
	
	private List<Tarjeta> tarjetas = new ArrayList<Tarjeta>();

	public String registroTarjeta(Tarjeta tarjeta) {

		tarjetas.add(tarjeta);

		return "El usuario con mail " + tarjeta.getClaveSeguridad() + " fue registrado exitosamente!";

	}
	

	public void eliminarTarjetaPorClave(String claveSeguridad) {

		for (Tarjeta tarjeta : tarjetas) {

			if (tarjeta.getClaveSeguridad().equalsIgnoreCase(claveSeguridad)){
				
				tarjetas.remove(tarjeta);

			}

		}

	}
	

	public void transferirDinero(double montoATransferir, String claveSeguridad, int numeroDeCuenta) {
		
		

	for(Tarjeta tarjetaDestino : tarjetas) {
		
		if(tarjetaDestino.getNumeroDeCuenta() == numeroDeCuenta) {
			
			
			for (Tarjeta tarjetaOrigen : tarjetas) {
				
				
				if(tarjetaOrigen.getClaveSeguridad().equalsIgnoreCase(claveSeguridad)) {
					
					if(tarjetaOrigen.getSaldo() >= montoATransferir) {
						
						
						tarjetaDestino.setSaldo(tarjetaDestino.getSaldo() + montoATransferir);
						
						tarjetaOrigen.setSaldo(tarjetaOrigen.getSaldo() - montoATransferir);
						
						
						System.out.println("La transferencia se ha realizado con exito.");
					
						
						System.out.println("El saldo del destinatario es de: " + tarjetaDestino.getSaldo());
						System.out.println("El saldo de la tarjeta origen es de: " + tarjetaOrigen.getSaldo());
						
						
					}else {
						
						System.out.println("El monto a transferir supera el saldo disponible. No es posible realizar la transferencia.");
						
					}
			
			
		      	}else {
					
					System.out.println("Clave de seguridad es incorrecta.");
					
				}
		
			
			}
		
		}else {
			
			System.out.println("El numero de cuenta es incorrecto.");
			
		}
		
	}//primer for
	
	
	
}
	
	
	

}
