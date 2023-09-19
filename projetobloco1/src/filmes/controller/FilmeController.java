package filmes.controller;

import java.util.ArrayList;


import filmes.model.Filme;
import filmes.repository.FilmeRepository;

public class FilmeController implements FilmeRepository {
	
	private ArrayList<Filme> filmes = new ArrayList<Filme>();

	@Override
	public void listarFilmes() {
		for (var filme : filmes) {
            filme.exibirFilmes();
            
		}
		
	}

	@Override
	public void adicionarFilme(Filme filme) {
		filmes.add(filme);
		System.out.println("O Filme foi cadastrado com sucesso!");
		
	}

	@Override
	public void deletarFilme(String titulo) {
		for (var filme : filmes) {
	        if (filme.getTitulo().equalsIgnoreCase(titulo)) {
	            filmes.remove(filme);
	            System.out.println("O Filme foi removido com sucesso!");
	            return;
	        }
	    }
	    System.out.println("Filme não encontrado!");
		
	}

	@Override
	public void buscarFilme(String titulo) {

        for (var filme : filmes) {
            if (filme.getTitulo().equalsIgnoreCase(titulo)) {
                filme.exibirFilmes();
                return;
            }
        }
        System.out.println("Filme não encontrado!");
		
	}

	@Override
	public void atualizarFilme(Filme filme) {
         var buscaFilme = buscarNoArrayFilmes(filme.getTitulo());
		
		if (buscaFilme != null) {
			filmes.set(filmes.indexOf(buscaFilme), filme);
			System.out.println("\nA O filme foi atualizada com sucesso!");
		}else
			System.out.println("\nO filme não foi encontrado!");
		
	}
	
	public Filme buscarNoArrayFilmes(String titulo) {
		return filmes.stream()
	            .filter(filme -> filme.getTitulo().equals(titulo))
	            .findFirst()
	            .orElse(null);
	}

	@Override
	public void adicionarNota(String titulo, int anoLancamento, int nota) {
		var filme = buscarNoArrayFilmes(titulo);
        if (filme != null && filme.getAnoLancamento() == anoLancamento) {
            filme.setRating(nota);
            System.out.println("Nota adicionada com sucesso!");
        } else {
            System.out.println("Filme não encontrado!");
        }
		
	}

	@Override
	public void listarFilmesComNotas() {
		for (var filme : filmes) {
            System.out.println("Título: " + filme.getTitulo() + ", Ano de lançamento: " + filme.getAnoLancamento() + ", Nota: " + filme.getRating());
        }
		
	}

}
