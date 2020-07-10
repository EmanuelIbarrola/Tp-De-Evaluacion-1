package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;

public class Hipertenso extends Paciente{
	private Integer prensionMinima;
	private Integer presionMaxima;
	private ArrayList<DietaDiaria> ingesta;
	
	public Hipertenso(String nombre, String Apellido, Integer Dni) {
		super(nombre, Apellido, Dni);
		this.ingesta=new ArrayList<>();
	}

	@Override
	public void agregarDietaDiaria(DietaDiaria dieta) {
		if(dieta.aptaHipertenso()) {
		ingesta.add(dieta);
		}
	}

	public Integer getPrensionMinima() {
		return prensionMinima;
	}

	public void setPrensionMinima(Integer prensionMinima) {
		this.prensionMinima = prensionMinima;
	}

	public Integer getPresionMaxima() {
		return presionMaxima;
	}

	public void setPresionMaxima(Integer presionMaxima) {
		this.presionMaxima = presionMaxima;
	}

	public ArrayList<DietaDiaria> getIngesta() {
		return ingesta;
	}

	public void setIngesta(ArrayList<DietaDiaria> ingesta) {
		this.ingesta = ingesta;
	}
	
	
	
	
	
	
}
