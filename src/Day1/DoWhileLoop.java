package Day1;

public class DoWhileLoop {

	public static void main(String[] args) {
		int i = 10;
		do {
			System.out.println("Value: "+i);
			i++;
		}
		while (i <=15);
	}

}
/*
n Java, we have three main types of loops: for, while, and do-while.

A for loop is best when we know in advance how many times we want to iterate. It combines initialization, condition, and increment in one line, which makes it concise for fixed loops — like printing numbers from 1 to 10.

A while loop checks the condition before running the loop body. It’s useful when we don’t know the number of iterations, and want to run the loop only if the condition is true.

A do-while loop is similar to while, but it checks the condition after executing the loop body. So it guarantees that the loop will run at least once. It’s helpful in situations like menu-driven programs or input validation where the first execution is required.
 
 This program shows the same logic using all three loops:

The for loop is compact and best for fixed ranges.

The while loop checks before running, so if the condition is false initially, it won’t run.

The do-while loop always runs at least once, even if the condition is false — for example, if k = 5, it still prints once.
 */