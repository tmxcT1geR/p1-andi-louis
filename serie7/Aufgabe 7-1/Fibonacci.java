
public class Fibonacci {

	public static void main(String[] args) {
		for(int q = 0; q<50;q++) {
			System.out.println(fib(q));
		}
	}
	static long fib(int i) {
		if(i == 0) {
			return 0;
		}
		if(i == 1) {
			return 1;
		}
		return fib(i-1) + fib(i-2);
	}

}
