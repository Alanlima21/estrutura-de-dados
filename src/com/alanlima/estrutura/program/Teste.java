package com.alanlima.estrutura.program;

import java.util.ArrayList;

public class Teste {

	public static void main(String[] args) {

		ArrayList<String> arrayList = new ArrayList<>();
		
		arrayList.add("A");
		arrayList.add("C");
		
		System.out.println(arrayList);
		
		arrayList.add(1, "B");
		
		System.out.println(arrayList);
		
		boolean existe = arrayList.contains("A");
		
		if(existe) {
			System.out.println("Elemento existe");
		}else {
			System.out.println("Elemento não existe");
		}
		
		int pos = arrayList.indexOf("B");
		System.out.println(pos);
		
		System.out.println(arrayList.get(2));
		
		arrayList.remove(0);
		arrayList.remove("B");
		
		System.out.println(arrayList);
	}

}
