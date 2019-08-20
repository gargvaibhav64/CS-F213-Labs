public class harmonic {

	public static void harmonicLeft(int len){
		double sum = 0;
		for (int i = 1 ; i <= len ; i++){
			sum += (double)1/ i;
		}
		
		System.out.println("The Harmonic sum of series from Left to Right is " + sum);
		
	}
	
	public static void harmonicRight(int len){
		double sum = 0;
		for (int i = len ; i > 0 ; i--){
			sum += (double)1/ i;
		}
		
		System.out.println("The Harmonic sum of series from Right to Left is " + sum);
		
	}
	
	public static void main(String[] args) {
		int length = Integer.parseInt(args[0]);
		
		harmonicLeft(length);
		harmonicRight(length);

	}

}
