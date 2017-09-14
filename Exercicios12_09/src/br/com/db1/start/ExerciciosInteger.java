package br.com.db1.start;

public class ExerciciosInteger {
	
	public Integer somaDoisNumeros (Integer n1, Integer n2) {
		return n1 + n2;
	}
	
	public Integer subtraeDoisNumeros (Integer n1, Integer n2) {
		return n1 - n2;
	}

	public Integer multiplicaDoisNumeros (Integer n1, Integer n2) {
		return n1 * n2;
	}
	
	public Integer divideDoisNumeros (Integer n1, Integer n2) {
		return n1 / n2;
	}
	
	public Integer numeroPar (Integer n1) {
		if (n1 % 2 == 0 ) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public Integer maiorNumero (Integer n1, Integer n2) {
		if (n1 > n2) {
			return 1;
		} else {
			return 0;
		}
	}
	
	public Integer numerosImpares (Integer n1) {
		if (n1 % 2 == 0) {
			for (Integer x = n1+1; x<=100; x = x+2) {
				 System.out.println(x);
			}
			return 2;
		} else {
			for (Integer x = n1; x<=100; x = x+2) {
				 System.out.println(x);
			}
			return 1;
		}
	}
}