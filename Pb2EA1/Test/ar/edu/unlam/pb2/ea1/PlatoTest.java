package ar.edu.unlam.pb2.ea1;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PlatoTest {
	@Test
	public void testQueSePuedanAgregarIngredientesIguales() {
		Plato platito = new Plato("pizza", " ", 1, 2, 3);
		Ingrediente ingre1 = new Ingrediente("aceituna", 2, 10);
		Ingrediente ingre2 = new Ingrediente("aceituna", 2, 10);
		Ingrediente ingre3 = new Ingrediente("aceituna", 2, 10);

		platito.AgregarIngredientesAlPlato(ingre1);
		platito.AgregarIngredientesAlPlato(ingre2);
		platito.AgregarIngredientesAlPlato(ingre3);

		assertEquals(3, platito.getIngredientes().size());
	}

	@Test
	public void testQueSeObtengaLaCantidadDeSalCorrecta() {
		Plato platito = new Plato("pizza", " morron", 1, 2, 3);
		Ingrediente ingre1 = new Ingrediente("aceituna", 1, 15);
		platito.AgregarIngredientesAlPlato(ingre1);

		Integer valEsperado = 1;

		assertEquals(valEsperado, platito.obtenerCantidadaDeSal());

	}
	@Test
	public void testQueSeObtenegaLaCanidadDeAzucarCorrecta() {
		Plato platito = new Plato("pizza", " morron", 1, 2, 3);
		Ingrediente ingre1 = new Ingrediente("aceituna", 1, 20);
		platito.AgregarIngredientesAlPlato(ingre1);
		
		Integer valEsperado=20;
		
		assertEquals(valEsperado,platito.obtenerCantidadDeAzucar());
	}

}
