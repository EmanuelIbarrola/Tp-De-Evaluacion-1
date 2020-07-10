package ar.edu.unlam.pb2.ea1;

import java.util.ArrayList;
import java.util.Iterator;

public class Plato {

	private String nombrePlato;
	private String fideo;
	private Integer papa;
	private Integer puresica;
	private Integer zanaoria;
	private ArrayList<Ingrediente> ingredientes = new ArrayList<Ingrediente>();

	public Plato(String nombrePlato, String fideo, Integer papa, Integer puresica, Integer zanaoria) {
		this.nombrePlato = nombrePlato;
		this.fideo = fideo;
		this.papa = papa;
		this.puresica = puresica;
		this.zanaoria = zanaoria;

	}

	public Boolean AgregarIngredientesAlPlato(Ingrediente aa) {
		return ingredientes.add(aa);

	}

	public Boolean BuscarIngrediente(String ingrediente) {
		Iterator<Ingrediente> et = ingredientes.iterator();
		while (et.hasNext()) {
			Ingrediente aux = et.next();
			if (aux.getNombre().equals(ingrediente)) {
				return true;
			}

		}
		return false;
	}

	public Boolean EliminaIngrediente(String ingrediente) {
		Iterator<Ingrediente> et = ingredientes.iterator();
		while (et.hasNext()) {
			Ingrediente aux = et.next();
			if (aux.getNombre().equals(ingrediente)) {
				et.remove();
				return true;
			}

		}
		return false;
	}

	public Integer obtenerCantidadaDeSal() {
		for (Ingrediente ingrediente : ingredientes) {
			return ingrediente.getCantidadSal();
		}
		return null;
	}

	public Integer obtenerCantidadDeAzucar() {
		for (Ingrediente ingrediente : ingredientes) {
			return ingrediente.getCantidadAzucar();
		}
		return null;
	}

	public String getFideo() {
		return fideo;
	}

	public void setFideo(String fideo) {
		this.fideo = fideo;
	}

	public Integer getPapa() {
		return papa;
	}

	public void setPapa(Integer papa) {
		this.papa = papa;
	}

	public Integer getPuresica() {
		return puresica;
	}

	public void setPuresica(Integer puresica) {
		this.puresica = puresica;
	}

	public Integer getZanaoria() {
		return zanaoria;
	}

	public void setZanaoria(Integer zanaoria) {
		this.zanaoria = zanaoria;
	}

	public ArrayList<Ingrediente> getIngredientes() {
		return ingredientes;
	}

	public void setIngredientes(ArrayList<Ingrediente> ingredientes) {
		this.ingredientes = ingredientes;
	}

	public String getNombrePlato() {
		return nombrePlato;
	}

	public void setNombrePlato(String nombrePlato) {
		this.nombrePlato = nombrePlato;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nombrePlato == null) ? 0 : nombrePlato.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Plato other = (Plato) obj;
		if (nombrePlato == null) {
			if (other.nombrePlato != null)
				return false;
		} else if (!nombrePlato.equals(other.nombrePlato))
			return false;
		return true;
	}

}
