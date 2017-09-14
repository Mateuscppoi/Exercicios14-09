package br.com.db1.start;

import java.util.Calendar;

public class ExerciciosDate {
	
	public Integer anoBissexto (Integer ano) {
		if (ano % 400 == 0) {
			return  1;
		} else {
			if ((ano % 4 == 0) && (ano % 100 != 0)) {
				return 1;
			} else {
				return 0;
			}
		}
	}
	
	public Integer diaUtil (Calendar calendario) {
		if ( calendario.get(Calendar.DAY_OF_WEEK)== Calendar.SATURDAY || calendario.get(Calendar.DAY_OF_WEEK) == Calendar.SUNDAY) {
			return 0;
		} else {
			return 1;
		}
	}
	
	public Integer idadePessoa (Calendar nascimento, Calendar atual) {
		Integer qtd = 0;
		for (int x = nascimento.get(Calendar.YEAR); x< atual.get(Calendar.YEAR) ; x++ ) {
				qtd++;
				System.out.println(qtd);
			}
		return qtd;	
		}
	
	public Integer diasAteHoje (Calendar dataEscolhida, Calendar atual) {
		Integer qtd = 0;
		Integer primeiroAno = 0;
		if (dataEscolhida.get(Calendar.YEAR) < atual.get(Calendar.YEAR)) {
			for (int x = dataEscolhida.get(Calendar.YEAR);)
			if (dataEscolhida.get(Calendar.YEAR) )
			
		}
	}
	}
