package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class Extra {

	@Test
	public void TestqueBuscaPlatos() {
		Plato plato1 = new Plato("guiso", "moños", 2, 2, 2);
		Ingrediente ingre1= new Ingrediente("oregano", 2, 17);
		
		plato1.AgregarIngredientesAlPlato(ingre1);
		
		DietaDiaria dieta = new DietaDiaria();
		dieta.AgregarPlatosAlDia(plato1);
		
		assertEquals(true, dieta.BuscarplatosDelDia("guiso"));
		
	}
	
	@Test
	public void TestqueEliminaPlatos() {
		Plato plato1 = new Plato("guiso", "moños", 2, 2, 2);
		Ingrediente ingre1= new Ingrediente("oregano", 2, 17);
		
		plato1.AgregarIngredientesAlPlato(ingre1);
		
		DietaDiaria dieta = new DietaDiaria();
		dieta.AgregarPlatosAlDia(plato1);
		
		assertEquals(true, dieta.EliminarPlatos("guiso"));
		
	}
	
	@Test
	public void TestqueBuscaIngrediente() {
		Plato plato1 = new Plato("guiso", "moños", 2, 2, 2);
		Ingrediente ingre1= new Ingrediente("oregano", 2, 17);
		
		plato1.AgregarIngredientesAlPlato(ingre1);
		
		DietaDiaria dieta = new DietaDiaria();
		dieta.AgregarPlatosAlDia(plato1);
		
		assertEquals(true, plato1.BuscarIngrediente("oregano"));
		
	}
	
	@Test
	public void TestqueEliminaIngrediente() {
		Plato plato1 = new Plato("guiso", "moños", 2, 2, 2);
		Ingrediente ingre1= new Ingrediente("oregano", 2, 17);
		
		plato1.AgregarIngredientesAlPlato(ingre1);
		
		DietaDiaria dieta = new DietaDiaria();
		dieta.AgregarPlatosAlDia(plato1);
		
		assertEquals(true, plato1.EliminaIngrediente("oregano"));
		
	}
}
