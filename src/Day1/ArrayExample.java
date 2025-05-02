package Day1;

public class ArrayExample {
//Arrays are used to store multiple values of the same type in a single variable — 
	//super useful when looping through test data,form inputs, etc.
	public static void main(String[] args) {
		int[] marks = {90,85,70,95,60};
		for(int i = 0; i < marks.length; i++) {
			System.out.println("Mark at index "+ i+" : "+ marks[i]);
		}

	}

}
