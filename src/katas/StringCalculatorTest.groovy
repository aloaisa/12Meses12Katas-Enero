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
	
	@Test def void testUnoYDosSeparadosPorBarraN() {
		assert 3 == StringCalculator.add("1\n2")
	}
	
	@Test def void testVariosNumerosSeparadosPorBarraN() {
		assert 15 == StringCalculator.add("1\n2\n3\n4\n5")
	}
	
	@Test def void testNumerosConVariosSeparadores() {
		assert 6 == StringCalculator.add("1\n2,3")
	}
	
	@Test def void testVariosNumerosConVariosSeparadores() {
		assert 55 == StringCalculator.add("1\n2,3@4,5\n6@7,8,9\n10")
	}
}
