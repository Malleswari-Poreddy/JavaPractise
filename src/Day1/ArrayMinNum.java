package Day1;

public class ArrayMinNum {
	public static void main(String[] args) {
	int[] arr = {1, 8, 9, 70};  // given array

    int min = arr[0];  // assume the first element is the largest

    for (int i = 1; i < arr.length; i++) {
        if (arr[i] < min) {
            min = arr[i];  // update max if current element is greater
        }
    }

    System.out.println("Largest element in the array is: " + min);
		// TODO Auto-generated method stub

	}

}
