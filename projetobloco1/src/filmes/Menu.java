package filmes;

import java.io.IOException;
import java.util.InputMismatchException;
import java.util.Optional;
import java.util.Scanner;
import filmes.model.FilmeNacional;
import filmes.controller.FilmeController;
import filmes.model.FilmeInternacional;
import filmes.util.Cores;

public class Menu {

	public static void main(String[] args) {
		Scanner ler = new Scanner(System.in);
		
		int opcao, anoLancamento;
		String titulo, genero, diretor, idioma, paisOrigem;
		
		FilmeController filmes = new FilmeController();
		
		FilmeNacional fn1 = new FilmeNacional( "Tô Ryca", "Comédia", 2016, "Pedro", "Português");
		FilmeInternacional fi1 = new FilmeInternacional( "talk to me", "Terror", 2023, "Michael", "EUA");
		filmes.adicionarFilme(fn1);
		filmes.adicionarFilme(fi1);
		filmes.listarFilmes();
			
		while (true) {
		
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("         BEM VINDO AO GERENCIADOR DE FILMES          ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("                                                     ");
		System.out.println("            1 - Adicionar filme nacional             ");
		System.out.println("            2 - Adicionar filme internacional        ");
		System.out.println("            3 - Exibir lista de filmes               ");
		System.out.println("            4 - Buscar filme por título              ");
		System.out.println("            5 - Apagar filme                         ");
		System.out.println("            6 - Atualizar info de algum filme        ");
		System.out.println("            7 - Adicionar rating em um filme         ");
		System.out.println("            8 - Exibir filmes com rating             ");
		System.out.println("            9 - Sair                                 ");
		System.out.println("                                                     ");
		System.out.println("*****************************************************");
		System.out.println("Entre com a opção desejada:                          ");
		System.out.println("                                                     ");

		try {
		opcao = ler.nextInt();
		ler.nextLine();
		} catch(InputMismatchException e){
			System.out.println("\nDigite valores inteiros!");
			ler.nextLine();
			opcao=0;
		}
		
		
		switch (opcao) {
		case 1:
			System.out.print("Adicionar filme nacional - ");
			
			System.out.println("Digite o título do filme: ");
			titulo = ler.nextLine();
			
			System.out.println("Digite o gênero do filme: ");
			genero = ler.nextLine();
			
			System.out.println("Digite o ano de lançamento do filme: ");
			anoLancamento = ler.nextInt();
			ler.nextLine();
			
			System.out.println("Digite o diretor(a) do filme: ");
			diretor = ler.nextLine();
			
			System.out.println("Digite o idioma do filme: ");
			idioma = ler.nextLine();
			
			Optional<String> checaTituloNac = Optional.ofNullable(titulo);
			Optional<String> checaGeneroNac = Optional.ofNullable(genero);
			Optional<String> checaDiretorNac = Optional.ofNullable(diretor);
			Optional<String> checaIdioma = Optional.ofNullable(idioma);
			
		
			if ( checaTituloNac.get().isBlank() ||
				     checaGeneroNac.get().isBlank() ||
				     checaDiretorNac.get().isBlank() ||
				     checaIdioma.get().isBlank()) {
	            throw new IllegalArgumentException("Não pode enviar nenhum campo em branco");
	        } 
	        	filmes.adicionarFilme(new FilmeNacional(titulo, genero, anoLancamento, diretor, idioma));
	        	keyPress();
	        
			
            
			
            break;
		case 2: 
            System.out.print("Adicionar filme internacional - ");
			
			System.out.println("Digite o título do filme: ");
			titulo = ler.nextLine();
			
			System.out.println("Digite o gênero do filme: ");
			genero = ler.nextLine();
			
			System.out.println("Digite o ano de lançamento do filme: ");
			anoLancamento = ler.nextInt();
			ler.nextLine();
			
			System.out.println("Digite o diretor(a) do filme: ");
			diretor = ler.nextLine();
			
			System.out.println("Digite o país de origem do filme: ");
			paisOrigem = ler.nextLine();
			
			Optional<String> checaTituloInt = Optional.ofNullable(titulo);
			Optional<String> checaGeneroInt = Optional.ofNullable(genero);
			Optional<String> checaDiretorInt = Optional.ofNullable(diretor);
			Optional<String> checaPaisOrigem = Optional.ofNullable(paisOrigem);
			
			if ( checaTituloInt.get().isBlank() ||
				     checaGeneroInt.get().isBlank() ||
				     checaDiretorInt.get().isBlank() ||
				     checaPaisOrigem.get().isBlank()) {
	            throw new IllegalArgumentException("Não pode enviar nenhum campo em branco");
	        } 
			
			filmes.adicionarFilme(new FilmeInternacional(titulo, genero, anoLancamento, diretor, paisOrigem));
			
			
			keyPress();
			break;
		case 3:
				System.out.println("Filmes cadastrados: \n\n");
				System.out.println();
                filmes.listarFilmes();
            
                keyPress();
			break;
		case 4:
			System.out.println("Buscar filme\n\n");
		    System.out.println("Digite o título do filme a ser buscado: ");
		    titulo = ler.nextLine();
		    filmes.buscarFilme(titulo);
			
			keyPress();
			break;
		case 5:
			System.out.println("Apagar filme\n\n");
			System.out.println("Digite o título do filme a ser apagado: ");
		    titulo = ler.nextLine();
		    filmes.deletarFilme(titulo);
			

			keyPress();
			break;
		case 6: 
		    System.out.println(Cores.TEXT_WHITE + "Atualizar informações do Filme\n\n");

		    System.out.println("Digite o título do filme: ");
		    titulo = ler.nextLine();

		    if (filmes.buscarNoArrayFilmes(titulo) != null) {
		        System.out.println("Digite o gênero do filme: ");
		        genero = ler.nextLine();

		        System.out.println("Digite o ano de lançamento do filme: ");
		        anoLancamento = ler.nextInt();
		        ler.nextLine();

		        System.out.println("Digite o diretor(a) do filme: ");
		        diretor = ler.nextLine();
		 

		        int tipo;

		        System.out.println("O filme é nacional ou internacional? Digite 1 para Nacional e 2 para Internacional ");
		        tipo = ler.nextInt();
		        ler.nextLine();

		        switch(tipo) {
		            case 1: 
		                System.out.println("Digite o idioma do filme: ");
		                idioma = ler.nextLine();
		                filmes.adicionarFilme(new FilmeNacional(titulo, genero, anoLancamento, diretor, idioma));
		            break;
		            case 2:
		                System.out.println("Digite o país de origem do filme: ");
		                paisOrigem = ler.nextLine();
		                filmes.adicionarFilme(new FilmeInternacional(titulo, genero, anoLancamento, diretor, paisOrigem));
		            break;
		            default:
		                System.out.println("Tipo de filme inválido!");
		            }
		        }

		     else {
		        System.out.println("\nFilme não encontrado!");
		    }

		    keyPress();
		    break;
		case 7: 
			System.out.println("Adicionar nota para um filme\n\n");
		    System.out.println("Digite o título do filme: ");
		    titulo = ler.nextLine();
		    System.out.println("Digite o ano de lançamento do filme: ");
		    anoLancamento = ler.nextInt();
		    System.out.println("Digite a nota do filme (1-5): ");
		    int nota = ler.nextInt();
		    ler.nextLine();
		    filmes.adicionarNota(titulo, anoLancamento, nota);
		    
		    keyPress();
		    break;
		case 8: 
			System.out.println("Listar filmes com notas\n\n");
		    filmes.listarFilmesComNotas();
		    
		    keyPress();
		    break;
		case 9:
			System.out.println("\nObrigada por usar o nosso Gerenciador de Filmes <3 Volte sempre!");
			ler.close();
			System.exit(0);

		default:
			System.out.println("\nOpção Inválida!\n");

			keyPress();
			break; 
		}
		}
	}
	
	

	public static void keyPress() {

		try {

			System.out.println(Cores.TEXT_RESET + "\n\nPressione Enter para Continuar...");
			System.in.read();

		} catch (IOException e) {

			System.out.println("Você pressionou uma tecla diferente de enter!");

		}
		
		
        
	}
	}
		
	


