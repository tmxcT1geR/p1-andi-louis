
public class FastFibonacci {

	public static void main(String[] args) {
		fastfib(50);

	}
	public static int fastfib(int k) {
		long n1=0,n2=1,n3;
		for(int i = 0; i<k; i++) {
			n3 = n1+n2;
			System.out.println(n3);    
			n1 = n2;
			n2 = n3;
		}
		return 1;
	}

}
