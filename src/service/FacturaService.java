package service;



import javax.swing.JOptionPane;

import dominio.Factura;
import dominio.Usuario;
import service.UsuarioService;

public class FacturaService {


	
	
	public String pagarFactura(Factura factura, Usuario usuario) {
		
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
			 
			 if(usuario.getSaldo() >= precioAPagar) {
				 
				 usuario.setSaldo(usuario.getSaldo() - precioAPagar);
				
				 return "El pago de su factura se ha realizado con exito, su saldo actual es de: " + usuario.getSaldo();
				 
			 }else {
				 
				 return " Saldo insuficiente";
				 
			 }
			
			
			 
			 
			}else if(cantidadKW > 120){
				
				precioAPagar = 45.3 + (cantidadKW - 120) * 1.5;
				
				 usuario.setSaldo(usuario.getSaldo() - precioAPagar);
				
				 return "El pago de su factura se ha realizado con exito, su saldo actual es de: " + usuario.getSaldo();
				
			}else {
				
				 return " Saldo insuficiente";
				
			}
			
			
		}
	
		
		return null;
	
	}
	
	
	












}
	
	

