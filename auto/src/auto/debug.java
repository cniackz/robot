package auto;

import java.util.Scanner;

public class debug {

	private static Scanner reader2;
	
	/**************************************************************************
	 * It stops the flow until the user agree to continue
	 * 0 = continue
	 *************************************************************************/
	public static void stop(){
		boolean stop = true;
		reader2 = new Scanner(System.in);
		System.out.println("type 0 to continue:");
		while( stop ){
			int n = reader2.nextInt();
			if( n == 0 ){
				stop = false;
			}
		}
	}

}
