package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.VetorGenerics;
import com.alanlima.estrutura.domain.pilha.Pilha;

public class Teste {

	public static void main(String[] args) {

		Pilha<Integer> pilha = new Pilha<>();
		
	
		System.out.println(pilha.estaVazia());
		
		pilha.empilha(1);
		
		System.out.println(pilha.estaVazia());
	}

}
