package br.com.gsontest;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import br.com.gsontest.model.Filme;
import br.com.gsontest.util.ArquivoUtil;

public class LerFilmes {

	public static void main(String[] args) {
		
		String json = ArquivoUtil.pegarConteudoArquivo("filmes.json");
		List<Filme> filmes = new Gson().fromJson(json, new TypeToken<ArrayList<Filme>>(){}.getType());
		
		filmes.forEach(filme -> {
			System.out.println("***FILME***");
			System.out.println(filme.getId());
			System.out.println(filme.getRank());
			System.out.println(filme.getTitle());
			System.out.println(filme.getFullTitle());
			System.out.println(filme.getYear());
			System.out.println(filme.getImage());
			System.out.println(filme.getImdbRating());
			System.out.println(filme.getImdbRatingCount());
			System.out.println("************");
		});

	}
}
