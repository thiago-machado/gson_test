package br.com.gsontest.util;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;

/**
 * A função desta classe é ler o conteúdo de um arquivo dentro do diretório
 * /resources
 * 
 * @author THIAGO
 *
 */
public class ArquivoUtil {

	public static String pegarConteudoArquivo(String arquivo) {
		return conteudo(criarInputStream("json/".concat(arquivo)));
	}

	private static InputStream criarInputStream(String arquivo) {
		ClassLoader classLoader = new Object() {
		}.getClass().getClassLoader();
		InputStream inputStream = classLoader.getResourceAsStream(arquivo);
		if (inputStream == null) {
			throw new IllegalArgumentException("Arquivo não encontrado! " + arquivo);
		} else {
			return inputStream;
		}
	}

	private static String conteudo(InputStream inputStream) {
		StringBuilder builder = new StringBuilder();
		try (InputStreamReader streamReader = new InputStreamReader(inputStream, StandardCharsets.UTF_8);
				BufferedReader reader = new BufferedReader(streamReader)) {
			String linha = null;
			while ((linha = reader.readLine()) != null) {
				builder.append(linha);
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
		return builder.toString();
	}
}
