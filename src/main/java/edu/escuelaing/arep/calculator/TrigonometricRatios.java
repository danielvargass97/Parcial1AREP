package edu.escuelaing.arep.calculator;

public class TrigonometricRatios {
	
	String oper;
	Double num, result;
	public TrigonometricRatios() {
		
	}
	public Double calculate(String oper, Double num) {
		this.oper = oper;
		this.num = num;
		switch (oper) {
		case "cos":
			return cos();
		case "sin":
			return sin();
		case "tan":
			return tan();
		default:
			return null;
		}
	}
	
	public Double cos() {
		result = Math.cos(num);
		return result;
	}
	
	public Double sin() {
		result = Math.sin(num);
		return result;
	}
	
	public Double tan() {
		result = Math.tan(num);
		return result;
	}
}
