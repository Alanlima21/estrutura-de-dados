package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.Vetor;

public class Teste {

	public static void main(String[] args) {

		Vetor vet = new Vetor(3);

		vet.adiciona("B");
		vet.adiciona("G");
		vet.adiciona("D");
		vet.adiciona("E");
		vet.adiciona("F");

		
		System.out.println(vet);
		
		vet.remove(1);
		
		System.out.println(vet);

	}

}
