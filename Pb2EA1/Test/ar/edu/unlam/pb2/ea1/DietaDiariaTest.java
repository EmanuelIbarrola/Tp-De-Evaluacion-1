package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DietaDiariaTest {
	@Test
	public void testQueNosePuedanAgregarPlatoRepetidos() {
		Plato plato1 = new Plato("guiso", "mostachole", 2, 1, 3);
		Ingrediente ingre1 = new Ingrediente("ajo", 1, 15);

		Plato plato2 = new Plato("guiso", "moños", 2, 1, 1);
		Ingrediente ingre2 = new Ingrediente("comino", 1, 15);

		Plato plato3 = new Plato("", "mostachole", 2, 1, 3);
		Ingrediente ingre3 = new Ingrediente("oregano", 1, 15);

		DietaDiaria dieta1 = new DietaDiaria();

		plato1.AgregarIngredientesAlPlato(ingre1);
		plato2.AgregarIngredientesAlPlato(ingre2);
		plato3.AgregarIngredientesAlPlato(ingre3);

		assertTrue(dieta1.AgregarPlatosAlDia(plato1));
		assertFalse(dieta1.AgregarPlatosAlDia(plato2));
		assertTrue(dieta1.AgregarPlatosAlDia(plato3));

	}

	@Test
	public void testQueDietaDiariaSeaAptaHipertenso() {
		Plato plato1 = new Plato("guiso", "mostachole", 2, 1, 3);
		Ingrediente ingre1 = new Ingrediente("sal marina", 1, 15);

		plato1.AgregarIngredientesAlPlato(ingre1);

		DietaDiaria dieta1 = new DietaDiaria();

		dieta1.AgregarPlatosAlDia(plato1);

		assertEquals(true, dieta1.aptaHipertenso());

	}

	@Test
	public void testQueDietaDiariaNoSeaAptaHipertenso() {
		Plato plato1 = new Plato("guiso", "mostachole", 2, 1, 3);
		Ingrediente ingre1 = new Ingrediente("sal marina", 7, 15);
		plato1.AgregarIngredientesAlPlato(ingre1);

		DietaDiaria dieta1 = new DietaDiaria();

		dieta1.AgregarPlatosAlDia(plato1);
		assertFalse(dieta1.aptaHipertenso());

	}

	@Test
	public void testQueDietaDiariaSeaAptaDiabetico() {
		Plato plato1 = new Plato("guiso", "mostachole", 2, 1, 3);
		Ingrediente ingre1 = new Ingrediente("huevo", 2, 15);
		plato1.AgregarIngredientesAlPlato(ingre1);

		DietaDiaria dieta1 = new DietaDiaria();

		dieta1.AgregarPlatosAlDia(plato1);

		assertTrue(dieta1.aptaDiabetico());
	}

	@Test
	public void testQueDietaDiariaNoSeaAptaDiabetico() {
		Plato plato1 = new Plato("guiso", "mostachole", 2, 1, 3);
		Ingrediente ingre1 = new Ingrediente("queso", 1, 50);
		plato1.AgregarIngredientesAlPlato(ingre1);

		DietaDiaria dieta1 = new DietaDiaria();

		dieta1.AgregarPlatosAlDia(plato1);

		assertFalse(dieta1.aptaDiabetico());
	}
}
