
	

import javax.swing.JOptionPane;


import dominio.Usuario;

import service.UsuarioService;


	public class Principal {
		

	

		public static void main (String[] Args) {
			
          
          String opciones;
         
			UsuarioService usuarioService = new UsuarioService();
			
			
			
			
			opciones = JOptionPane.showInputDialog("Bienvedino a Mercado Pago! \n Para registrarse ingrese - 1 - \n"
					+ "Para logearse ingrese - 2 - \n Para salir ingrese - 3 - ");
			
			
			
			  while(!opciones.equalsIgnoreCase("3")) {
				
				
				
				if(opciones.equalsIgnoreCase("1")) {
					
					
					String email = JOptionPane.showInputDialog("Ingrese un email: ");
					String password = JOptionPane.showInputDialog("Ingrese un password: ");
					double saldo = Double.parseDouble(JOptionPane.showInputDialog("Ingrese su saldo disponible: "));
					
				  Usuario usuario = new Usuario(email, password, saldo);
				  
					
					 String mensajeOperacionExitosa = usuarioService.registroUsuario(usuario);
					
					
					System.out.println(mensajeOperacionExitosa);
					
					
					
					
					
				}// fin del if registro opcion 1
				
				
				if (opciones.equalsIgnoreCase("2")) {
					
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
									
									email = JOptionPane.showInputDialog("Ingrese el email del usuario con el cual desea abonar");
									
									System.out.println(usuarioService.recorrerArray(email));
										
									}
									
									
									
										
								
								}// fin del if 
								
								
							
							
							
							
							 opcionesFuncionalidades = JOptionPane.showInputDialog("Si desea editar su email y/o password ingrese - 1 - \n"
										+ "Si desea eliminar su usuario ingrese - 2 - \n"
										+ "Para pagar un factura ingrese - 3 -  \n"
										+ "Para continuar ingrese - 4 - ");
							
							
						}//fin del while funcionalidades
						
						
						
						
					
						
					}else {
						
						System.out.println(" El usario y/o password don incorrectos");
						
					} //fin del if else validar 
					
					
					
				}//fin del if validacion logeo opcion 2
				
				
				
				
				
				
			opciones = JOptionPane.showInputDialog("Para registrarse ingrese - 1 - \n"
						+ "Para logearse ingrese - 2 - \n Para salir ingrese - 3 - ");
				
				
				
			} // fin del while logear y registrar
			
			
			
			
			
		 
			
			
			
			
		}

	
	

