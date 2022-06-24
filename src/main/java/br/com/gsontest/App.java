package br.com.gsontest;

import com.google.gson.Gson;

import br.com.gsontest.model.Pessoa;
import br.com.gsontest.util.ArquivoUtil;

public class App {
	public static void main(String[] args) {
		String json = ArquivoUtil.pegarConteudoArquivo("pessoa_detalhe.json");
		// System.out.println(json);

		// Usando GSON para converter a String em um objeto
	    Pessoa pessoa = new Gson().fromJson(json, Pessoa.class);
	    System.out.println(pessoa.getNome());
	    System.out.println(pessoa.getIdade());
	    System.out.println(pessoa.getSexo());
	    for(String telefone : pessoa.getTelefones()) {
	    	System.out.println(telefone);
	    }
	    
	}
}
