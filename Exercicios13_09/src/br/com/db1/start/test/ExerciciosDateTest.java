package br.com.db1.start.test;

import java.util.Calendar;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExerciciosDate;

public class ExerciciosDateTest {

	
	@Test
	public void anoBissextoTeste () {
		ExerciciosDate exerciciosDate = new ExerciciosDate();
		
		Assert.assertTrue(exerciciosDate.anoBissexto(2012) == 1);
		
	}
	
	@Test
	public void diaUtilTeste () {
		ExerciciosDate exerciciosDate = new ExerciciosDate();
		Calendar novaData = Calendar.getInstance();
		novaData.set(Calendar.YEAR, 2017);                                 /* mes vai de 0 ate 11 */
		novaData.set(Calendar.MONTH, 8);
		novaData.set(Calendar.DAY_OF_MONTH, 14 );
		
		Assert.assertTrue(exerciciosDate.diaUtil(novaData) == 1);
	}
	
	
	@Test
	public void idadePessoaTeste () {
		ExerciciosDate exerciciosDate = new ExerciciosDate();
		Calendar nascimento = Calendar.getInstance();
		Calendar atual = Calendar.getInstance();
		nascimento.set(Calendar.YEAR, 1999);                                 /* mes vai de 0 ate 11 */
		nascimento.set(Calendar.MONTH, 3);
		nascimento.set(Calendar.DAY_OF_MONTH, 13 );
		System.out.println(atual.get(Calendar.YEAR));
		System.out.println(atual.get(Calendar.MONTH));
		System.out.println(atual.get(Calendar.DAY_OF_MONTH));
		
		Assert.assertTrue(exerciciosDate.idadePessoa(nascimento, atual) == 18);
	}
}
