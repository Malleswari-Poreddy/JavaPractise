package Day1;

public class ArrayDuplicateElem {

	public static void main(String[] args) {
		int [] arr = {10, 60, 70, 10, 40, 60};
		for(int i =0;i<arr.length; i++) {
			for(int j=i+1;j<arr.length;j++) {
				if(arr[i]==arr[j]) {
				System.out.println("Duplicate values in Array "+arr[j]);
				break;
			}
		}
		}
	}

}
