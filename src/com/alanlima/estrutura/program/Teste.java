package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.Vetor;

public class Teste {

	public static void main(String[] args) {
	
		Vetor vet = new Vetor(10);
		
		vet.adiciona("elemento1");
		vet.adiciona("elemento2");
	
		System.out.println(vet.busca(0));
	}

}
