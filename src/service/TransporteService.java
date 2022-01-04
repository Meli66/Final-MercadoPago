package service;

import dominio.Transporte;

public class TransporteService {

	public String cargarPase(Transporte transporte, double monto) {

		if (transporte.getRed().equalsIgnoreCase("SUBE")) {

			transporte.setSaldo(transporte.getSaldo() + monto);

			return "Tu saldo actual del pase es de: " + transporte.getSaldo();

		} else if (transporte.getRed().equalsIgnoreCase("REDBUSCOR")) {

			transporte.setSaldo(transporte.getSaldo() + monto + 100);

			return "Tu saldo actual del pase es de: " + transporte.getSaldo();

		} else if (transporte.getRed().equalsIgnoreCase("CIUDADANA")) {

			transporte.setSaldo(transporte.getSaldo() + monto * 2);

			return "Tu saldo actual del pase es de: " + transporte.getSaldo();

		}

		return " ";

	}

}
