package ar.edu.unlam.pb2.ea1;

import java.util.HashSet;
import java.util.Iterator;

public class DietaDiaria {

	private HashSet<Plato> platos;

	public DietaDiaria() {
		this.platos = new HashSet<>();

	}

	public Boolean AgregarPlatosAlDia(Plato platitos) {

		return platos.add(platitos);

	}

	public Boolean BuscarplatosDelDia(String nom) {
		Iterator<Plato> et = platos.iterator();
		while (et.hasNext()) {
			Plato plato = et.next();
			if (plato.getNombrePlato().equals(nom)) {
				return true;
			}
		}

		return false;
	}
	
	public Boolean EliminarPlatos(String nom) {
		Iterator<Plato> et = platos.iterator();
		while (et.hasNext()) {
			Plato plato = et.next();
			if (plato.getNombrePlato().equals(nom)) {
				et.remove();
				return true;
			}
		}

		return false;
	}
	
	
	
	

	private Integer totalDeSalEnDieta() {
		for (Plato plato : platos) {

			return plato.obtenerCantidadaDeSal();

		}
		return null;
	}

	private Integer totalDeAzucarEnDieta() {
		for (Plato plato : platos) {

			return plato.obtenerCantidadDeAzucar();

		}
		return null;
	}

	public Boolean aptaHipertenso() {
		if (totalDeSalEnDieta() <= 3) {
			return true;
		}

		return false;
	}

	public Boolean aptaDiabetico() {
		if (totalDeAzucarEnDieta() <= 25) {
			return true;
		}
		return false;
	}

	public HashSet<Plato> getPlatos() {
		return platos;
	}

	public void setPlatos(HashSet<Plato> platos) {
		this.platos = platos;
	}

}
