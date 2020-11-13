package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.VetorGenerics;

public class Teste {

	public static void main(String[] args) {

		VetorGenerics<String> vetor = new VetorGenerics<>(2);
		
		vetor.adiciona("elemento1");
		vetor.adiciona("elemento2");
	
		
		System.out.println(vetor);
		
	}

}
