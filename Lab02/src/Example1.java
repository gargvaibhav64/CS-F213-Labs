import java.io.*;

class Example1 {

	public static void main(String[] args)throws IOException {
		// TODO Auto-generated method stub
		
		InputStreamReader isr = new InputStreamReader(System.in);
		
		BufferedReader br = new BufferedReader(isr);
		
		System.out.println("Enter your First Name: ");
		
		String name = br.readLine();
		
		System.out.println("Yourname is: " + name);

	}

}
