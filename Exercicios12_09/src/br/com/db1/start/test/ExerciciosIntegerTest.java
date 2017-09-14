package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExerciciosInteger;

public class ExerciciosIntegerTest {
	
	@Test
	public void somaDoisNumerosTeste () {
		ExerciciosInteger  exerciciosInteger = new ExerciciosInteger();
		
		Assert.assertTrue(exerciciosInteger.somaDoisNumeros(2, 2) == 4);
	}

	@Test
	public void subtraeDoisNumerosTeste () {
		ExerciciosInteger  exerciciosInteger = new ExerciciosInteger();
		
		Assert.assertTrue(exerciciosInteger.subtraeDoisNumeros(4, 2) == 2);
	}
	
	@Test
	public void multiplicaDoisNumerosTeste () {
		ExerciciosInteger  exerciciosInteger = new ExerciciosInteger();
		
		Assert.assertTrue(exerciciosInteger.multiplicaDoisNumeros(2, 5) == 10);
	}
	
	@Test
	public void divideDoisNumerosTeste () {
		ExerciciosInteger  exerciciosInteger = new ExerciciosInteger();
		
		Assert.assertTrue(exerciciosInteger.divideDoisNumeros(10, 2) == 5);
	}
	
	@Test
	public void numeroParTeste () {
		ExerciciosInteger  exerciciosInteger = new ExerciciosInteger();
		
		Assert.assertTrue(exerciciosInteger.numeroPar(4) == 1);
	}
	
	@Test
	public void maiorNumeroTeste () {
		ExerciciosInteger  exerciciosInteger = new ExerciciosInteger();
		
		Assert.assertTrue(exerciciosInteger.maiorNumero(7, 9) == 0);
	}
	
	@Test
	public void numerosImpares () {
		ExerciciosInteger  exerciciosInteger = new ExerciciosInteger();
		
		Assert.assertTrue(exerciciosInteger.numerosImpares(4) == 2);
	}
}
