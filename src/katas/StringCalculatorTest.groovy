package katas

import static katas.StringCalculator.add
import static org.junit.Assert.*;
import org.junit.Test

class StringCalculatorTest {

	@Test def void testPasoVacioDevuelveCero() {
		assert 0 == StringCalculator.add("")
	}
	
	@Test def void testPasoCeroDevuelveCero() {
		assert 0 == StringCalculator.add("0")
	}
	
	@Test def void testPasoUnoDevuelveUno() {
		assert 1 == StringCalculator.add("1")
	}
	
	@Test def void testPasoUnoYDosDevuelveTres() {
		assert 3 == StringCalculator.add("1,2")
	}
	
	@Test def void testPasoVariosNumerosSeparadosPorComa() {
		assert 15 == StringCalculator.add("1,2,3,4,5")
	}
}
