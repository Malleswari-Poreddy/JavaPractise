package Day2;

public class ManualStringreverse {

	public static void main(String[] args) {
		String original = "Hello Java";
		String reversed = "";
		for(int i = original.length()-1; i>=0;i--) {
			reversed = reversed+original.charAt(i);
		}
   System.out.println("original string "+original);
   System.out.println("Reversed String "+reversed);
	}

}
