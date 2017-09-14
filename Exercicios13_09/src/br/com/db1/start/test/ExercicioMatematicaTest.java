package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExercicioMatematica;

public class ExercicioMatematicaTest {
	
	@Test
	public void menorTeste () {
		ExercicioMatematica exercicioMatematica = new ExercicioMatematica();
		
		Assert.assertTrue(exercicioMatematica.menorEntreDois(3d, 4d) == 1);
	}
	
	@Test
	public void menorEntreTresTeste () {
		ExercicioMatematica exercicioMatematica = new ExercicioMatematica();
		
		Assert.assertTrue(exercicioMatematica.menorEntreTres(7d, 5d, 3d) == 0);
	}
	
	@Test
	public void mediaEntreTresTeste () {
		ExercicioMatematica exercicioMatematica = new ExercicioMatematica();
		
		Assert.assertTrue(exercicioMatematica.mediaEntreTres(5d, 5d, 5d) == 5);
	}
	
	@Test
	public void areaTrianguloTeste () {
		ExercicioMatematica exercicioMatematica = new ExercicioMatematica();
		
		Assert.assertTrue(exercicioMatematica.areaTriangulo(3d, 4d) == 6);
	}

}
