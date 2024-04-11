import java.util.Scanner;
public class TruthTable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input=new Scanner(System.in);
		 
		//Declaring variables
	    boolean parents = false;
	    boolean weather = false;
	    boolean rich = false;
	      
	      
		System.out.println("Are parents visiting Yes or No?");
		if (input.next().equals("Yes"))
			parents = true;
		System.out.println("Is the weather good Yes or No?");
		if (input.next().equals("Yes"))
			weather = true;
		System.out.println("Are you rich Yes or No?");
		if (input.next().equals("Yes"))
			rich = true;
		System.out.println("You should go : ");
		if (!parents && weather && rich) {
			System.out.println("Go shopping!");
		}
		else if (!parents && !weather && !rich) {
			System.out.println("Stay in!");
		}
		else {
			System.out.println("Go to the Cinema!");
		}
	}

}
