package br.com.db1.colecoes;

import java.util.Arrays;

public class ExemploArray {

	public String[] getNomes() {
		String[] alunosTurmaDb1Start = new String[3];
		alunosTurmaDb1Start[0] = "alexander";
		alunosTurmaDb1Start[1] = "silas";
		alunosTurmaDb1Start[2] = "elielson";
		return null;
	}

	public Integer[] ordenaNumeros(Integer[] numeros) {
		Arrays.sort(numeros);
		return numeros;
	}
}