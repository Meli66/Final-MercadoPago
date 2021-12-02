
	

import javax.swing.JOptionPane;


import dominio.Usuario;
import dominio.Factura;
import service.UsuarioService;
import service.FacturaService;


	public class Principal {
		

	

		public static void main (String[] Args) {
			
          
         
         
			UsuarioService usuarioService = new UsuarioService();
			FacturaService facturaService = new FacturaService();
			
			Usuario meli = new Usuario("melisa@gmail.com", "123", 20000);
			Usuario flor = new Usuario("flor@gmail.com", "456", 30000);
			
			usuarioService.registroUsuario(meli);
			usuarioService.registroUsuario(flor);
			
			
			String opciones = JOptionPane.showInputDialog("Bienvedino a Mercado Pago! \n Para logearse - 1 - \n"
					+"\n Para salir ingrese - 3 - ");
			
			
			
			  while(!opciones.equalsIgnoreCase("3")) {
				
					 if (opciones.equalsIgnoreCase("1")) {
					
					String email = JOptionPane.showInputDialog("Ingrese un email: ");
					String password = JOptionPane.showInputDialog("Ingrese un password: ");
					
					
					
					boolean esValido = usuarioService.validarUsuario(email,password);
					
					
					if(esValido) {
						
						
						System.out.print(" El usuario " + email + " fue logeado exitosamente.");
						
						
						JOptionPane.showMessageDialog(null,"Bienvenido a Mercado Pago, aqui podras transferir dinero con otros usuarios, \n"
								+ "Pagar y/o hacer recargas en tu celular, pagar tus servicios de agua y luz entre otros. \n"
								+ "Empecemos! ");
						
						String opcionesFuncionalidades = JOptionPane.showInputDialog("Si desea editar su email y/o password ingrese - 1 - \n"
								+ "Si desea eliminar su usuario ingrese - 2 - \n"
								+ "Para pagar un factura ingrese - 3 -  \n"
								+ "Para continuar ingrese - 4 - ");
								
						while (!opcionesFuncionalidades.equalsIgnoreCase("4")) {
							
							if(opcionesFuncionalidades.equalsIgnoreCase("1")) {
								
								
								 email = JOptionPane.showInputDialog("Ingrese un email nuevo: ");
							     password = JOptionPane.showInputDialog("Ingrese un nuevo password: ");
								
								usuarioService.editarUsuario(email,password); 
								
								
								System.out.println(" Su usuario ha sido editado exitosamente.");
								
								
							}//fin del if editar
							
							
							if(opcionesFuncionalidades.equalsIgnoreCase("2")) {
								
								
								
								usuarioService.eliminarUsuarioPorEmail(email);
								
							
								System.out.println("Su usuario ha sido eliminado exitosamente.");
								
							}
							

								
								if(opcionesFuncionalidades.equalsIgnoreCase("3")) {
									
									email = JOptionPane.showInputDialog("Ingrese el email del usuario con el cual desea abonar: ");
								String	tipo = JOptionPane.showInputDialog("Ingrese el tipo de servicio que desea abonar: ");
									
									if(email.equalsIgnoreCase(meli.getEmail())) {
										
										Factura factura = new Factura (tipo);
								
										double precioAPagar = facturaService.pagarFacturaDeLuz(factura);
										
										
											
										if(meli.getSaldo() >= precioAPagar) {
											
											
											meli.setSaldo(meli.getSaldo() - precioAPagar);
											
											
											System.out.println(precioAPagar);
											System.out.println("Su factura esta paga, su saldo disponible es de : " + meli.getSaldo());
											
										}else {
											
										  System.out.println("Tu saldo disponible no es suficiente.");
											
										}
											
											
								  }
									
								}
									
									
								
								
									
									

								 opcionesFuncionalidades = JOptionPane.showInputDialog("Si desea editar su email y/o password ingrese - 1 - \n"
											+ "Si desea eliminar su usuario ingrese - 2 - \n"
											+ "Para pagar un factura ingrese - 3 -  \n"
											+ "Para continuar ingrese - 4 - ");	
										
								
								} //fin del while funcionalidades
								
								
							
							
							
							
							
				
						
					}else {
						
						System.out.println(" El usario y/o password don incorrectos");
						
					} //fin del if else validar 
					
				
					
					 }// fin primer if		
					
					
				opciones = JOptionPane.showInputDialog("Bienvedino a Mercado Pago! \n Para logearse - 1 - \n"
						+"\n Para salir ingrese - 3 - ");
					
					
					
				}// fin del while logear y registrar
				
				
				
				
				
		
				
			} 
			
			
	}	
			
			
	

			
			
			
	

	
	

