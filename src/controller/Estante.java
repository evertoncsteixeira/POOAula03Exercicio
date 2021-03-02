package controller;

public class Estante {
	private boolean limpo = false;
	private int prateleiras;
	private Livro[] livros = new Livro[100];;
	private int largura;
	private int qtdLivros = 0;

	public Estante(int prateleiras, int largura) {
		this.largura = largura;
		this.prateleiras = prateleiras;
	}

	public void limparEstante() {
		this.limpo = true;
	}

	public void estanteSuja() {
		this.limpo = false;
	}

	public void colocarLivro(Livro novoLivro) {
		if (qtdLivros >= 100) {
			System.out.println("Prateleira cheia!");
		} else {
			this.livros[qtdLivros] = novoLivro;
			this.qtdLivros += 1;
		}
	}

	public void retirarLivro(int posicao) {
		this.livros[posicao - 1] = null;
		this.qtdLivros -= 1;
	}

}
