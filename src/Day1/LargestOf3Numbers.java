package Day1;

public class LargestOf3Numbers {

	public static void main(String[] args) {
		int a= 10;
		int b = 25;
		int c = 35;
		if(a>=b && a>=c) {
			System.out.println("a ("+a+") is the largest number");
		
		} else if(b>=a && b>=c) {
			System.out.println("b ("+ b +") is the largest number");
			} else {
				System.out.println("c ("+c+")is the largest number");
			}

	}

}
