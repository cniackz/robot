package auto;

import java.awt.AWTException;
import java.awt.event.KeyEvent;

import auto.otherActivities;
import auto.coreActivities;

public class outlookRobot {

	/**************************************************************************
	 * 
	 * Open outlook and then wait for 1 second.
	 * @throws AWTException
	 * @throws InterruptedException
	 * 
	 **************************************************************************/
	public static void openOutlook() throws AWTException, InterruptedException{
		System.out.println("Outlook");
		coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_ALT,KeyEvent.VK_O);
		otherActivities.waitProgressBar(10);
	}

	/**************************************************************************
	 * 
	 * This function put selector in the Inbox folder and wait for 0.2 seconds.
	 * @throws AWTException
	 * @throws InterruptedException
	 * 
	 *************************************************************************/
	public static void goToInbox() throws AWTException, InterruptedException{
		for(int x = 0; x < 6; x++){
	    	coreActivities.nKeysAtSameTime(KeyEvent.VK_F6);
	    }
	    System.out.println("Inbox");
	    otherActivities.waitProgressBar(2);		
	}

	/**************************************************************************
	 * 
	 * This function put selector in the Outbox folder and wait for 0.2 sec.
	 * @throws InterruptedException 
	 * @throws AWTException 
	 * 
	 **************************************************************************/
	public static void goToOutbox() throws AWTException, InterruptedException{

		// First go to Inbox
		outlookRobot.goToInbox();
	    
		// Then go to Outbox
	    System.out.println("Outbox");
	    coreActivities.nKeysAtSameTime(KeyEvent.VK_O);
	    otherActivities.waitProgressBar(2);
	
	}
	
	/**************************************************************************
	 * 
	 * This function put selector in the OnlineArchive folder and wait 
	 * for 0.2 seconds.
	 * @throws AWTException
	 * @throws InterruptedException
	 *
	 **************************************************************************/
	public static void goToOnlineArchive() throws AWTException, InterruptedException{
		// Go to outbox
		outlookRobot.goToOutbox();
        
        System.out.println("Online Archive");
        coreActivities.nKeysAtSameTime(KeyEvent.VK_O);
        otherActivities.waitProgressBar(2);
	}
	
	/**************************************************************************
	 * 
	 * This function put selector in the Deleted Items folder and wait 
	 * for 0.2 seconds.
	 * @throws AWTException
	 * @throws InterruptedException
	 *
	 **************************************************************************/	
	public static void goToDeletedItems() throws AWTException, InterruptedException{
		System.out.println("Deleted Items");
	    coreActivities.nKeysAtSameTime(KeyEvent.VK_DOWN);
	    otherActivities.waitProgressBar(2);	
	}
	
	/**************************************************************************
	 * 
	 * This function put selector in the My Folders folder and wait 
	 * for 0.2 seconds.
	 * @throws AWTException
	 * @throws InterruptedException
	 *
	 **************************************************************************/	
	public static void goToMyFolders() throws AWTException, InterruptedException{
		System.out.println("My Folders");
		coreActivities.nKeysAtSameTime(KeyEvent.VK_DOWN);
		otherActivities.waitProgressBar(2);
	}

}
