
public class findPairs {
	
	public static void findPair(int arr[], int check){
		for ( int i = 0 ; i < arr.length ; i++){
			for ( int j = i ; j < arr.length ; j++){
				int sum = arr[i] + arr[j];
				if (sum == check){
					System.out.println(arr[i] + " , " + arr[j]);
				}
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int arrSize = args.length - 1;
		int[] arr1 = new int[arrSize];
		
		for ( int i = 0 ; i < arrSize ; i++){
			arr1[i] = Integer.parseInt(args[i]);
			System.out.println(arr1[i]);
		}
		
		int check = Integer.parseInt(args[arrSize]);
		System.out.println(check);
		
		findPair(arr1, check);
	}

}
