package com.alanlima.estrutura.domain.pilha;

import com.alanlima.estrutura.domain.base.EstruturaEstatica;

public class Pilha<T> extends EstruturaEstatica<T> {

	public Pilha() {
		super();
	}

	public Pilha(int capacidade) {
		super();
	}

	public void empilha(T elemento) {
		super.adiciona(elemento);
	}

	public T topo() {
		if (this.estaVazia()) {
			return null;
		}

		return this.elementos[tamanho - 1];
	}
}
