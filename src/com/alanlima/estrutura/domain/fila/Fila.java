package com.alanlima.estrutura.domain.fila;

import com.alanlima.estrutura.domain.base.EstruturaEstatica;

public class Fila<T> extends EstruturaEstatica<T> {

	
	public Fila() {
		super();
	}
	
	public Fila(int capacidade) {
		super(capacidade);
	}
	public void enfileira(T object) {
		this.adiciona(object);
	}
	
	public T espiar() {
		return this.elementos[0];
	}
	
	
}
