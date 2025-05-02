package Day1;

public class ReverseNumber {

	public static void main(String[] args) {
	
		        int numb = 9110;
		        int reversed = 0;

		        for (; numb != 0; numb /= 10) {
		            int digit = numb % 10;
		            reversed = reversed * 10 + digit;
		        }

		        System.out.println("Reversed number is: " + reversed);
		    }
		

	}


