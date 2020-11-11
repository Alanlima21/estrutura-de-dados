package com.alanlima.estrutura.domain;

public class Vetor {

	private String[] elementos;
	private int tamanho;
	
	public Vetor(int capacidade) {
		this.elementos = new String[capacidade];
		this.tamanho =0;
	}
	
	/*public void adiciona(String elemento) {
		for(int i=0; i<elementos.length; i++) {
			if(elementos[i] == null) {
				elementos[i] = elemento;
				break;
			}
		}
	}*/
	
	public boolean adiciona(String elemento) {
		if(tamanho < elementos.length) {
			elementos[tamanho] = elemento;
			tamanho++;
			return true;
		}
		return false;
	}
	
	public String busca(int posicao) {
		if(!(posicao >= 0 && posicao < tamanho)) {
			throw new IllegalArgumentException("Posição inválida");
		}
		return elementos[posicao];
	}
	
	public int busca(String elemento) {
		for(int i=0; i<tamanho; i++) {
			if(elementos[i].equalsIgnoreCase(elemento)) {
				return i;
			}
		}
		return -1;
	}

	public int tamanho(){
		return tamanho;
	}
	
	@Override
	public String toString() {
		StringBuilder s = new StringBuilder();
		s.append("[");
		
		for(int i=0; i<tamanho-1; i++) {
			s.append(elementos[i]);
			s.append(", ");
		}
		
		if(tamanho > 0) {
			s.append(elementos[tamanho-1]);
		}
		
		s.append("]");
		
		return s.toString();
	}
	
}
