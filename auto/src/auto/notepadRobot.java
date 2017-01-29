package auto;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

public class notepadRobot {
	
	/**************************************************************************
	 * 
	 * It writes a message in Notepad and then close it
	 * @throws AWTException
	 * @throws InterruptedException
	 * 
	 **************************************************************************/
	public static void setMessage() throws AWTException, InterruptedException{
		coreActivities.nKeysAtSameTime(KeyEvent.VK_WINDOWS);
		Thread.sleep(3000);
		coreActivities.writeMessage("notepad");
		Thread.sleep(3000);
		coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		coreActivities.writeMessage("Pablo Barba: Estare usando el sistema");
		Thread.sleep(3000);
		// Close
		coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
		Thread.sleep(3000);
		// Not save
		coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_N);
		Thread.sleep(3000);
	}

}
