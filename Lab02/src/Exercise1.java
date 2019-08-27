import java.io.*;

class Exercise1 {
	
	public static void main(String[] args)throws IOException{
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		int sum = 0;
		
		for ( int i = 0 ; i < 10 ; i++){
			System.out.println("Enter the " + (i+1) + "th number : ");
			int temp = Integer.parseInt(br.readLine());
			
			sum += temp;
		}
		
		System.out.println("The sum of number is : " + sum);
	}
}
