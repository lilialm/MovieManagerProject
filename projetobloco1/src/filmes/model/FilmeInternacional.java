package filmes.model;

public class FilmeInternacional extends Filme {
	private String paisOrigem;
	
	public FilmeInternacional(String titulo, String genero, int anoLancamento, String diretor, String paisOrigem) {
		super(titulo, genero, anoLancamento, diretor);
		this.paisOrigem = paisOrigem;
		
	}

	public String getPaisOrigem() {
		return paisOrigem;
	}

	public void setPaisOrigem(String paisOrigem) {
		this.paisOrigem = paisOrigem;
	}
	
	@Override
	public void exibirFilmes() {
		super.exibirFilmes();
		System.out.println("País de Origem: " + this.paisOrigem);
       }
	}


