package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.Vetor;

public class Teste {

	public static void main(String[] args) {

		Vetor vet = new Vetor(3);

		vet.adiciona("B");
		vet.adiciona("C");
		vet.adiciona("E");
		vet.adiciona("F");
		vet.adiciona("G");

		
		System.out.println(vet);

	}

}
