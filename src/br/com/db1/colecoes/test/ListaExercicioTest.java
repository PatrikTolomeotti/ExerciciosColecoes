package br.com.db1.colecoes.test;

import java.util.Set;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.com.db1.colecoes.ListaExercicio;

public class ListaExercicioTest {

	private ListaExercicio exercicio;

	@Before
	public void iniciar() {
		exercicio = new ListaExercicio();
	}

	@Test
	public void getVogaisTest() {
		Set<String> vogais = exercicio.getVogais("Fusca");
		Assert.assertTrue(2 == vogais.size());
		Assert.assertFalse(vogais.contains("F"));
		Assert.assertTrue(vogais.contains("u"));
		Assert.assertFalse(vogais.contains("s"));
		Assert.assertFalse(vogais.contains("c"));
		Assert.assertTrue(vogais.contains("a"));
	}

	@Test
	public void getConsoantesTest() {
		Set<String> consoantes = exercicio.getConsoantes("Fusca");
		Assert.assertTrue(3 == consoantes.size());
		Assert.assertTrue(consoantes.contains("F"));
		Assert.assertFalse(consoantes.contains("u"));
		Assert.assertTrue(consoantes.contains("s"));
		Assert.assertTrue(consoantes.contains("c"));
		Assert.assertFalse(consoantes.contains("a"));
	}

	@Test
	public void getDezValoresNumericosRemoveTerceiraPosicaoTest() {
		Set<Integer> valoresNumericos = exercicio.DezValoresNumericosRemoveTerceiraPosicao(10);
		Assert.assertTrue(9 == valoresNumericos.size());
		Assert.assertFalse(10 == valoresNumericos.size());
	}
}
