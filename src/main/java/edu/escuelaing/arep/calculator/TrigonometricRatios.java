package edu.escuelaing.arep.calculator;

public class TrigonometricRatios {
	
	String oper, answer;
	Double num, result;
	public TrigonometricRatios() {
		
	}
	public String calculate(String oper, Double num) {
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
	
	public String cos() {
		result = Math.cos(num);
		answer = String.valueOf(result);
		return "{\"value\":"+answer+"}";
	}
	
	public String sin() {
		result = Math.sin(num);
		answer = String.valueOf(result);
		return "{\"value\":"+answer+"}";
	}
	
	public String tan() {
		result = Math.tan(num);
		answer = String.valueOf(result);
		return "{\"value\":"+answer+"}";
	}
}
