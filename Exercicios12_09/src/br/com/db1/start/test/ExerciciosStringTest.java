package br.com.db1.start.test;

import org.junit.Assert;
import org.junit.Test;

import br.com.db1.start.ExerciciosString;

public class ExerciciosStringTest {
	
	@Test
	public void transormaMaiusculaTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertEquals("TESTE", exerciciosString.transformaMaiuscula("teste"));
	}
	
	@Test
	public void transormaMinusculaTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertEquals("teste", exerciciosString.transformaMinuscula("TESTE"));
	}
	
	@Test
	public void quantidadeDeLetrasTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertTrue(exerciciosString.quantidadeDeLetras("DB1START") == 8);
	}
	
	@Test
	public void quantidadeComEspacoTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertTrue(exerciciosString.quantidadeDeLetras(" DB1START ") == 10);
	}
	
	@Test
	public void mesmaQuantidadeTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertEquals("teste", exerciciosString.mesmaQuantidade(" teste "));
	}
	
	@Test
	public void primeiras4LetrasTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertEquals("Otor", exerciciosString.primeiras4Letras("Otorrinolaringologista"));
	}
	
	@Test
	public void apartirDa3LetraTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertEquals("rrinolaringologista", exerciciosString.apartirDa3Letra("Otorrinolaringologista"));
	}
	
	@Test
	public void ultimas4LetrasTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertEquals("ista", exerciciosString.ultimas4Letras("Otorrinolaringologista"));
	}
	
	@Test
	public void subtituiAlunoTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertEquals("Aluno Poi", exerciciosString.substituiAluno("Mateus Poi"));
	}
	@Test
		public void separaPalavrasTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		String[] frutas = exerciciosString.separaPalavras("banana, maçã, melancia");
		Assert.assertEquals("banana", frutas[0]);
		Assert.assertEquals("maçã", frutas[1]);
		Assert.assertEquals("melancia", frutas[2]);
	}
	
	@Test
	public void quantidadeVogaisTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertTrue(exerciciosString.quantidadeVogais("mateus") == 3);
	}
	
	@Test
	public void inverteStringTeste () {
		ExerciciosString exerciciosString =  new ExerciciosString();
		
		Assert.assertEquals("ioP suetaM", exerciciosString.inverteString("Mateus Poi"));
	}
}
