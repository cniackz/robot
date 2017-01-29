package auto;

public class otherActivities {

	/**************************************************************************
	 * 
	 * It shows a progress bar in command line with dots.
	 * @param sleepTime : in hundred of mili-seconds
	 * @throws InterruptedException
	 * 
	 *************************************************************************/
	public static void waitProgressBar(int sleepTime) throws InterruptedException{
		for(int x = 0; x < 10; x++){
			System.out.print(".");
			Thread.sleep( sleepTime * 100 );
		}
		System.out.println("");
	}
	
}
