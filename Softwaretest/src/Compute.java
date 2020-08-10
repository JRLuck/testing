public class Compute {
	public int sum(int x,int y) {
		return x+y;
	}
	public int minus(int x,int y) {
		return x-y;
	}
	public int multiply(int x,int y) {
		return x*y;
	}
	public int divide(int x,int y) {
		if(y==0)
			throw new ArithmeticException();
		return x/y;	
	}
}
