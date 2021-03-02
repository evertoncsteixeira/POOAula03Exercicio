package controller;

public class Livro {
	private int paginas;
	private String genero;
	private boolean lido = false;
	private String titulo;
	private boolean gostei;

	public Livro(int paginas, String genero, String titulo) {
		this.titulo = titulo;
		this.genero = genero;
		this.paginas = paginas;
	}

	public void lido(boolean gostei) {
		this.lido = true;
		this.gostei = gostei; 
		System.out.println("Livro : " + this.titulo + " foi lido.");
		
		if (gostei == true) {
			System.out.println("Voc� gostou!");
		} else {
			System.out.println("Voc� n�o gostou!");
		}
	}

	public void reLer() {
		this.lido = false;
		System.out.println("Livro : " + this.titulo + " esta sendo relido.");
	}

}
