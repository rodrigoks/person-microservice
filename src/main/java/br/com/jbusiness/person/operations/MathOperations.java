package br.com.jbusiness.person.operations;

import br.com.jbusiness.person.converters.NumberConverter;

public class MathOperations {

	public Double sum(String firstNumber, String secondeNumber) {
		return NumberConverter.returnToDouble(firstNumber) + NumberConverter.returnToDouble(secondeNumber); 
	}
	
	public Double sub(String firstNumber, String secondeNumber) {
		return NumberConverter.returnToDouble(firstNumber) - NumberConverter.returnToDouble(secondeNumber); 
	}
	
	public Double mult(String firstNumber, String secondeNumber) {
		return NumberConverter.returnToDouble(firstNumber) * NumberConverter.returnToDouble(secondeNumber); 
	}
	
	public Double div(String firstNumber, String secondeNumber) {
		return NumberConverter.returnToDouble(firstNumber) / NumberConverter.returnToDouble(secondeNumber); 
	}
	
	public Double med(String firstNumber, String secondeNumber) {
		return (NumberConverter.returnToDouble(firstNumber) * NumberConverter.returnToDouble(secondeNumber)) / 2; 
	}
	
	public Double square(String number) {
		return Math.sqrt(NumberConverter.returnToDouble(number));
	}
	
}
