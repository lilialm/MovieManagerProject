package filmes.model;

public abstract class Filme {
	 private String titulo;
	 private String genero;
	 private int anoLancamento;
	 private String diretor;
	 private int rating;
	 
	public Filme(String titulo, String genero, int anoLancamento, String diretor) {
		super();
		this.titulo = titulo;
		this.genero = genero;
		this.anoLancamento = anoLancamento;
		this.diretor = diretor;
	}


	public String getTitulo() {
		return titulo;
	}


	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}


	public String getGenero() {
		return genero;
	}


	public void setGenero(String genero) {
		this.genero = genero;
	}


	public int getAnoLancamento() {
		return anoLancamento;
	}


	public void setAnoLancamento(int anoLancamento) {
		this.anoLancamento = anoLancamento;
	}


	public String getDiretor() {
		return diretor;
	}


	public void setDiretor(String diretor) {
		this.diretor = diretor;
	}
	 
	
	public int getRating() {
		return rating;
	}


	public void setRating(int rating) {
		this.rating = rating;
	}


	public void exibirFilmes() {
	System.out.println("\n\n***********************************************************");
	System.out.println("Dados dos Filmes:");
	System.out.println("***********************************************************");
	System.out.println("Título: " + this.titulo);
	System.out.println("Gênero: " + this.genero);
	System.out.println("Ano de Lançamento: " + anoLancamento);
	System.out.println("Diretor(a): " + this.diretor);
	}
}
