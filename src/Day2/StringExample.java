package Day2;

public class StringExample {

	public static void main(String[] args) {
		String message = "Welcome to Java Automation";
		System.out.println("length: "+message.length());
		System.out.println("UPPERCASE: "+ message.toUpperCase());
		System.out.println("Contains 'Java'? "+ message.contains("Java"));
		System.out.println("First word: "+ message.split(" ")[0]);
	}

}

/*You’ll handle text a lot: input fields, labels, URLs, logs.

Java provides built-in String methods to make your life easier.
Commonly Used String Methods
Method	           Example	                  Description
length()	      str.length()	               Length of the string
charAt(i)	      str.charAt(0)	               Character at index
toLowerCase()	  str.toLowerCase()	           Convert to lowercase
toUpperCase()	  str.toUpperCase()	           Convert to uppercase
equals()	      a.equals(b)	               Compare values
equalsIgnoreCase()	a.equalsIgnoreCase(b)	   Compare ignoring case
contains()	        str.contains("test")	           Checks if substring exists
substring(start, end)	str.substring(0, 3)	    Extract portion
replace(a, b)	     str.replace("a", "b")	        Replace characters
split(" ")	         str.split(" ")	                    Break string into parts*/
