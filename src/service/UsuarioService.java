package service;

import java.util.List;

import javax.swing.JOptionPane;

import dominio.Usuario;

import java.util.ArrayList;

public class UsuarioService {

	private List<Usuario> usuarios = new ArrayList<Usuario>();

	public void registrar(Usuario usuario) {

		usuarios.add(usuario);

	}

	public boolean validar(String email, String password) {

		for (Usuario usuarioFor : usuarios) {

			if (usuarioFor.getEmail().equalsIgnoreCase(email) && usuarioFor.getPassword().equalsIgnoreCase(password)) {

				return true;

			}

		}

		return false;
	}

	public void editar(String email, String password) {

		for (Usuario usuarioFor : usuarios) {

			if (usuarioFor.getEmail().equalsIgnoreCase(email) && usuarioFor.getPassword().equalsIgnoreCase(password)) {

				usuarioFor.setEmail(email);
				usuarioFor.setPassword(password);

			}

		}

	}

	public void eliminarUsuarioPorEmail(String email) {

		for (Usuario usuario : usuarios) {

			if (usuario.getEmail().equalsIgnoreCase(email)) {

				usuarios.remove(usuario);

			}

		}

	}

	public Usuario buscar(String email) {

		for (Usuario usuarioFor : usuarios) {

			if (usuarioFor.getEmail().equalsIgnoreCase(email)) {

				return usuarioFor;

			}

		}

		return null;

	}

	
	
	
	
}
