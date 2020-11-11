package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.Vetor;

public class Teste {

	public static void main(String[] args) {

		Vetor vet = new Vetor(10);

		vet.adiciona("B");
		vet.adiciona("C");
		vet.adiciona("E");
		vet.adiciona("F");
		vet.adiciona("G");

		System.out.println(vet);
		vet.adiciona(0, "A");
		System.out.println(vet);
		vet.adiciona(3, "D");
		System.out.println(vet);

	}

}
