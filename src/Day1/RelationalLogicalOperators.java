package Day1;

public class RelationalLogicalOperators {
//elational (Comparison) Operators	>, <, ==, !=, >=, <=	Compare two values
	//Logical Operators	&&,	||,
	public static void main(String[] args) {
		int x = 10;
		int y = 20;
		System.out.println("x > y: "+(x > y));
		System.out.println("x < y: "+(x<y));
		System .out.println("x == y:"+(x == y));
		System.out.println("x != y:"+(x != y));
		
		//Logical operators
		
		boolean a = true;
		boolean b = false;
		
		System.out.println("a && b: "+(a && b));
		System.out.println("a || b: "+(a || b));
		System.out.println("!a: "+(!a));
		
		/* rite a Java program to:

Take two numbers num1 and num2

Print:

Which number is greater

If both are equal or not

Sum of two numbers

Difference of two numbers

🎯 Bonus Challenge: Try using && and || also!

*/
		int num1 = 20;
		int num2 = 30;
		if(num1 > num2) {
System.out.println("num1 (" + num1 + ") is greater than num2 (" + num2 + ").");
		} else if(num2 > num1){
			System.out.println("num2 (" + num2 + ") is greater than num1 (" + num1 + ").");	
			}else {
				System.out.println("num1 and num2 both are eual");
			}
		System.out.println("Sum of num1 +num2: "+ (num1+num2));
		System.out.println("Difference between num1 and num2: "+(num1 - num2));
		
		if(num1 > 1 && num2 > 0) {
			System.out.println("Both are postivite numbers");
		}

	}

}
