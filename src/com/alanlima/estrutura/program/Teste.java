package com.alanlima.estrutura.program;

import com.alanlima.estrutura.domain.Contato;
import com.alanlima.estrutura.domain.VetorObjetos;

public class Teste {

	public static void main(String[] args) {

		VetorObjetos vetor = new VetorObjetos(3);
		
		vetor.adiciona(5.2);
		vetor.adiciona(3);
		vetor.adiciona("Alan");
		
		System.out.println("Tamanho: " + vetor.tamanho());
		
		System.out.println(vetor);
		System.out.println("------------");
		
		Contato c1 = new Contato("Contato1", "54845163", "contato1@gmail.com");
		Contato c2 = new Contato("Contato2", "84874125", "contato2@gmail.com");
		Contato c3 = new Contato("Contato3", "13278008", "contato3@gmail.com");
		
		vetor.adiciona(c1);
		vetor.adiciona(c2);
		vetor.adiciona(c3);
		
		System.out.println(vetor);
		
	}

}
