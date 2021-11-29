package service;

import java.util.List;

import javax.swing.JOptionPane;

import dominio.Usuario;

import java.util.ArrayList;

public class UsuarioService {

	
	private List<Usuario> usuarios = new ArrayList<Usuario>();
	
	
	
	public String registroUsuario(Usuario usuario) {
		
		usuarios.add(usuario);
		
		return "El usuario con mail " + usuario.getEmail() + " fue registrado exitosamente!";
		
	}
	
	
	public boolean validarUsuario(Usuario usuario) {
		
		for (Usuario usuarioFor : usuarios) {
			
			if(usuarioFor.getEmail().equalsIgnoreCase(usuario.getEmail()) &&
					usuarioFor.getPassword().equalsIgnoreCase(usuario.getPassword())) {
				
				
				return true;
				
			}
				
		}
		
		
		
		return false;
	}
	
	
	public void editarUsuario(Usuario usuario) {
		
		for (Usuario usuarioFor : usuarios) {
			
			if(usuarioFor.getEmail().equalsIgnoreCase(usuario.getEmail())) {
				
				usuarioFor.setEmail(JOptionPane.showInputDialog("Ingrese un email nuevo: "));
				usuarioFor.setPassword(JOptionPane.showInputDialog("Ingrese un password nuevo: "));
				
				
				
			}else {
				
				System.out.println("Usuario incorrecto. Por favor ingrese un usuario valido: ");
				
				
			}
			
			
		}
		
		
	}
	
	
	
	public void eliminarUsuarioPorEmail(String email) {
		
		for (Usuario usuario : usuarios) {
			
			if(usuario.getEmail().equalsIgnoreCase(email)) {
				
				usuarios.remove(usuario);
				
				
				
			}
			
		}
		
		
		
	}
	

	
	
	
	
}
