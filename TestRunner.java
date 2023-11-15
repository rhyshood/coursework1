// Imports
import org.junit.runner.JUnitCore;
import org.junit.runner.Result;

import org.junit.runner.notification.Failure;
import java.lang.Exception;

public class TestRunner {
	public static void main(String[] args){
		// Runs Dec2HexTest and assigns it to result
		Result result = JUnitCore.runClasses(Dec2HexTest.class);
		// Initialises fails variable
		int fails = 0;
		try
		{
			// Loops through each failure
			for (Failure failure : result.getFailures()) {
				// Prints failure reason
				System.out.println(failure.toString());
				// Increases fail count
				fails++;
			}
			// Checks if there were any failures
			if(fails > 0){
			  // If so, it then throws an exception and stops the test.
			  throw  new Exception();
			}
			// if there were no failures, a success message is displayed 
			System.out.println(result.wasSuccessful());
		}
		catch(Exception e) // runs if there were any failures
		{
			// displays amount of tests failed, and exits the program
			System.out.println("" + fails + " tests failed");
			System.exit(1);
		}
		System.exit(0);
	}
}
