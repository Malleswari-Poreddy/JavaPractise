package Day1;

public class ArraLargestNum {

	public static void main(String[] args) {
		int[] arr = {12,45,25,34,99};  // given array

        int max = arr[0];  // assume the first element is the largest

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];  // update max if current element is greater
            }
        }

        System.out.println("Largest element in the array is: " + max);
        
	}

}
