
public class Fibonacci {

	public static void fibonacci(int len){
		int a1 = 1, a2 = 1;
		int sum = 0; 
		double avg = 0;
		for (int i = 1 ; i <= len ; i++){
			System.out.println(a1);
			sum += a1;
			int a3 = a1;
			a1 = a2;
			a2 = a3+a1;
		}
		avg = sum/(double)len;
		
		System.out.println("The average of " + len + " fibonaccci numbers is : " + avg);
		
	}
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		
		fibonacci(length);

	}

}
