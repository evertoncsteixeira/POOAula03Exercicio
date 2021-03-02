package view;

import controller.*;

public class Principal {

	public static void main(String[] args) {
		Quarto quarto1 = new Quarto(150, 200, 500);
		Quarto quarto2 = new Quarto(250, 100, 50);

		quarto1.limparQuarto();
		quarto2.limparQuarto();
		quarto1.abrirQuarto();
		quarto2.abrirQuarto();

		Livro livro1 = new Livro(150, "terro", "a volta dos que não foram");
		Livro livro2 = new Livro(150, "terro", "acabou o que era doce");
		
		livro1.lido(true);
		livro2.lido(false);
		
		livro1.reLer();
		
		Estante estante1 = new Estante(2, 1);
		Estante estante2 = new Estante(5, 2);
		
		estante1.colocarLivro(livro1);
		estante2.colocarLivro(livro2);

		estante1.retirarLivro(1);
		estante2.colocarLivro(livro1);
		estante1.limparEstante();
		estante1.estanteSuja();
		
		String[] entradas = { "HDM1", "HDM2", "AVI", "CABO" };

		Televisao tv1 = new Televisao(entradas, 50);
		Televisao tv2 = new Televisao(entradas, 76);
		
		tv1.ligarDesligar();
		tv1.trocarCanal(5);
		
		tv2.trocarEntrada(1);
		 
		tv2.ligarDesligar();
		
		tv2.trocarEntrada(1);
	}

}
