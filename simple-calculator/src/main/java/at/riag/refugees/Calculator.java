package at.riag.refugees;

public class Calculator {

	public int sum(int a, int b) {
		return a + b;
	}

	public int minus(int a, int b) {
		return a - b;
	}

	public int multiply(int a, int b) {
		return a * b;
	}

	public int divide(int a, int b) {
		return a / b;
	}

    public int safeDivide(int a, int b) {
	    if (b != 0) {
	        return a / b;
        }
        return 0;
    }
}
