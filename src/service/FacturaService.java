package service;



import javax.swing.JOptionPane;

import dominio.Factura;
import dominio.Usuario;
import service.UsuarioService;

public class FacturaService {


	
	
	public String pagarFacturaDeLuz(Factura factura, String email) {
		
		int inicioDelMedidor;
		int finalDelMedidor;
		double cantidadKW;
		double precioAPagar;
		
		
		
		if (factura.getTipo().equalsIgnoreCase("Luz")) {
			
			 inicioDelMedidor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el inicio de su medidor: "));
		     finalDelMedidor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el final de su medidor: "));	
			
		     cantidadKW = finalDelMedidor - inicioDelMedidor;
		
			if (cantidadKW <= 120) {
				
			 precioAPagar = 45.3;
			
			
			}else {
				
				precioAPagar = 45.3 + (cantidadKW - 120) * 1.5;
				
			}
			
			
		
			
			
			
		}
		
		
		
		return "Ingrese un servicio valido";
		
	
		
	}
		
		
		
		
	}
	
	
	}
	
	
}
