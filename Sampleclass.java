package sampleprojectpackage;

public class Sampleclass {
	
	public void sampleMethod () {}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Made some changes with Github and Jenkins");
		Calculator calculator1 = new Calculator(5);
		Calculator calculator2 = new Calculator(150);
		
		System.out.println("Calculate the sum and factor of two calculators");
		int calc1ResultSum = calculator1.sum(4, 5);
		int calc1ResultFactor = calculator1.factor(3);
		System.out.println("Calculator 1");
		System.out.println("The result of the sum of 4 and 5 is " + calc1ResultSum);
		System.out.println("The result of the factor of 3 is " + calc1ResultFactor);

		int calc2ResultSum = calculator2.sum(4, 5);
		int calc2ResultFactor = calculator2.factor(3);
		System.out.println("Calculator 2");
		System.out.println("The result of the sum of 4 and 5 is " + calc2ResultSum);
		System.out.println("The result of the factor of 3 is " + calc2ResultFactor);

	}
	
	}

class Calculator{
		private int factor;
		
		public Calculator(int factor) {
			this.factor = factor;
		}
		public int sum(int a, int b){
			int result = a+b;
			return result;
		}
		public int factor(int x) {
			int result = 1;
			for(int i=0; i<factor; i++) {
				result*=x;
			}
			return result;
		}

}
