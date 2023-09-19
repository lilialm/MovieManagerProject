package filmes.repository;
import filmes.model.Filme;

public interface FilmeRepository {
	public void listarFilmes();
	public void adicionarFilme(Filme filme);
	public void deletarFilme(String titulo);
	public void buscarFilme(String titulo);
	public void atualizarFilme(Filme filme);
	public void adicionarNota(String titulo, int anoLancamento, int nota);
    public void listarFilmesComNotas();
}
