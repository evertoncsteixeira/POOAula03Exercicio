package controller;

public class Quarto {
	private int comprimento;
	private int altura;
	private int largura;
	private boolean limpo = false;
	private boolean trancado = false;
	
	public void limparQuarto()  {
		this.limpo = true;
	}
	
	public void quartoSujo()  {
		this.limpo = false;
	}
	
	public void trancarQuarto() {
		this.trancado = true;
	}
	
	public void abrirQuarto() {
		this.trancado = false;
	}
	
	public Quarto (int comprimento, int altura, int largura)  {
		this.altura = altura;
		this.comprimento = comprimento;
		this.largura = largura;
	}

}
