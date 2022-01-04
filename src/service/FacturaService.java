package service;

import javax.swing.JOptionPane;

import dominio.Factura;
import dominio.Usuario;
import service.UsuarioService;

public class FacturaService {

	public String pagar(Factura factura, Usuario usuario) {

		int inicioDelMedidor;
		int finalDelMedidor;
		double cantidadKW;
		double precioAPagar;

		if (factura.getTipo().equalsIgnoreCase("Luz")) {

			if (factura.getEmpresa().equalsIgnoreCase("Edesur")) {

				inicioDelMedidor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el inicio de su medidor: "));
				finalDelMedidor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el final de su medidor: "));

				cantidadKW = finalDelMedidor - inicioDelMedidor;

				if (cantidadKW <= 120) {

					precioAPagar = 45.3;

					if (usuario.getSaldo() >= precioAPagar) {

						usuario.setSaldo(usuario.getSaldo() - precioAPagar);

						return "El pago de su factura de luz Edesur se ha realizado con exito, su saldo actual es de: "
								+ usuario.getSaldo();

					} else {

						return " Saldo insuficiente";

					}

				} else if (cantidadKW > 120) {

					precioAPagar = 45.3 + (cantidadKW - 120) * 1.5;

					usuario.setSaldo(usuario.getSaldo() - precioAPagar);

					return "El pago de su factura de luz Edesur se ha realizado con exito, su saldo actual es de: "
							+ usuario.getSaldo();

				} else {

					return " Saldo insuficiente";

				}

			} else if (factura.getEmpresa().equalsIgnoreCase("Edenor")) {

				inicioDelMedidor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el inicio de su medidor: "));
				finalDelMedidor = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el final de su medidor: "));

				cantidadKW = finalDelMedidor - inicioDelMedidor;

				if (cantidadKW <= 140) {

					precioAPagar = 48.6;

					if (usuario.getSaldo() >= precioAPagar) {

						usuario.setSaldo(usuario.getSaldo() - precioAPagar);

						return "El pago de su factura de luz Edenor se ha realizado con exito, su saldo actual es de: "
								+ usuario.getSaldo();

					} else {

						return " Saldo insuficiente";

					}

				} else if (cantidadKW > 140) {

					precioAPagar = 48.6 + (cantidadKW - 140) * 1.5;

					usuario.setSaldo(usuario.getSaldo() - precioAPagar);

					return "El pago de su factura de luz Edenor se ha realizado con exito, su saldo actual es de: "
							+ usuario.getSaldo();

				} else {

					return " Saldo insuficiente";

				}

			}

		} else if (factura.getTipo().equalsIgnoreCase("Gas")) {

			double cantidadMetrosCubicos = Double
					.parseDouble(JOptionPane.showInputDialog("Ingrese la cantidad de m3 consumidos: "));
			double precioAPagarGas;

			if (cantidadMetrosCubicos <= 150) {

				precioAPagarGas = 210.8;

				if (usuario.getSaldo() >= precioAPagarGas) {

					usuario.setSaldo(usuario.getSaldo() - precioAPagarGas);

					return "El pago de su factura de gas MetroGAS se ha realizado con exito, su saldo actual es de: "
							+ usuario.getSaldo();

				} else {

					return " Saldo insuficiente";

				}

			} else if (cantidadMetrosCubicos > 150) {

				precioAPagarGas = 210.8 + (cantidadMetrosCubicos - 150) * 1.5;

				if (usuario.getSaldo() >= precioAPagarGas) {

					usuario.setSaldo(usuario.getSaldo() - precioAPagarGas);

					return "El pago de su factura de gas MetroGas se ha realizado con exito, su saldo actual es de: "
							+ usuario.getSaldo();

				} else {

					return " Saldo insuficiente";

				}

			}

		}

		return null;

	}

}
