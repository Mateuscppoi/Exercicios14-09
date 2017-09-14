package br.com.db1.start;

public class ExerciciosString {
	
	public String transformaMaiuscula (String palavra) {
		System.out.println(palavra.toUpperCase());
		return palavra.toUpperCase();
	}
	
	public String transformaMinuscula (String palavra) {
		return palavra.toLowerCase();
	}

	public Integer quantidadeDeLetras (String palavra) {
		return palavra.length();
	}
	
	public Integer quantidadeComEspaco (String palavra) {
		return palavra.length();
	}
	
	public String mesmaQuantidade (String palavra) {
		System.out.println(palavra.trim());
		String tmp = palavra.trim();
		return tmp;
	}
	
	public String primeiras4Letras (String palavra) {
		System.out.println(palavra.substring(0, 4));
		return palavra.substring(0, 4);
	}
	
	public String apartirDa3Letra (String palavra) {
		Integer qtd = palavra.length();
		System.out.println(palavra.substring(3, qtd));
		return palavra.substring(3, qtd );
	}
	
	public String ultimas4Letras (String palavra) {
		Integer qtd = palavra.length();
		System.out.println(palavra.substring(qtd-4, qtd));
		return palavra.substring(qtd-4, qtd);
	}
	
	public String substituiAluno (String palavra) {
		return palavra.replace("Mateus", "Aluno");
	}
	
	public String[] separaPalavras (String palavra) {
		return palavra.split(", ");
	}
	
	public Integer quantidadeVogais (String palavra) {
		Integer qtd = 0;
		for (int x = 0; x<= palavra.length()-1; x++) {
			char tmp = palavra.charAt(x);
			if (tmp == 'a' || tmp == 'e' || tmp == 'i' || tmp == 'o'|| tmp == 'u') {
				qtd++;
			}
		}
		return qtd;
	}
	
	public String inverteString (String palavra) {
		String tmp = new StringBuilder(palavra).reverse().toString();
		return tmp;
	}
}
