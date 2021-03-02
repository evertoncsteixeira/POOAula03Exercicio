package controller;

public class Televisao {

	private boolean ligada = false;
	private int canal = 1;
	private String[] entradas;
	private int polegadas;
	private int entradaAtiva = 0;

	public Televisao(String[] entradas, int polegadas) {
		this.entradas = entradas;
		this.polegadas = polegadas;
	}

	public void trocarCanal(int canal) {
		if (this.ligada == true) {
			this.canal = canal;
		} else {
			System.out.println("Televisão desligada.");
		}

	}

	public void trocarEntrada(int entrada) {
		if (this.ligada == true) {
			this.entradaAtiva = entrada;
			System.out.println("Entrada : " + entradas[entradaAtiva-1] + " foi selecionada.");
		} else {
			System.out.println("Televisão desligada.");
		}
	}

	public void ligarDesligar() {
		if (ligada == true) {
			ligada = false;
		} else {
			ligada = true;
		}
	}
}
