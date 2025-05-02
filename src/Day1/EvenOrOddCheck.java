package Day1;

public class EvenOrOddCheck {
/*Logic:
A number is even if it's divisible by 2 (number % 2 == 0).

Otherwise, it's odd.*/
	public static void main(String[] args) {
		int number = 7;
		
		if(number % 2 == 0) {
			System.out.println(number +"  is even ");
		}
		else {
			System.out.println(number +" is Odd number");
		}

	}

}
