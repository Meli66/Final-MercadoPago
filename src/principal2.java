import javax.swing.JOptionPane;

import dominio.Celular;
import dominio.Factura;
import dominio.Usuario;
import service.CelularService;
import service.FacturaService;
import service.UsuarioService;

public class principal2 {

	public static void main(String[] args) {
		
		
		UsuarioService usuarioService = new UsuarioService();
		FacturaService facturaService = new FacturaService();
		CelularService celularService = new CelularService();
		
		Usuario meli = new Usuario("meli@gmail.com","123",20000);
		Usuario flor = new Usuario("flor@gmail.com","456",25000);
		
		
		String opciones = JOptionPane.showInputDialog("Bienvenido Mercado Pago, para logearse ingrese 1, para editar usuario ingrese 2,"
				+ "\n para eliminar un usuario ingrese 3, para pagar una factura ingrese 4, para realizar una recarga ingrese 5, para salir ingrese 6 ");
		
		
		while(!opciones.equalsIgnoreCase("6")) {
		
		
		
		if(opciones.equalsIgnoreCase("1")) {
			
			String email = JOptionPane.showInputDialog("Ingrese su email");
			String password = JOptionPane.showInputDialog("Ingrese su password");
			
			boolean esValido = usuarioService.validarUsuario(email, password);
			

			if(esValido) {
				
				
				System.out.print(" El usuario " + email + " fue logeado exitosamente.");
				
			}
			
			
			
		}//segundo if
		
		
		
		
		if(opciones.equalsIgnoreCase("2")) {
			
			String email = JOptionPane.showInputDialog("Ingrese su email");
			String password = JOptionPane.showInputDialog("Ingrese su password");
			
			usuarioService.editarUsuario(email, password);
			
			System.out.println("Su usuario ha sido editado exitosamente");
			
			
		}
		
		
		
		
		
		if(opciones.equalsIgnoreCase("3")) {
			
			
			String email = JOptionPane.showInputDialog("Ingrese su email");
			
			usuarioService.eliminarUsuarioPorEmail(email);
			
			System.out.println("Su usuario ha sido eliminado exitosamente");
			
		}
		
		
		
		if(opciones.equalsIgnoreCase("4")) {
			
			
			String email = JOptionPane.showInputDialog("Ingrese el email del usuario con el que desea abonar");
			String tipo = JOptionPane.showInputDialog("Ingrese el tipo de factura que desea abonar: Luz, Gas");
			
			if(email.equalsIgnoreCase(meli.getEmail())){
			
			Factura factura = new Factura (tipo);
			
			
			double precioAPagar = facturaService.pagarFactura(factura);
			
			
			   if(meli.getSaldo() >= precioAPagar) {
				   
				   meli.setSaldo(meli.getSaldo() - precioAPagar);
				   
				   
			   }
			
			   
			   System.out.println("saldo meli" + meli.getSaldo());
			
			
			}else if(email.equalsIgnoreCase(flor.getEmail())){
				
				Factura factura = new Factura (tipo);
				
				
				double precioAPagar = facturaService.pagarFactura(factura);
				
				
				   if(flor.getSaldo() >= precioAPagar) {
					   
					   flor.setSaldo(flor.getSaldo() - precioAPagar);
					   
					   
				   }
				
				   System.out.println("saldo flor" + flor.getSaldo());
				
			}
			
		
			
			
		}// if 4
		
		
		
		if(opciones.equalsIgnoreCase("5")) {
			
			
			String numero = JOptionPane.showInputDialog("Ingrese su numero de celular");
			String empresa = JOptionPane.showInputDialog("Ingrese la empresa de su celular");
			double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su saldo disponible actual"));
			
			Celular celular = new Celular(numero,empresa,saldo);
			
			double monto = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto que desea recargar"));
			
			System.out.println(celularService.recarga(celular, monto));
			
			
			
			
		}
		
		
		
		
		
		
		}//fin del while
		
		
		
		
	}
	
		
		
		

	}


