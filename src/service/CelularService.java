package service;

import dominio.Celular;

public class CelularService {

	public String recarga(Celular celular, double monto) {

		if (celular.getEmpresa().equalsIgnoreCase("Movistar")) {

			if (monto <= 200) {

				celular.setSaldo(celular.getSaldo() + monto);

				return "Tu recarga ha sido realizada con exito, " + "\n tu saldo es de : " + celular.getSaldo();
			} else if (monto > 200) {

				celular.setSaldo(celular.getSaldo() + monto * 2);

				return "Tu recarga ha sido realizada con exito y con movistar duplicaste tu credito,"
						+ "\n tu saldo es de : " + celular.getSaldo();

			}

		} else if (celular.getEmpresa().equalsIgnoreCase("Claro")) {

			if (monto <= 150) {

				celular.setSaldo(celular.getSaldo() + monto);

				return "Tu recarga ha sido realizada con exito, " + "\n tu saldo es de : " + celular.getSaldo();
			} else if (monto > 150) {

				celular.setSaldo(celular.getSaldo() + monto * 3);

				return "Tu recarga ha sido realizada con exito y con Claro triplicaste tu credito,"
						+ "\n tu saldo es de : " + celular.getSaldo();

			}

		}

		return " ";

	}

}
