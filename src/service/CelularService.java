package service;

import dominio.Celular;

public class CelularService {

	
	
	public String recarga(Celular celular, double monto) {
		
		
		if(celular.getEmpresa().equalsIgnoreCase("movistar")) {
			
			if(monto <= 200) {
				
				celular.setSaldo(celular.getSaldo() + monto);
				
				return "Tu recarga ha sido realizada con exito, "
						+ "\n tu saldo es de : " + celular.getSaldo();				
			}else if(monto > 200) {
				
				celular.setSaldo(celular.getSaldo() + monto * 2);
				
				return "Tu recarga ha sido realizada con exito y duplicaste tu credito,"
				+ "\n tu saldo es de : " + celular.getSaldo();	
				
			}
		
			
		}
		
		return " ";
		
	}
	

	
	
	
	
}
