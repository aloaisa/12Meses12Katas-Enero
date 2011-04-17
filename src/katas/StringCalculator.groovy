package katas

class StringCalculator {

	static def add(def serie) {
		
		int result = 0
		
		if (serie.size() == 1) {
			result = Integer.parseInt(serie)
		} else if (serie != "") {
			serie.split(',').each {
				result += Integer.parseInt(it)
			}
		}
		
		return result
	}
}
