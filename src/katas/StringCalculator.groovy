package katas

class StringCalculator {

	def LISTA_SEPARADORES = [",","\n","@"]
	
	def add(def serie) {
		
		int result = 0
		
		serie = addSeparadorPasado(serie)
		
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

	def addSeparadorPasado(String serie) {
		
		serie.find(/\/\/(.+)\n(.+)/) { match ->
			LISTA_SEPARADORES << match[1]
			serie = match[2]
		}
		
		return serie
	}
	
	def obtenerSeparador(def serie) {
		
		def result = ""
		
		LISTA_SEPARADORES.each {
			if (serie.contains(it)) {
				result = it
			}
		}
		
		return result
	}	
}
