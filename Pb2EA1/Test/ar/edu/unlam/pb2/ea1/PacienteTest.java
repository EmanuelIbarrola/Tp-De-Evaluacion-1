package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PacienteTest {
	@Test
	public void testQueUnDiabeticoIngesteDietaAptaParaDiabetico() {
		Plato plato1 = new Plato("Asado", " ", 4, 2, 3);
		Ingrediente ingre1 = new Ingrediente("mayonesa", 2, 20);
		DietaDiaria dietita = new DietaDiaria();

		plato1.AgregarIngredientesAlPlato(ingre1);
		dietita.AgregarPlatosAlDia(plato1);

		Diabetico diabeti = new Diabetico("Messi", "lionel", 1234);
		
		 diabeti.agregarDietaDiaria(dietita);
		 
		assertEquals(1,diabeti.getIngesta().size());

	}

	@Test
	public void testQueUnDiabeticoNoIngesteDietaAptaParaDiabetico() {
		Plato plato1 = new Plato("Asado", " ", 4, 2, 3);
		Ingrediente ingre1 = new Ingrediente("mayonesa", 2, 30);
		DietaDiaria dietita = new DietaDiaria();

		plato1.AgregarIngredientesAlPlato(ingre1);
		dietita.AgregarPlatosAlDia(plato1);

		Diabetico diabeti = new Diabetico("Messi", "lionel", 1234);
			
		assertEquals(0,diabeti.getIngesta().size());


	}
	@Test
	public void testQueUnHipertendoIngesteDietaAptaParaHipertenso() {
		
		Plato platon = new Plato("paspel de papa", " ", 10, 3, 4);
		Ingrediente ingredi= new Ingrediente("oregano", 2, 15);
		DietaDiaria dieti = new DietaDiaria();
		
		platon.AgregarIngredientesAlPlato(ingredi);
		dieti.AgregarPlatosAlDia(platon);
			
		Hipertenso hipertenso= new Hipertenso("juan", "salomon", 1234);
		hipertenso.agregarDietaDiaria(dieti);
		
		assertEquals(1, hipertenso.getIngesta().size());

	}
	@Test
	public void testQueUnHipertendoNoIngesteDietaAptaParaHipertenso() {

		Plato platon = new Plato("paspel de papa", " ", 10, 3, 4);
		Ingrediente ingredi= new Ingrediente("oregano", 4, 25);
		DietaDiaria dieti = new DietaDiaria();
		
		platon.AgregarIngredientesAlPlato(ingredi);
		dieti.AgregarPlatosAlDia(platon);
			
		Hipertenso hipertenso= new Hipertenso("david", "salomon", 1234);
		
		hipertenso.agregarDietaDiaria(dieti);
		
		assertEquals(0, hipertenso.getIngesta().size());

	}
}
