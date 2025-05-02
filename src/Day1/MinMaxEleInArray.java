package Day1;

public class MinMaxEleInArray {

	public static void main(String[] args) {
		int [] arr = {10, 25, 9,44, 98};
		int min = arr[0];
		int max = arr[0];
		for(int i=1; i<arr.length;i++) {
			if(arr[i]<min) {
				min=arr[i];
			}
			
		}
    for(int i=1;i<arr.length;i++) {
    	if(arr[i]>max) {
    		max = arr[i];
    	}
    }
    System.out.println("The minumum value is: "+ min);
    System.out.println("The maximum value is: "+ max);
	}

}
