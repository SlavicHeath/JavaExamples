import java.util.Scanner;
public class PhoneNumbers {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
	System.out.println("Enter your phone number: ");
	String num = input.nextLine();
	String output = "";
	
	int i = num.indexOf('-');
	int j = num.lastIndexOf('-');
	
	if(i==j & i>0)
		output=num.substring(0,j)+num.substring(j+1);
	else if(i>0 && j>0)
		 output=num.substring(0,i)+num.substring(i+1,j)+num.substring(j+1);
	else 
		output = num;
	System.out.println("Your number is : " + output);
	}

}
