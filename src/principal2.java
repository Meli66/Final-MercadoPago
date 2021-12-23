import javax.swing.JOptionPane;

import dominio.Celular;
import dominio.Factura;
import dominio.Transporte;
import dominio.Usuario;
import service.CelularService;
import service.FacturaService;
import service.TransporteService;
import service.UsuarioService;

public class principal2 {

	public static void main(String[] args) {
		
		
		UsuarioService usuarioService = new UsuarioService();
		FacturaService facturaService = new FacturaService();
		CelularService celularService = new CelularService();
		TransporteService transporteService = new TransporteService();
	
		
		 String opciones = JOptionPane.showInputDialog("Bienvenido Mercado Pago! Para registrarse ingrese 1"
	    		+ "\n Para logearse ingrese 2"
				+ "\n Para editar un usuario ingrese 3"
				+ "\n Para eliminar un usuario ingrese 4"
				+ "\n Para pagar una factura ingrese 5"
				+ "\n Para realizar una recarga celular ingrese 6"
				+ "\n Para cargar pase de transporte ingrese 7"
				+ "\n Para salir ingrese 8");
				
		
		
		
		 while(!opciones.equalsIgnoreCase("8")) {	
		
		
			
			
			
			if(opciones.equalsIgnoreCase("1")) {
				
				String email = JOptionPane.showInputDialog("Ingrese un email");
				String password = JOptionPane.showInputDialog("Ingrese un password");
				double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su saldo disponible"));
				
			    usuarioService.registroUsuario(new Usuario(email,password,saldo));
			    
			
			    
			    
			}else  if(opciones.equalsIgnoreCase("2")) {
			
			String email = JOptionPane.showInputDialog("Ingrese su email");
			String password = JOptionPane.showInputDialog("Ingrese su password");
			
			boolean esValido = usuarioService.validarUsuario(email, password);
			

			if(esValido) {
				
				
				System.out.print(" El usuario " + email + " fue logeado exitosamente.");
				
				
			}
			
			
			
		}else if(opciones.equalsIgnoreCase("3")) {
			
			String email = JOptionPane.showInputDialog("Ingrese su email");
			String password = JOptionPane.showInputDialog("Ingrese su password");
			
			usuarioService.editarUsuario(email, password);
			
			System.out.println("Su usuario ha sido editado exitosamente");
			
			
		}else if(opciones.equalsIgnoreCase("4")) {
			
			
			String email = JOptionPane.showInputDialog("Ingrese su email");
			
			usuarioService.eliminarUsuarioPorEmail(email);
			
			System.out.println("Su usuario ha sido eliminado exitosamente");
			
		} else if(opciones.equalsIgnoreCase("5")) {
			
			
			String email = JOptionPane.showInputDialog("Ingrese el email del usuario con el que desea abonar");
			String tipo = JOptionPane.showInputDialog("Ingrese el tipo de factura que desea abonar(Ej: Luz)");
			
		
				Factura factura = new Factura(tipo);
				Usuario usuario = usuarioService.buscarUsuario(email);
				
			System.out.println(facturaService.pagarFactura(factura, usuario));
			
			
		}else if(opciones.equalsIgnoreCase("6")) {
			
			
			String numero = JOptionPane.showInputDialog("Ingrese su numero de celular");
			String empresa = JOptionPane.showInputDialog("Ingrese la empresa de su celular(Ej: movistar)");
			double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su saldo disponible actual"));
			
			Celular celular = new Celular(numero,empresa,saldo);
			
			double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que desea recargar"));
			
			System.out.println(celularService.recarga(celular, monto));
			
			
			
			
		}else if(opciones.equalsIgnoreCase("7")) {
			
			
			String red = JOptionPane.showInputDialog("Ingrese la red del transporte");
			double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el saldo actual de su pase"));
			double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que desea cargar"));
			
			Transporte transporte = new Transporte(red,saldo);
			
			System.out.println(transporteService.cargarPase(transporte, monto));
			
			
		}
		
	
		
		 
		 
		  opciones = JOptionPane.showInputDialog("Bienvenido Mercado Pago! Para registrarse ingrese 1"
		    		+ "\n Para logearse ingrese 2"
					+ "\n Para editar un usuario ingrese 3"
					+ "\n Para eliminar un usuario ingrese 4"
					+ "\n Para pagar una factura ingrese 5"
					+ "\n Para realizar una recarga celular ingrese 6"
					+ "\n Para cargar pase de transporte ingrese 7"
					+ "\n Para salir ingrese 8");
		 
		 
		 
		 
		}//fin del while
		
		
		
		
	}
	
		
		
		

	}


