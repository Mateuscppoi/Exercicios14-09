package br.com.db1.start;

import java.util.Calendar;

public class ExerciciosDate {
	
	public Integer anoAtualBissexto (Calendar calendar) {
		if (calendar.YEAR % 400 == 0) {
			return  1;
		} else {
			if ((date % 4 == 0) && (date % 100 != 0)) {
				return 1;
			} else {
				return 0;
			}
		}
	}
}
