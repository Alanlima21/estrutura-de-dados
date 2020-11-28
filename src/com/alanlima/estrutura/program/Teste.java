package com.alanlima.estrutura.program;

import java.util.Scanner;

import com.alanlima.estrutura.domain.fila.Fila;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		Fila<Integer> fila = new Fila<>();
		
		System.out.println(fila.estaVazia());
		System.out.println(fila.tamanho());
		
		fila.enfileira(2);
		fila.enfileira(3);
		System.out.println(fila);
	}
	
}
