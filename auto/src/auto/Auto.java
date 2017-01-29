package auto;
import java.awt.MouseInfo;
import java.awt.Point;
import java.awt.Color;
import java.awt.Robot;
import java.awt.AWTException;
import java.awt.event.InputEvent;
import java.awt.event.KeyEvent;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.Random;
import java.util.Scanner;
import auto.coreActivities;
import auto.outlookRobot;

public class Auto {
	
	// Global variables
	static int x_IM = 1872;
	static int y_IM = 808;
	private static Scanner reader;

	public static void uploadLatestModel() 
    throws AWTException, InterruptedException{

		Robot robot = new Robot();
		
		// Open OutLook
		outlookRobot.openOutlook();
		
		// Maximize window
		coreActivities.windowSize( KeyEvent.VK_X );
     
		// Go to OnlineArchive
		outlookRobot.goToOnlineArchive();
		
		// Enter in OnlineArchive
		// This option will only work if you are connected to Intel network.
		coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);
		
		// Go to the Deleted Items
		outlookRobot.goToDeletedItems();
        
		// Go to My Folders
		outlookRobot.goToMyFolders();
        
		// Enter in My Folders
        coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);
		
		// Enter in VPG folder
        coreActivities.nKeysAtSameTime(KeyEvent.VK_DOWN);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);

        // Enter in model folder
        for(int x = 0; x < 10; x++){
        	coreActivities.nKeysAtSameTime(KeyEvent.VK_DOWN);
        }
        System.out.println("model");
        otherActivities.waitProgressBar(2);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
        otherActivities.waitProgressBar(3);
		
        // Go to latest email from gkgn10ds
        System.out.println("gkgn10ds");
        coreActivities.nKeysAtSameTime(KeyEvent.VK_TAB);
        otherActivities.waitProgressBar(3);
		
        // Start selecting the text
        // It should select a string like this:
        // /nfs/site/disks/fm_cnlgt_01526/gkgen10disp/GK_RELEASE_MODELS/disp/gen10_disp_common-16ww53b
        robot.keyPress(KeyEvent.VK_CONTROL);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_DOWN);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_DOWN);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_DOWN);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_CONTROL);
		
        robot.keyPress(KeyEvent.VK_CONTROL);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        System.out.println("/nfs/site/disks/...");
        robot.keyPress(KeyEvent.VK_SHIFT);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_END);
        coreActivities.nKeysAtSameTime(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        otherActivities.waitProgressBar(2);

        // Copy the path
        System.out.println("copy the path");
        coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_C);
        otherActivities.waitProgressBar(30);
		
        System.out.println("ATS Queue");
        coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_ALT,KeyEvent.VK_A);
        otherActivities.waitProgressBar(1);
        
		// We are under debug of this process to enhance the code.
        // Control + Alt + A is not opening ATS Queue.
		debug.stop();
		
        System.out.println("Yes");
        otherActivities.waitProgressBar(5);
        
        coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
        otherActivities.waitProgressBar(15);

        System.out.println("Context Management...");
        coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_T);
        otherActivities.waitProgressBar(5);
        
        coreActivities.nKeysAtSameTime(KeyEvent.VK_M);
        System.out.println("Model Management");
        otherActivities.waitProgressBar(5);

        for(int x = 0; x<3; x++){
        	coreActivities.nKeysAtSameTime(KeyEvent.VK_TAB);
        }
        coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
        System.out.println("Add Model");
        otherActivities.waitProgressBar(5);
        
        coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);

		
        // --------------------------------------------------------------------
        // To complete the command
        // --------------------------------------------------------------------
        coreActivities.writeMessage(" -dut glk -tb='-mfe -cf ");

        // --------------------------------------------------------------------
        // To paste model path (Ctrl+V)
        // --------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
        
        // --------------------------------------------------------------------
        // To complete the command
        // --------------------------------------------------------------------
        //        /cfg_env/dut/glk/bin/ModelFrontEnd.xml'
        coreActivities.writeMessage("/cfg_env/dut/glk/bin/ModelFrontEnd.xml'");
        
        //---------------------------------------------------------------------
        // Move to Description
        //---------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_TAB);
        
        //---------------------------------------------------------------------
        // Paste the model Ctrl + V
        //---------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
        
        //---------------------------------------------------------------------
        // Move to the right point to get just the name of the model
        //---------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_LEFT);
        
        // 18 times to the left
        for( int x = 0; x<18; x++ ){
        	coreActivities.nKeysAtSameTime(KeyEvent.VK_LEFT);
        }
        
        //---------------------------------------------------------------------
        // Select the part that will be removed
        //---------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_HOME);
        
        //---------------------------------------------------------------------
        // Press Delete to get rid off the path and keep the name
        //---------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_DELETE);
        
        //---------------------------------------------------------------------
        // Move to Configs
        //---------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_TAB);
        
        //---------------------------------------------------------------------
        // Move to Pipe2d
        //---------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_P);

        //---------------------------------------------------------------------
        // Move to OK button
        //---------------------------------------------------------------------
        coreActivities.nKeysAtSameTime(KeyEvent.VK_TAB);
        System.out.println("OK");
	}
	
	public static void keepMoving(int tsec) 
	throws AWTException, InterruptedException{
         Robot robot = new Robot();
         for(int x=0; x<tsec; x++){
        	 if( 0 == x%2 ){
        		 robot.mouseMove(300, 600);
        		 Thread.sleep(3000);
        	 } else{
        		 robot.mouseMove(600, 300);
        		 Thread.sleep(3000);
        		 
        	 } 
         }
	}
	
    // Keep changing the status of Skype from yellow to green
	// and moving the mouse for 40 minutes.
	// First we turn green, right after we turn yellow,
	// then we move mouse for 40 minutes to be yellow.
	// Finally we start over by being green again.
	public static void keepChanging() 
    throws AWTException, InterruptedException{
		int x = 1;
		while(true){
			Thread.sleep(3000);
			System.out.println("Windows + B");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_WINDOWS,KeyEvent.VK_B);
			
			System.out.println("Enter");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
			
			System.out.println("Up up");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
			
			System.out.println("Up up");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
			
			System.out.println("S");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
			
			System.out.println("S");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
			
			System.out.println("S");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
			
			System.out.println("space");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_SPACE);
			
			System.out.println("sleep 3 seconds");
			Thread.sleep(3000);
			
			System.out.println("m");
			coreActivities.nKeysAtSameTime(KeyEvent.VK_M);
			
			System.out.println("sleep 3 seconds");
			Thread.sleep(3000);
			
			if(x%2==0){
				
				// yellow
				System.out.println("e, go yellow");
				coreActivities.nKeysAtSameTime(KeyEvent.VK_E);
				
				System.out.println("sleep 3 seconds");
				Thread.sleep(3000);
				
				System.out.println("alt + F4");
				coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
				
				System.out.println("move mouse for 40 minutes");
				keepMoving(800);

			} else {
				
				// green
				System.out.println("v, go green");
				coreActivities.nKeysAtSameTime(KeyEvent.VK_V);
				
				System.out.println("sleep 3 seconds");
				for(int cnt=0;cnt>6;cnt++){
					pretendTyping();
					Thread.sleep(500);
				}
				
				pretendTyping();
				System.out.println("alt + F4");
				coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);

				pretendTyping();
			}
			x++;
		}
	}

	public static void printColor(int x, int y) throws AWTException{
		Robot robot = new Robot();
		Color color = robot.getPixelColor(x, y);
	    System.out.println("Red   = " + color.getRed());
	    System.out.println("Green = " + color.getGreen());
	    System.out.println("Blue  = " + color.getBlue());
	}
	
	public static void printMouseCoordinatesAndColor() throws AWTException{
		Point point = MouseInfo.getPointerInfo().getLocation();
		System.out.println("x = " + point.getX());
		System.out.println("y = " + point.getY());
		System.out.println("");
		printColor((int)point.getX(),(int)point.getY());
	}
	
	public static void typeMessage(int x, int y, String phrase ) throws AWTException, InterruptedException{
		Robot robot = new Robot();
		robot.mouseMove(x, y);
		robot.mousePress(InputEvent.BUTTON1_MASK);
		robot.mouseRelease(InputEvent.BUTTON1_MASK);
		Thread.sleep(1000);
		coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);
		coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);
		coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
		if(phrase == ""){
			for(int cnt = 0; cnt < 10; cnt++){
				coreActivities.writeMessage("a");
				Thread.sleep(500);
			}
		} else {
			coreActivities.writeMessage(phrase);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
		}
		Thread.sleep(5000);
		coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
	}
	
	public static boolean detectFirstIM() throws AWTException{
		Robot robot = new Robot();
		boolean result = false;
	    Color color = robot.getPixelColor(x_IM, y_IM);
	    if(color.getRed()==0){
	    	if(color.getGreen()>130&&color.getGreen()<180){
	    		if(color.getBlue()>180&&color.getBlue()<250){
	    			//System.out.println( "Blue = " + color.getBlue());
	    			//System.out.println( "Green = " + color.getGreen());
	    			//System.out.println( "Red = " + color.getRed());
	    			result = true;
	    		}
	    	}
	    }
		return result;
	}

	public static int getRandom(String[] array) {
	    int rnd = new Random().nextInt(array.length);
	    return rnd;
	}

	public static void respondBack() throws AWTException, InterruptedException{
		boolean detected = false;
		String[]array = {
				"hoy es un dia caluroso",
				"ojala baje el precio de la gasolina",
				"me siento de maravilla",
				"ping me later",
				"ahorita regreso",
				"no entendi",
				"de que hablas?",
				"Gil no mientas",
				"ventana equivocada",
				"que como?",
				"hoy es un dia libre, acuerdate!!!",
				"tons Vaca Argentina?",
				"como va tu 1.5%?",
				"a descanzar se ha dicho",
				"que quieres hacer?",
				"quien no querria?",
				"deeriamos hacerlo!",
				"eso es un arte",
				"no debes luchar demasiado!",
				"solo es una parte!",
				"y quien tiene la razon?",
				"nunca nos debemos rendir",
				"ya o que?",
				"paninos?",
				"es bueno para la salud",
				"se generoso te sentiras bien",
				"piensa menos y siente mas"
		};
		int randomComment = 0;
		while(true){
			detected = detectFirstIM();
			if(detected){
				randomComment = getRandom(array);
				typeMessage(x_IM,y_IM,array[randomComment]);
				detected = false;
			}
		}
	}

	public static void pretendTyping() throws AWTException, InterruptedException{
		boolean detected = false;
		detected = detectFirstIM();
		if(detected){
			typeMessage(x_IM,y_IM,"");
			detected = false;
		}
	}

	public static void controlSystem() throws AWTException, InterruptedException{
		Robot robot = new Robot();
		//get command
		boolean detected = false;
		detected = detectFirstIM();
		if(detected){
			robot.mouseMove(x_IM, y_IM);
			robot.mousePress(InputEvent.BUTTON1_MASK);
			robot.mouseRelease(InputEvent.BUTTON1_MASK);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_RIGHT);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_TAB);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_A);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_C);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_ESCAPE);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_WINDOWS,KeyEvent.VK_D);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_A);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_LEFT);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_X);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_A);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_S);
			Thread.sleep(1000);
			coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
			Thread.sleep(1000);
			// Read file to determine next step
			Path wiki_path = Paths.get("C:/Users/CCELIS/Desktop", "aaaaa.txt");
		    try {
		    	byte[] wikiArray = Files.readAllBytes(wiki_path);
		        String wikiString = new String(wikiArray, "ISO-8859-1");
		        System.out.println(wikiString);
		        if(wikiString.equals("y")){
					Thread.sleep(3000);
					System.out.println("Windows + B");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_WINDOWS,KeyEvent.VK_B);
					
					System.out.println("Enter");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
					
					System.out.println("Up up");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
					coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
					
					System.out.println("Up up");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
					coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
					
					System.out.println("S");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("S");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("S");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("space");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_SPACE);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
					
					System.out.println("m");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_M);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
						
					// yellow
					System.out.println("e, go yellow");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_E);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
					
					System.out.println("alt + F4");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
		        }
		        if(wikiString.equals("g")){
					Thread.sleep(3000);
					System.out.println("Windows + B");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_WINDOWS,KeyEvent.VK_B);
					
					System.out.println("Enter");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_ENTER);
					
					System.out.println("Up up");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
					coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
					
					System.out.println("Up up");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
					coreActivities.nKeysAtSameTime(KeyEvent.VK_UP);
					
					System.out.println("S");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("S");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("S");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("space");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_SPACE);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
					
					System.out.println("m");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_M);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
						
					// yellow
					System.out.println("e, go green");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_V);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
					
					System.out.println("alt + F4");
					coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
		        }
		    } catch (IOException e) {
		        System.out.println(e);
		    }
		}
		//perform action
	}
	
	public static void main(String[] args) 
    throws AWTException, InterruptedException {

		System.out.println("What do you want to do?:");
		System.out.println("1. Upload latest model");
		System.out.println("2. Keep changing Skype Status");
		System.out.println("3. Keep moving mouse to avoid computer to turn off");
		System.out.println("4. Automatically respond back thru Skype");
		System.out.println("5. Pretend that your are typing a respond");
		System.out.println("6. Control system from Skype commands");
		System.out.println("7. Test writeMessage");
		System.out.println("8. Notepad : set message");
		reader = new Scanner(System.in);
		int option = reader.nextInt();
		switch(option){
			case 1 : uploadLatestModel(); break;
			case 2 : keepChanging(); break;
			case 3 : keepMoving(800); break;
			case 4 : while(true) respondBack();
			case 5 : while(true) pretendTyping();
			case 6 : while(true) controlSystem();
			case 7 : coreActivities.writeMessage("Hola Cesar Celis"); break;
			case 8 : notepadRobot.setMessage(); break;
			default : break;
		}
	}

}