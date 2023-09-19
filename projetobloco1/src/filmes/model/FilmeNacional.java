package filmes.model;

public class FilmeNacional extends Filme {
	private String idioma;

	public FilmeNacional(String titulo, String genero, int anoLancamento, String diretor, String idioma) {
		super(titulo, genero, anoLancamento, diretor);
		this.idioma = idioma;	
		
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idioma) {
		this.idioma = idioma;
	}
	
	@Override
	public void exibirFilmes() {
		super.exibirFilmes();
		System.out.println("Idioma: " + this.idioma);
		}

}
