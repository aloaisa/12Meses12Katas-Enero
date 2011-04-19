package katas

class StringCalculator {

	static def LISTA_SEPARADORES = [",","\n","@"]
	
	static def add(def serie) {
		
		int result = 0
		
		def separador = obtenerSeparador(serie)
		if (separador != "") {
			serie.split(separador).each { miniLista->
				result += add(miniLista)
			}
		} else if (serie != "") {
			result = Integer.parseInt(serie)
		}
		
		return result
	}
	

	static def obtenerSeparador(def serie) {
		
		def result = ""
		
		LISTA_SEPARADORES.each {
			if (serie.contains(it)) {
				result = it
			}
		}
		
		return result
	}	
}
