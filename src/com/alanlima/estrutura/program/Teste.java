package com.alanlima.estrutura.program;

import java.util.LinkedList;
import java.util.Queue;

public class Teste {

	public static void main(String[] args) throws Exception {
		
		Queue<Integer> fila = new LinkedList<>();
		
		fila.add(1);
		fila.add(2);
		
		System.out.println(fila);
		System.out.println(fila.peek());
		System.out.println(fila.remove());
		System.out.println(fila);
	}
	
}
