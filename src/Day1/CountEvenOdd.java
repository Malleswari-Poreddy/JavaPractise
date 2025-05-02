package Day1;

public class CountEvenOdd {

	public static void main(String[] args) {
		 int[] arr = {1, 8, 9, 70, 4, 5};  // given array

	        int evenCount = 0;
	        int oddCount = 0;

	        for (int i = 0; i < arr.length; i++) {
	            if (arr[i] % 2 == 0) {
	                evenCount++;  // increment evenCount if number is even
	            } else {
	                oddCount++;   // increment oddCount if number is odd
	            }
	       
	        }

	        System.out.println("Total even numbers: " + evenCount);
	        System.out.println("Total odd numbers: " + oddCount);
	}
}
