package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.VetorGenerics;
import com.alanlima.estrutura.domain.pilha.Pilha;

public class Teste {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();
		
	
		
		System.out.println(pilha.topo());
		pilha.empilha(1);
		pilha.empilha(2);
		System.out.println(pilha);
		System.out.println(pilha.topo());
	}

}
