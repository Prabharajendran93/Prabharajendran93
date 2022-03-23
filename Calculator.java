package week1.day2;

public class Calculator {
	public int getadd(int a, int b, int c) {
		return a + b + c;
	}

	public int getsub(int a, int b) {
		return a - b;
	}

	public double getmult(double a, double b) {
		return a * b;
	}

	public float getdiv(float num1, float num2) {
		return num1 / num2;
	}

	public static void main(String[] args) {
		Calculator cal = new Calculator();
		System.out.println(cal.getadd(2, 3, 4));
		System.out.println(cal.getsub(4, 5));
		System.out.println(cal.getmult(2, 3));
		System.out.println(cal.getdiv(20.44f, 5.00f));
		// TODO Auto-generated method stub

	}

}
