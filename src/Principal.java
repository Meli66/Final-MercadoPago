
	

import javax.swing.JOptionPane;

import dominio.Tarjeta;
import dominio.Usuario;
import service.TarjetaService;
import service.UsuarioService;


	public class Principal {
		

	

		public static void main (String[] Args) {
			
          
           int opciones;
         
			UsuarioService usuarioService = new UsuarioService();
			TarjetaService tarjetaService = new TarjetaService();
			
			
			opciones = Integer.parseInt(JOptionPane.showInputDialog("Bienvedino a Mercado Pago! \n Para registrarse ingrese - 1 - \n"
					+ "Para logearse ingrese - 2 - \n Para salir ingrese - 3 - "));
			
			
			
			  while(opciones != 3) {
				
				
				
				if(opciones == 1) {
					
					
					String email = JOptionPane.showInputDialog("Ingrese un email: ");
					String password = JOptionPane.showInputDialog("Ingrese un password: ");
					
					
					
					 String mensajeOperacionExitosa = usuarioService.registroUsuario(new Usuario(email, password));
					
					
					System.out.println(mensajeOperacionExitosa);
					
					
					
				}// fin del if registro opcion 1
				
				
				if (opciones == 2 ) {
					
					String email = JOptionPane.showInputDialog("Ingrese un email: ");
					String password = JOptionPane.showInputDialog("Ingrese un password: ");
					
					Usuario usuario = new Usuario(email,password);
					
					boolean esValido = usuarioService.validarUsuario(usuario);
					
					
					if(esValido) {
						
						
						System.out.print(" El usuario " + usuario.getEmail() + " fue logeado exitosamente.");
						
						
						JOptionPane.showMessageDialog(null,"Bienvenido a Mercado Pago, aqui podras transferir dinero con otros usuarios, \n"
								+ "Pagar y/o hacer recargas en tu celular, pagar tus servicios de agua y luz entre otros. \n"
								+ "Empecemos! ");
						
						int opcionesFuncionalidades = Integer.parseInt(JOptionPane.showInputDialog("Si desea editar su email y/o password ingrese - 1 - \n"
								+ "Si desea eliminar su usuario ingrese - 2 - \n"
								+ "Para ingresar una nueva tarjeta ingrese - 3 - \n"
								+ "Para eliminar una tarjeta ingrese - 4 - \n"
								+ "Para realizar una transferenica ingrese - 5 - \n"
								+ "Para continuar ingrese - 6 - "));
								
						while (opcionesFuncionalidades != 6) {
							
							if(opcionesFuncionalidades == 1) {
								
								
								usuarioService.editarUsuario(usuario); 
								
								
								System.out.println(" Su usuario ha sido editado exitosamente.");
								
								
							}//fin del if editar
							
							
							if(opcionesFuncionalidades == 2) {
								
								
								usuarioService.eliminarUsuarioPorEmail(email);
								
							
								System.out.println("Su usuario ha sido eliminado exitosamente.");
								
							}
							

								
								if(opcionesFuncionalidades == 3) {
									
									int numeroDeCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese su numero de cuenta: "));
									String clave = JOptionPane.showInputDialog("Ingrese la clave de seguridad de su tarjeta: ");
									int saldo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el saldo de su tarjeta: "));
									
									Tarjeta tarjeta = new Tarjeta(numeroDeCuenta,clave, saldo);
									tarjetaService.registroTarjeta(tarjeta);
										
										
									System.out.println("Saldo es de " + saldo);
										
										
								
								}// fin del if 
								
								 if(opcionesFuncionalidades == 4 ) {
									 
									String claveSeguridad = JOptionPane.showInputDialog("Ingrese la clave de seguridad de la tarjeta que desea eliminar ");
									 
									tarjetaService.eliminarTarjetaPorClave(claveSeguridad);
									 
									 
									 
								 }
								 
								 if(opcionesFuncionalidades == 5) {
									 
		
									 
									int numeroDeCuenta = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el numero de cuenta de la tarjeta destinataria a la que "
											+ "desea transferir: "));
									
									 String claveSeguridad = JOptionPane.showInputDialog("Ingrese clave de seguridad de la tarjeta origen de la transferencia:  ");
									 
									 double montoATransferir = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el monto a transferir: "));
									 
									 
									 
									 tarjetaService.transferirDinero(montoATransferir, claveSeguridad, numeroDeCuenta);
									 
									
									 
									 
									 
								 }
								
							
							
							
							
							 opcionesFuncionalidades = Integer.parseInt(JOptionPane.showInputDialog("Si desea editar su email y/o password ingrese - 1 - \n"
										+ "Si desea eliminar su usuario ingrese - 2 - \n"
										+ "Para ingresar una nueva tarjeta ingrese - 3 - \n"
										+ "Para eliminar una tarjeta ingrese - 4 - \n"
										+ "Para realizar una transferenica ingrese - 5 - \n"
										+ "Para continuar ingrese - 6 - "));
							
							
						}//fin del while funcionalidades
						
						
						
						
					
						
					}else {
						
						System.out.println(" El usario y/o password don incorrectos");
						
					} //fin del if else validar 
					
					
					
				}//fin del if validacion logeo opcion 2
				
				
				
				
				
				
			opciones = Integer.parseInt(JOptionPane.showInputDialog("Para registrarse ingrese - 1 - \n"
						+ "Para logearse ingrese - 2 - \n Para salir ingrese - 3 - "));
				
				
				
			} // fin del while logear y registrar
			
			
			
			
			
		 
			
			
			
			
		}

	
	}

