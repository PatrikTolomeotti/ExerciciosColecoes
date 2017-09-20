package br.com.db1.colecoes.test;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
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
	public void removeTerceiraPosicaoTest() {
		
		List<Integer> valores = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			valores.add(i * 10);
		}
		
		Assert.assertTrue(valores.contains(0));
		Assert.assertTrue(valores.contains(10));
		Assert.assertTrue(valores.contains(20));
		Assert.assertTrue(valores.contains(30));
		
		List<Integer> novosValores = exercicio.removeTerceiraPosicao(valores);
		Assert.assertTrue(novosValores.contains(0));
		Assert.assertTrue(novosValores.contains(10));
		Assert.assertFalse(novosValores.contains(20));
		Assert.assertTrue(novosValores.contains(30));
	}
	
	@Test
	public void multiplosTresTest() {
		List<Integer> valores = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			valores.add(i);
		}
		
		List<Integer> novosValores = exercicio.multiplosTres(valores);
		Assert.assertTrue(novosValores.contains(3));
		Assert.assertTrue(novosValores.contains(6));
		Assert.assertTrue(novosValores.contains(9));
		Assert.assertFalse(novosValores.contains(4));
	}
	
	@Test
	public void multiplosDoisTest() {
		List<Integer> valores = new ArrayList<>();
		for (int i = 0; i < 10; i++) {
			valores.add(i);
		}
		
		List<Integer> novosValores = exercicio.multiplosDois(valores);
		Assert.assertTrue(novosValores.contains(2));
		Assert.assertTrue(novosValores.contains(4));
		Assert.assertTrue(novosValores.contains(6));
		Assert.assertTrue(novosValores.contains(8));
		Assert.assertFalse(novosValores.contains(5));
	}
	
	@Test
	public void getDezTextosCopiaOutraColecaoTest() {
		List<String> textos = new ArrayList<>();
		textos.add("oi");
		textos.add("como vai a vida, o universo e tudo mais?");
		textos.add("vai bem e a sua?");
		textos.add("bem também");
		textos.add("novidades?");
		textos.add("sim, muitas!");
		textos.add("consegui atingir meu objetivo");
		textos.add("qual?");
		textos.add("aquele item raro");
		textos.add("legal, parabéns!");
		
		List<String> novosTextos = textos;
		Assert.assertEquals(novosTextos, textos);
		Assert.assertTrue(novosTextos.contains("sim, muitas!"));
	}
	
	@Test
	public void compareDuasListasTest() {
		List<String> planetas = new ArrayList<>();
		planetas.add("mercurio");
		planetas.add("venus");
		planetas.add("terra");
		planetas.add("marte");
		planetas.add("jupiter");
		planetas.add("saturno");
		planetas.add("urano");
		planetas.add("netuno");
		
		List<String> planetas2 = new ArrayList<>();
		planetas2.add("mercurio");
		planetas2.add("venus");
		planetas2.add("terra");
		planetas2.add("marte");
		planetas2.add("jupiter");
		planetas2.add("saturno");
		planetas2.add("urano");
		planetas2.add("netuno");
		planetas2.add("plutao");
		
		Assert.assertNotEquals(planetas, planetas2);
		planetas2.remove("plutao");
		Assert.assertEquals(planetas, planetas2);
	}
	
	@Test
	public void compareDuasSetTest() {
		Set<String> planetas = new HashSet<>();
		planetas.add("mercurio");
		planetas.add("venus");
		planetas.add("terra");
		planetas.add("marte");
		planetas.add("jupiter");
		planetas.add("saturno");
		planetas.add("urano");
		planetas.add("netuno");
		
		Set<String> planetas2 = new HashSet<>();
		planetas2.add("mercurio");
		planetas2.add("venus");
		planetas2.add("terra");
		planetas2.add("marte");
		planetas2.add("jupiter");
		planetas2.add("saturno");
		planetas2.add("urano");
		planetas2.add("netuno");
		planetas2.add("plutao");
		
		Assert.assertNotEquals(planetas, planetas2);
		planetas.add("plutao");
		Assert.assertEquals(planetas, planetas2);
	}
	
	
}
