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
import java.util.Hashtable;
import java.util.Random;
import java.util.Scanner;
public class Auto {
	
	// Global variables
	static int x_IM = 1872;
	static int y_IM = 808;
	private static Scanner reader;
	private static Scanner reader2;

	//-------------------------------------------------------------------------
	// START: Function to debug
	//-------------------------------------------------------------------------
	// It stops the flow until the user agree to continue
	// 0 = continue
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
	//-------------------------------------------------------------------------
	// END: Function to debug
	//-------------------------------------------------------------------------

	//-------------------------------------------------------------------------
	// START: Functions to enhance the code
	//-------------------------------------------------------------------------
	public static void nKeysAtSameTime(int...numbers)
	throws AWTException{
		Robot robot = new Robot();
		for(int x = 0; x < numbers.length; x++){
			robot.keyPress(numbers[x]);
		}
		for(int x = 0; x < numbers.length; x++){
			robot.keyRelease(numbers[x]);
		}
	}
	
	public static void escribeUnMensaje(String text) throws AWTException {
		Hashtable<Character, Integer> numbers = new Hashtable<Character, Integer>();
		numbers.put('q', 81);
		numbers.put('Q', 9999981);
		numbers.put('w', 87);
		numbers.put('W', 9999987);
		numbers.put('e', 69);
		numbers.put('E', 9999969);
		numbers.put('r', 82);
		numbers.put('R', 9999982);
		numbers.put('t', 84);
		numbers.put('T', 9999984);
		numbers.put('a', 65);
		numbers.put('A', 9999965);
		numbers.put('s', 83);
		numbers.put('S', 9999983);
		numbers.put('d', 68);
		numbers.put('D', 9999968);
		numbers.put('f', 70);
		numbers.put('F', 9999970);
		numbers.put('g', 71);
		numbers.put('G', 9999971);
		numbers.put('z', 90);
		numbers.put('Z', 9999990);
		numbers.put('x', 88);
		numbers.put('X', 9999988);
		numbers.put('c', 67);
		numbers.put('C', 9999967);
		numbers.put('v', 86);
		numbers.put('V', 9999986);
		numbers.put('b', 66);
		numbers.put('B', 9999966);
		numbers.put('y', 89);
		numbers.put('Y', 9999989);
		numbers.put('u', 85);
		numbers.put('U', 9999985);
		numbers.put('i', 73);
		numbers.put('I', 9999973);
		numbers.put('o', 79);
		numbers.put('O', 9999979);
		numbers.put('p', 80);
		numbers.put('P', 9999980);
		numbers.put('h', 72);
		numbers.put('H', 9999972);
		numbers.put('j', 74);
		numbers.put('J', 9999974);
		numbers.put('k', 75);
		numbers.put('K', 9999975);
		numbers.put('l', 76);
		numbers.put('L', 9999976);
		numbers.put('n', 78);
		numbers.put('N', 9999978);
		numbers.put('m', 77);
		numbers.put('M', 9999977);
		numbers.put('/', 47);
		numbers.put('_', 99999);
		numbers.put('0', 48);
		numbers.put('1', 49);
		numbers.put('2', 50);
		numbers.put('3', 51);
		numbers.put('4', 52);
		numbers.put('5', 53);
		numbers.put('6', 54);
		numbers.put('7', 55);
		numbers.put('8', 56);
		numbers.put('9', 57);
		numbers.put('-', 45);
		numbers.put(' ', 32);
		numbers.put('=', 61);
		numbers.put('\'', 222);
		numbers.put('.', 46);
		for (int i = 0; i < text.length(); i++){
		    char c = text.charAt(i);        
		    //Process char
		    //System.out.println(c);
		    Integer n = numbers.get(c);
			if (n != null) {
				if (n >= 99999){
					//Special case
					if (99999 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_MINUS);
					} else if(9999971 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_G);
					} else if(9999975 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_K);
					} else if(9999982 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_R);
					} else if(9999969 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_E);
					} else if(9999976 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_L);
					} else if(9999965 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_A);
					} else if(9999983 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_S);
					} else if(9999977 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_M);
					} else if(9999968 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_D);
					} else if(9999979 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_O);
					} else if(9999970 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_F);
					} else if(9999980 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_P);
					} else if(9999966 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_B);
					} else if(9999972 == n){
						nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_H);
					} else {
						System.out.println("no yet implemented");
					}
				} else {
					nKeysAtSameTime(n);	
				}
			} else {
				System.out.println("Null");
			}	
		}
	}
	
	public static void waitProgressBar(int sleepTime) throws InterruptedException{
		int sleepTimeInSec = sleepTime * 1000;
		for(int x = 0; x < 10; x++){
			System.out.print(".");
			Thread.sleep(sleepTimeInSec/10);
		}
		System.out.println("");
	}
	//-------------------------------------------------------------------------
	// END: Functions to enhance the code
	//-------------------------------------------------------------------------

	public static void pretende() throws AWTException, InterruptedException{
		nKeysAtSameTime(KeyEvent.VK_WINDOWS);
		Thread.sleep(3000);
		escribeUnMensaje("notepad");
		Thread.sleep(3000);
		nKeysAtSameTime(KeyEvent.VK_ENTER);
		Thread.sleep(5000);
		escribeUnMensaje("Pablo Barba: Estare usando el sistema");
		Thread.sleep(3000);
		nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
		Thread.sleep(3000);
		nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_N);
		Thread.sleep(3000);
	}

	public static void uploadLatestModel() 
    throws AWTException, InterruptedException{

		Robot robot = new Robot();

        System.out.println("Outlook");
        nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_ALT,KeyEvent.VK_O);
        waitProgressBar(10);
        
        System.out.println("Restore,Move,Size,Minimize,Maximize,Close");
        nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_SPACE);
        waitProgressBar(2);
        
        System.out.println("Maximize");
        nKeysAtSameTime(KeyEvent.VK_X);
        waitProgressBar(2);
        
        for(int x = 0; x < 6; x++){
        	nKeysAtSameTime(KeyEvent.VK_F6);
        }
        System.out.println("Inbox");
        waitProgressBar(2);
        
        System.out.println("Outbox");
        nKeysAtSameTime(KeyEvent.VK_O);
        waitProgressBar(2);
        
        System.out.println("Online Archive");
        nKeysAtSameTime(KeyEvent.VK_O);
        waitProgressBar(2);
        
        nKeysAtSameTime(KeyEvent.VK_RIGHT);

        System.out.println("Deleted Items");
        nKeysAtSameTime(KeyEvent.VK_DOWN);
        waitProgressBar(2);
        
        System.out.println("My Folders");
        nKeysAtSameTime(KeyEvent.VK_DOWN);
        waitProgressBar(2);
        
        nKeysAtSameTime(KeyEvent.VK_RIGHT);
        nKeysAtSameTime(KeyEvent.VK_DOWN);
        nKeysAtSameTime(KeyEvent.VK_RIGHT);

        for(int x = 0; x < 10; x++){
        	nKeysAtSameTime(KeyEvent.VK_DOWN);
        }
        System.out.println("model");
        waitProgressBar(2);

        nKeysAtSameTime(KeyEvent.VK_ENTER);
        
        System.out.println("gkgn10ds");
        nKeysAtSameTime(KeyEvent.VK_TAB);
        waitProgressBar(3);
                
        robot.keyPress(KeyEvent.VK_CONTROL);
        nKeysAtSameTime(KeyEvent.VK_DOWN);
        nKeysAtSameTime(KeyEvent.VK_DOWN);
        nKeysAtSameTime(KeyEvent.VK_DOWN);
        nKeysAtSameTime(KeyEvent.VK_DOWN);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        robot.keyPress(KeyEvent.VK_CONTROL);
        nKeysAtSameTime(KeyEvent.VK_RIGHT);
        nKeysAtSameTime(KeyEvent.VK_RIGHT);
        robot.keyRelease(KeyEvent.VK_CONTROL);
        
        System.out.println("/nfs/site/disks/...");
        robot.keyPress(KeyEvent.VK_SHIFT);
        nKeysAtSameTime(KeyEvent.VK_END);
        nKeysAtSameTime(KeyEvent.VK_LEFT);
        robot.keyRelease(KeyEvent.VK_SHIFT);
        waitProgressBar(2);
        
        System.out.println("copy the path");
        nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_C);
        waitProgressBar(30);

        System.out.println("ATS Queue");
        nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_ALT,KeyEvent.VK_A);
        waitProgressBar(1);
        
        System.out.println("Yes");
        waitProgressBar(5);
        
        nKeysAtSameTime(KeyEvent.VK_ENTER);
        waitProgressBar(15);

        System.out.println("Context Management...");
        nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_T);
        waitProgressBar(5);
        
        nKeysAtSameTime(KeyEvent.VK_M);
        System.out.println("Model Management");
        waitProgressBar(5);

        for(int x = 0; x<3; x++){
        	nKeysAtSameTime(KeyEvent.VK_TAB);
        }
        nKeysAtSameTime(KeyEvent.VK_ENTER);
        System.out.println("Add Model");
        waitProgressBar(5);
        
        nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
        
        // --------------------------------------------------------------------
        // To complete the command
        // --------------------------------------------------------------------
        escribeUnMensaje(" -dut glk -tb='-mfe -cf ");

        // --------------------------------------------------------------------
        // To paste model path (Ctrl+V)
        // --------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
        
        // --------------------------------------------------------------------
        // To complete the command
        // --------------------------------------------------------------------
        //        /cfg_env/dut/glk/bin/ModelFrontEnd.xml'
        escribeUnMensaje("/cfg_env/dut/glk/bin/ModelFrontEnd.xml'");
        
        //---------------------------------------------------------------------
        // Move to Description
        //---------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_TAB);
        
        //---------------------------------------------------------------------
        // Paste the model Ctrl + V
        //---------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
        
        //---------------------------------------------------------------------
        // Move to the right point to get just the name of the model
        //---------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_LEFT);
        
        // 18 times to the left
        for( int x = 0; x<18; x++ ){
        	nKeysAtSameTime(KeyEvent.VK_LEFT);
        }
        
        //---------------------------------------------------------------------
        // Select the part that will be removed
        //---------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_HOME);
        
        //---------------------------------------------------------------------
        // Press Delete to get rid off the path and keep the name
        //---------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_DELETE);
        
        //---------------------------------------------------------------------
        // Move to Configs
        //---------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_TAB);
        
        //---------------------------------------------------------------------
        // Move to Pipe2d
        //---------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_P);

        //---------------------------------------------------------------------
        // Move to OK button
        //---------------------------------------------------------------------
        nKeysAtSameTime(KeyEvent.VK_TAB);
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
			nKeysAtSameTime(KeyEvent.VK_WINDOWS,KeyEvent.VK_B);
			
			System.out.println("Enter");
			nKeysAtSameTime(KeyEvent.VK_ENTER);
			
			System.out.println("Up up");
			nKeysAtSameTime(KeyEvent.VK_UP);
			nKeysAtSameTime(KeyEvent.VK_UP);
			
			System.out.println("Up up");
			nKeysAtSameTime(KeyEvent.VK_UP);
			nKeysAtSameTime(KeyEvent.VK_UP);
			
			System.out.println("S");
			nKeysAtSameTime(KeyEvent.VK_S);
			
			System.out.println("S");
			nKeysAtSameTime(KeyEvent.VK_S);
			
			System.out.println("S");
			nKeysAtSameTime(KeyEvent.VK_S);
			
			System.out.println("space");
			nKeysAtSameTime(KeyEvent.VK_SPACE);
			
			System.out.println("sleep 3 seconds");
			Thread.sleep(3000);
			
			System.out.println("m");
			nKeysAtSameTime(KeyEvent.VK_M);
			
			System.out.println("sleep 3 seconds");
			Thread.sleep(3000);
			
			if(x%2==0){
				
				// yellow
				System.out.println("e, go yellow");
				nKeysAtSameTime(KeyEvent.VK_E);
				
				System.out.println("sleep 3 seconds");
				Thread.sleep(3000);
				
				System.out.println("alt + F4");
				nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
				
				System.out.println("move mouse for 40 minutes");
				keepMoving(800);

			} else {
				
				// green
				System.out.println("v, go green");
				nKeysAtSameTime(KeyEvent.VK_V);
				
				System.out.println("sleep 3 seconds");
				for(int cnt=0;cnt>6;cnt++){
					pretendTyping();
					Thread.sleep(500);
				}
				
				pretendTyping();
				System.out.println("alt + F4");
				nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);

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
		nKeysAtSameTime(KeyEvent.VK_RIGHT);
		nKeysAtSameTime(KeyEvent.VK_RIGHT);
		nKeysAtSameTime(KeyEvent.VK_ENTER);
		if(phrase == ""){
			for(int cnt = 0; cnt < 10; cnt++){
				escribeUnMensaje("a");
				Thread.sleep(500);
			}
		} else {
			escribeUnMensaje(phrase);
			nKeysAtSameTime(KeyEvent.VK_ENTER);
		}
		Thread.sleep(5000);
		nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
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
			nKeysAtSameTime(KeyEvent.VK_RIGHT);
			nKeysAtSameTime(KeyEvent.VK_RIGHT);
			nKeysAtSameTime(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_TAB);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_A);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_C);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_ESCAPE);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_WINDOWS,KeyEvent.VK_D);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_A);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_ENTER);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_BACK_SPACE);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_LEFT);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_X);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_A);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_V);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_CONTROL,KeyEvent.VK_S);
			Thread.sleep(1000);
			nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
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
					nKeysAtSameTime(KeyEvent.VK_WINDOWS,KeyEvent.VK_B);
					
					System.out.println("Enter");
					nKeysAtSameTime(KeyEvent.VK_ENTER);
					
					System.out.println("Up up");
					nKeysAtSameTime(KeyEvent.VK_UP);
					nKeysAtSameTime(KeyEvent.VK_UP);
					
					System.out.println("Up up");
					nKeysAtSameTime(KeyEvent.VK_UP);
					nKeysAtSameTime(KeyEvent.VK_UP);
					
					System.out.println("S");
					nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("S");
					nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("S");
					nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("space");
					nKeysAtSameTime(KeyEvent.VK_SPACE);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
					
					System.out.println("m");
					nKeysAtSameTime(KeyEvent.VK_M);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
						
					// yellow
					System.out.println("e, go yellow");
					nKeysAtSameTime(KeyEvent.VK_E);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
					
					System.out.println("alt + F4");
					nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
		        }
		        if(wikiString.equals("g")){
					Thread.sleep(3000);
					System.out.println("Windows + B");
					nKeysAtSameTime(KeyEvent.VK_WINDOWS,KeyEvent.VK_B);
					
					System.out.println("Enter");
					nKeysAtSameTime(KeyEvent.VK_ENTER);
					
					System.out.println("Up up");
					nKeysAtSameTime(KeyEvent.VK_UP);
					nKeysAtSameTime(KeyEvent.VK_UP);
					
					System.out.println("Up up");
					nKeysAtSameTime(KeyEvent.VK_UP);
					nKeysAtSameTime(KeyEvent.VK_UP);
					
					System.out.println("S");
					nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("S");
					nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("S");
					nKeysAtSameTime(KeyEvent.VK_S);
					
					System.out.println("space");
					nKeysAtSameTime(KeyEvent.VK_SPACE);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
					
					System.out.println("m");
					nKeysAtSameTime(KeyEvent.VK_M);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
						
					// yellow
					System.out.println("e, go green");
					nKeysAtSameTime(KeyEvent.VK_V);
					
					System.out.println("sleep 3 seconds");
					Thread.sleep(3000);
					
					System.out.println("alt + F4");
					nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_F4);
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
		reader = new Scanner(System.in);
		int option = reader.nextInt();
		if(option == 1){
			uploadLatestModel();
		}
		if(option == 2){
			keepChanging();
		}
		if(option == 3){
			keepMoving(800);
		}
		if(option == 4){
			while(true){
				respondBack();
			}
		}
		if(option == 5){
			while(true){
				pretendTyping();
			}
		}
		if(option == 6){
			while(true)
				controlSystem();
		}
	}

}