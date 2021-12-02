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
	
	
	public boolean validarUsuario(String email, String password) {
		
		for (Usuario usuarioFor : usuarios) {
			
			if(usuarioFor.getEmail().equalsIgnoreCase(email) &&
					usuarioFor.getPassword().equalsIgnoreCase(password)) {
				
				
				return true;
				
			}
				
		}
		
		
		
		return false;
	}
	
	
	public void editarUsuario(String email, String password) {
		
		for (Usuario usuarioFor : usuarios) {
			
			if(usuarioFor.getEmail().equalsIgnoreCase(email) && usuarioFor.getPassword().equalsIgnoreCase(password)) {
				
				usuarioFor.setEmail(email);
				usuarioFor.setPassword(password);
				
				
				
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
	
	public String recorrerArray(String email) {
		
		
		for( Usuario usuario : usuarios){
			
			if(usuario.getEmail().equalsIgnoreCase(email)) {
				
				
				return usuario.getEmail();
				
				
				
			}
		
			
		}
		
		return "";
		
	}
	
	
	


	
	
	
	
}
