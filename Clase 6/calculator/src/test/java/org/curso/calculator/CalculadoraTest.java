package org.curso.calculator;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class CalculadoraTest {
	
	double resultadoEsperado = 0;
	double unNumero = 0;
	double otroNumero = 0;
	double divisor = 0;
	double multiplicador = 0;
	
	@Before
	public void inicializar() {
		unNumero = 90;
		otroNumero = 50;
		multiplicador = 15;
	}
	
	@After
	public void finaliza() {
		resultadoEsperado = 0;
	}
	
	//El resultado de multiplicar 80 por 3 da 240
	@Test
	public void multiplivarDosNumeros_probarMultiplicacion() {
		assertEquals(240, Calculadora.multiplicar(80,3));
	}
	
	//El resultado de sumar 150 y 180, dividido por 3, da 110
	@Test
	public void dadosDosNumeros_verificarLaSumaConDivision() {
		double unNumero=150;
		double otroNumero=180;
		double divisor = 3;
		
		double resultadoDeSuma= Calculadora.sumar(unNumero,otroNumero);
		double resultadoDivision = Calculadora.dividir(resultadoDeSuma, divisor);
		
		assertEquals(resultadoDivision,110);
	}
	
	//El resultado de restar 90 y 50, multiplicado por 15, no da 605
	@Test
	public void dadosDosNumeros_verificarLaRestaConMultiplicacion() {
		
		double resultadoEsperado = Calculadora.multiplicar(Calculadora.restar(unNumero, otroNumero), multiplicador);
		
		assertEquals(resultadoEsperado,600);
	}
	
	//El resultado de sumar 70 y 40, multiplicado por 25, no da 2700
	
	@Test
	public void dadosDosNumeros_verificarLaSumaConMultiplicacion() {
		double unNumero = 70;
		double otroNumero = 40;
		double multiplicador = 25;
		
		double resultadoSuma = Calculadora.sumar(unNumero, otroNumero);
		double resultadoMultiplican = Calculadora.multiplicar(resultadoSuma, multiplicador);
		
		assertEquals(resultadoMultiplican,2750);
	}
	


}
