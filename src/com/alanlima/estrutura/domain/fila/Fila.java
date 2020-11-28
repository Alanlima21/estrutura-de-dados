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

	public T desenfileira() {
		T elemento = this.elementos[0];
		for (int i = 0; i < this.elementos.length - 1; i++) {
			this.elementos[i] = this.elementos[i + 1];
		}
		tamanho--;
		return elemento;
	}
}
