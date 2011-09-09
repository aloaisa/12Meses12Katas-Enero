package katas

import static katas.StringCalculator.add
import static org.junit.Assert.*;
import org.junit.Test

class StringCalculatorTest {

	StringCalculator stringCalculator = new StringCalculator();
	
	@Test
	def void testPasoVacioDevuelveCero() {
		assert 0 == stringCalculator.add("")
	}
	
	@Test
	def void testPasoCeroDevuelveCero() {
		assert 0 == stringCalculator.add("0")
	}
	
	@Test
	def void testPasoUnoDevuelveUno() {
		assert 1 == stringCalculator.add("1")
	}
	
	@Test
	def void testPasoUnoYDosDevuelveTres() {
		assert 3 == stringCalculator.add("1,2")
	}
	
	@Test
	def void testPasoVariosNumerosSeparadosPorComa() {
		assert 15 == stringCalculator.add("1,2,3,4,5")
	}
	
	@Test
	def void testUnoYDosSeparadosPorBarraN() {
		assert 3 == stringCalculator.add("1\n2")
	}
	
	@Test
	def void testVariosNumerosSeparadosPorBarraN() {
		assert 15 == stringCalculator.add("1\n2\n3\n4\n5")
	}
	
	@Test
	def void testNumerosConVariosSeparadores() {
		assert 6 == stringCalculator.add("1\n2,3")
	}
	
	@Test
	def void testVariosNumerosConVariosSeparadores() {
		assert 55 == stringCalculator.add("1\n2,3@4,5\n6@7,8,9\n10")
	}
	
	@Test
	def void testPasamosElDelimitador() {
		assert 3 == stringCalculator.add("//;\n1;2")
		assert 15 == stringCalculator.add("//%\n5%10")
	}
	
	@Test
	def void testExcepcionConNumeroNegativo() {
		def message = shouldFail(Exception) {
            stringCalculator.add("1,-1,2,-2")
        }
        assert message.contains("negatives not allowed")
        assert message.contains("-1")
        assert message.contains("-2")
	}
		
}
