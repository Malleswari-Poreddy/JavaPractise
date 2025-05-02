package Day1;

public class ForLoop {

	public static void main(String[] args) {
	 for(int i = 1;i <=5; i++) {
		 System.out.println("Count: "+ i);
	 }
//Print numbers 1 to 100 using for loop
	 for(int i = 1; i<=100; i++) {
		 System.out.println("The numbers 1 to 100 :" + i);
	 }
// print all even numbers from 1 to 50
	 for(int i = 1; i<=50; i++) {
		 if(i%2==0) {
			 System.out.println("Even numbers: "+i);
		 }
	 }
//print multiplication table of a given number 7
	 int table =7;
	 for(int i=1; i<=10; i++) {
		 int result = table* i;
		 System.out.println(table+"*"+ i +"=" +result);
	 }
//calculate the sum of numbers from 1 to 10
	 int sum = 0;
	 for(int i =1; i<=10; i++) {
		 sum +=i;
		 System.out.println("Sum of numbers from 1 to 10 is: "+sum);
	 }
	}

}
/*n Java, we have three main types of loops: for, while, and do-while.

A for loop is best when we know in advance how many times we want to iterate. It combines initialization, condition, and increment in one line, which makes it concise for fixed loops — like printing numbers from 1 to 10.

A while loop checks the condition before running the loop body. It’s useful when we don’t know the number of iterations, and want to run the loop only if the condition is true.

A do-while loop is similar to while, but it checks the condition after executing the loop body. So it guarantees that the loop will run at least once. It’s helpful in situations like menu-driven programs or input validation where the first execution is required.
This program shows the same logic using all three loops:

The for loop is compact and best for fixed ranges.

The while loop checks before running, so if the condition is false initially, it won’t run.

The do-while loop always runs at least once, even if the condition is false — for example, if k = 5, it still prints once.*/