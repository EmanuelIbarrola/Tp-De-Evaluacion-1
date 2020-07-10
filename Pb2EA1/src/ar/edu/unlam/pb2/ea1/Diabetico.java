package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Diabetico extends Paciente {
	private Integer azucarEnSangre;
	private ArrayList<DietaDiaria> ingesta;

	public Diabetico(String nombre, String Apellido, Integer Dni) {
		super(nombre, Apellido, Dni);
		this.ingesta = new ArrayList<>();
	}

	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		if (dieta.aptaDiabetico()) {
			ingesta.add(dieta);
		}
	}

	public Integer getAzucarEnSangre() {
		return azucarEnSangre;
	}

	public void setAzucarEnSangre(Integer azucarEnSangre) {
		this.azucarEnSangre = azucarEnSangre;
	}

	public ArrayList<DietaDiaria> getIngesta() {
		return ingesta;
	}

	public void setIngesta(ArrayList<DietaDiaria> ingesta) {
		this.ingesta = ingesta;
	}

}
