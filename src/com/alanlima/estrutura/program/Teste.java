package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.VetorGenerics;
import com.alanlima.estrutura.domain.pilha.Pilha;

public class Teste {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();
		
		for(int i=1; i<=10; i++) {
			pilha.empilha(i);
		}
		
		System.out.println(pilha);
		System.out.println(pilha.tamanho());
	}

}
