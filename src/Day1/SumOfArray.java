package Day1;

public class SumOfArray {
	
	    public static void main(String[] args) {
	        int[] arr = {1, 8, 9, 70};  // given array

	        int sum = 0;  // initialize sum to 0

	        for (int i = 0; i < arr.length; i++) {
	            sum += arr[i];  // add each element to sum
	        }

	        System.out.println("Sum of all elements in the array is: " + sum);
	    
}

	}


