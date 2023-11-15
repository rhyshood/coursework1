import java.util.Scanner;

public class Dec2Hex
{

    public static int Arg1;

    public static String main(String args[])
    {
	if (args.length <= 0 || args[0].equals("")){ // Checks if a number has been inputed
            System.out.println("Error: Please enter a number"); // Displays error if false
            return "-1";	
        } else {
            try {
                Arg1 = Integer.parseInt(args[0]);
                char ch[]={'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
                int rem, num;
                num = Arg1;
                String hexadecimal="";
                System.out.println("Converting the Decimal Value " + num + " to Hex...");

                while(num != 0)
                {
                    rem=num%16;
                    hexadecimal= ch[rem] + hexadecimal;
                    num= num/16;
                }

                System.out.println("Hexadecimal representation is: " + hexadecimal);
		return hexadecimal;
            } catch(Exception ex) // Displays Error if non-integer has been inserted
            {
                System.out.println("Error: Please only enter a number");
		return "-1"; 
            } 
        }
    }
}
