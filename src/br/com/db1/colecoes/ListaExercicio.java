package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Set;

public class ListaExercicio {
	List<String> vogais = new ArrayList<>();
	List<String> consoantes = new ArrayList<>();

	public ListaExercicio(){
		vogais.add("a");
		vogais.add("A");
		vogais.add("e");
		vogais.add("E");
		vogais.add("i");
		vogais.add("I");
		vogais.add("o");
		vogais.add("O");
		vogais.add("u");
		vogais.add("U");
		
		consoantes.add("b");
		consoantes.add("B");
		consoantes.add("c");
		consoantes.add("C");
		consoantes.add("d");
		consoantes.add("D");
		consoantes.add("f");
		consoantes.add("F");
		consoantes.add("g");
		consoantes.add("G");
		consoantes.add("h");
		consoantes.add("H");
		consoantes.add("j");
		consoantes.add("J");
		consoantes.add("k");
		consoantes.add("K");
		consoantes.add("l");
		consoantes.add("L");
		consoantes.add("m");
		consoantes.add("M");
		consoantes.add("n");
		consoantes.add("N");
		consoantes.add("p");
		consoantes.add("P");
		consoantes.add("q");
		consoantes.add("Q");
		consoantes.add("r");
		consoantes.add("R");
		consoantes.add("s");
		consoantes.add("S");
		consoantes.add("t");
		consoantes.add("T");
		consoantes.add("v");
		consoantes.add("V");
		consoantes.add("w");
		consoantes.add("W");
		consoantes.add("x");
		consoantes.add("X");
		consoantes.add("y");
		consoantes.add("Y");
		consoantes.add("z");
		consoantes.add("Z");
	}

	public Set<String> getVogais(String nomeParametro) {
		
		Set<String> vogaisEncontradas = new HashSet<>();
		
		for (Integer x = 0 ; x < nomeParametro.length(); x++){
			String letra = nomeParametro.substring(x, x+1);
			
			if (vogais.contains(letra)){
				vogaisEncontradas.add(letra);
			}
		}

		return vogaisEncontradas;
	}

	public Set<String> getConsoantes(String nomeParametro) {
		
		Set<String> consoantesEncontradas = new HashSet<>();
		for (Integer x = 0 ; x < nomeParametro.length(); x++){
			String letra = nomeParametro.substring(x, x+1);
			
			if (consoantes.contains(letra)){
				consoantesEncontradas.add(letra);
			}
		}

		return consoantesEncontradas;
	}

	public List<Integer> removeTerceiraPosicao(List<Integer> valores) {
		valores.remove(2);
		return valores;
	}

	public List<Integer> multiplosTres(List<Integer> valores) {
		List<Integer> valoresMultiplosTres = new ArrayList<>();
		Iterator<Integer> it = valores.iterator();
		while(it.hasNext()) {
			Integer valor = it.next();
			
			if(valor > 0 && valor % 3 == 0) {
				valoresMultiplosTres.add(valor);
			}
		}
		return valoresMultiplosTres;
	}

	public List<Integer> multiplosDois(List<Integer> valores) {
		List<Integer> valoresMultiplosDois = new ArrayList<>();
		Iterator<Integer> it = valores.iterator();
		while(it.hasNext()) {
			Integer valor = it.next();
			
			if(valor > 0 && valor % 2 == 0) {
				valoresMultiplosDois.add(valor);
			}
		}
		return valoresMultiplosDois;
	}

	
}
