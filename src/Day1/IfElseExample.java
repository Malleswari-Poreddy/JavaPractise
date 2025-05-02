package Day1;

public class IfElseExample {
	/*
	 IF-ELSE CONDITIONAL STATEMENTS
🎯 Why this is important for Automation?
Helps in decision-making in scripts (e.g., if login is successful, then…).

Used heavily in test case validations (if (actual.equals(expected))…).

📘 Syntax of if, else if, else:
java
Copy code
if (condition) {
    // code runs if condition is true
} else if (anotherCondition) {
    // runs if the above fails but this is true
} else {
    // runs if none of the above conditions are true
     * } 
	 */
	
	 

	public static void main(String[] args) {
		int age = 18;
		if(age >= 18) {
			System.out.println("Eligible to vote");
		}else {
			System.out.println("Not eligible to vote");
		}

	}

}
