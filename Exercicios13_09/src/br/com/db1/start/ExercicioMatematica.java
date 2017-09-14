package br.com.db1.start;

public class ExercicioMatematica {
	
	
	public Integer menorEntreDois(Double n1, Double n2) {
		if (n1 < n2) {
			System.out.println("O numero um é menor que o numero dois");
			return 1;
		} else {
			System.out.println("O numero um é maior que o numero dois");
			return 0;
		}
	}
	
	public Integer menorEntreTres(Double n1, Double n2, Double n3) {
		if (n1 < n2 && n1 < n3) {
			System.out.println("O numero um é menor que o numero dois e o numero tres");
			return 2;
		} 
		if (n2 < n1 && n2 < n3) {
			System.out.println("O numero dois é menor que o numero um e o numero tres");
			return 1;
		} else {
			System.out.println("O numero tres é menor que o numero um e o numero dois");
			return 0;
		}
	}
	
	public Double mediaEntreTres(Double n1, Double n2, Double n3) {
		Double media;
		media = (n1 + n2 + n3) / 3;
		return media;
	}
	
	public Double areaTriangulo(Double n1, Double n2) {
		Double area;
		area = (n1*n2) / 2;
		return area;
	}

}
