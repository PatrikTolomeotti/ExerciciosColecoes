package br.com.db1.colecoes;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class ExemploColecao {

	private List<String> nomesDb1Start = new ArrayList<>();
	
	public void adicionarNomes(String nome){
		nomesDb1Start.add(nome);
	}
	
	public void removerNomes(String nome){
		nomesDb1Start.remove(nome);
	}
	
	public Boolean estaNaLista(String nome){
		return nomesDb1Start.contains(nome);
	}
	
	public void percorrerList(){
		Iterator lista = nomesDb1Start.iterator();
		while(lista.hasNext()){
			System.out.println(lista.next());
		}
	}
	
	public Integer tamanhoLista(){
		return nomesDb1Start.size();
	}

	public Integer quantidadeItensDentroLista(ExemploColecao colecao) {
		return colecao.tamanhoLista();
	}

	public Integer removeTresItensLitaRetornaQuantidadeTest(ExemploColecao colecao) {
		// TODO Auto-generated method stub
		return null;
	}

	public List<String> getListaOrdenada() {
		Collections.sort(nomesDb1Start);
		return nomesDb1Start;
	}
}
