package auto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

/******************************************************************************
 * 
 * This Class contains the core functionality of the Robot
 * Because these are typical things to do for a human, like:
 * Type a message thru keyboard.
 * Use Short cuts for Windows.
 * @author Cesar Celis Hernandez
 *
 ******************************************************************************/
public class coreActivities {

	/**************************************************************************
	 * 
	 * This function allow code to press and release two keys at the same time
	 * It is useful for Windows shortcuts like:
	 * Control + C => To copy
	 * Control + V => To paste
	 * @param numbers
	 * @throws AWTException
	 * 
	 *************************************************************************/
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

	/**************************************************************************
	 * 
	 * This function write only first half of upperCase letters thru the 
	 * keyboard
	 * @param c : the character that will be written thru the keyboard
	 * @throws AWTException
	 * 
	 *************************************************************************/
	private static void write1stHalfUpperCLetter( char c ) throws AWTException{
		switch(c) {
	    	case 'Q':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_Q); break;
	    	case 'W':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_W); break;
	    	case 'E':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_E); break;
	    	case 'R':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_R); break;
	    	case 'T':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_T); break;
	    	case 'Y':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_Y); break;
	    	case 'U':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_U); break;
	    	case 'I':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_I); break;
	    	case 'O':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_O); break;
	    	case 'P':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_P); break;
	    	case 'A':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_A); break;
	    	case 'S':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_S); break;
	    	case 'D':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_D); break;
			default: break;
		}
	}

	/**************************************************************************
	 * 
	 * This function write only second half of upperCase letters thru the 
	 * keyboard
	 * @param c : the character that will be written thru the keyboard
	 * @throws AWTException
	 * 
	 *************************************************************************/
	private static void write2ndHalfUpperCLetter( char c ) throws AWTException{
		switch(c) {
	    	case 'F':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_F); break;
	    	case 'G':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_G); break;
	    	case 'H':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_H); break;
	    	case 'J':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_J); break;
	    	case 'K':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_K); break;
	    	case 'L':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_L); break;
	    	case 'Z':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_Z); break;
	    	case 'X':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_X); break;
	    	case 'C':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_C); break;
	    	case 'V':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_V); break;
	    	case 'B':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_B); break;
	    	case 'N':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_N); break;
	    	case 'M':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_M); break;
			default: break;
		}
	}

	/**************************************************************************
	 * 
	 * This function write only upperCase letters thru the keyboard
	 * @param c : the character that will be written thru the keyboard
	 * @throws AWTException
	 * 
	 *************************************************************************/
	private static void writeUpperCaseLetter( char c ) throws AWTException{
		write1stHalfUpperCLetter(c);
		write2ndHalfUpperCLetter(c);
	}

	/**************************************************************************
	 * 
	 * This function write only first half of lowerCase letters thru the 
	 * keyboard
	 * @param c : the character that will be written thru the keyboard
	 * @throws AWTException
	 * 
	 *************************************************************************/
	private static void write1stLowerCaseLetter( char c ) throws AWTException{
		switch(c) {
	    	case 'q':nKeysAtSameTime(KeyEvent.VK_Q); break;
	    	case 'w':nKeysAtSameTime(KeyEvent.VK_W); break;
	    	case 'e':nKeysAtSameTime(KeyEvent.VK_E); break;
	    	case 'r':nKeysAtSameTime(KeyEvent.VK_R); break;
	    	case 't':nKeysAtSameTime(KeyEvent.VK_T); break;
	    	case 'y':nKeysAtSameTime(KeyEvent.VK_Y); break;
	    	case 'u':nKeysAtSameTime(KeyEvent.VK_U); break;
	    	case 'i':nKeysAtSameTime(KeyEvent.VK_I); break;
	    	case 'o':nKeysAtSameTime(KeyEvent.VK_O); break;
	    	case 'p':nKeysAtSameTime(KeyEvent.VK_P); break;
	    	case 'a':nKeysAtSameTime(KeyEvent.VK_A); break;
	    	case 's':nKeysAtSameTime(KeyEvent.VK_S); break;
	    	case 'd':nKeysAtSameTime(KeyEvent.VK_D); break;
			default: break;
		}
	}

	/**************************************************************************
	 * 
	 * This function write only second half of lowerCase letters thru the 
	 * keyboard
	 * @param c : the character that will be written thru the keyboard
	 * @throws AWTException
	 * 
	 *************************************************************************/
	private static void write2ndLowerCaseLetter( char c ) throws AWTException{
		switch(c) {
	    	case 'f':nKeysAtSameTime(KeyEvent.VK_F); break;
	    	case 'g':nKeysAtSameTime(KeyEvent.VK_G); break;
	    	case 'h':nKeysAtSameTime(KeyEvent.VK_H); break;
	    	case 'j':nKeysAtSameTime(KeyEvent.VK_J); break;
	    	case 'k':nKeysAtSameTime(KeyEvent.VK_K); break;
	    	case 'l':nKeysAtSameTime(KeyEvent.VK_L); break;
	    	case 'z':nKeysAtSameTime(KeyEvent.VK_Z); break;
	    	case 'x':nKeysAtSameTime(KeyEvent.VK_X); break;
	    	case 'c':nKeysAtSameTime(KeyEvent.VK_C); break;
	    	case 'v':nKeysAtSameTime(KeyEvent.VK_V); break;
	    	case 'b':nKeysAtSameTime(KeyEvent.VK_B); break;
	    	case 'n':nKeysAtSameTime(KeyEvent.VK_N); break;
	    	case 'm':nKeysAtSameTime(KeyEvent.VK_M); break;
			default: break;
		}
	}

	/**************************************************************************
	 * 
	 * This function write only lowerCase letters thru the keyboard
	 * @param c : the character that will be written thru the keyboard
	 * @throws AWTException
	 * 
	 *************************************************************************/
	private static void writeLowerCaseLetter( char c ) throws AWTException{
		write1stLowerCaseLetter(c);
		write2ndLowerCaseLetter(c);
	}

	/**************************************************************************
	 * 
	 * This function write only symbols thru the keyboard
	 * @param c : the character that will be written thru the keyboard
	 * @throws AWTException
	 * 
	 *************************************************************************/
	private static void writeSymbol( char c ) throws AWTException{
		switch(c) {
	    	case '-':nKeysAtSameTime(KeyEvent.VK_MINUS); break;
	    	case ' ':nKeysAtSameTime(KeyEvent.VK_SPACE); break;
	    	case '=':nKeysAtSameTime(KeyEvent.VK_EQUALS); break;
	    	case '\'':nKeysAtSameTime(KeyEvent.VK_QUOTE); break;
	    	case '.':nKeysAtSameTime(KeyEvent.VK_PERIOD); break;
	    	case '_':nKeysAtSameTime(KeyEvent.VK_SHIFT,KeyEvent.VK_MINUS); break;
	    	case '/':nKeysAtSameTime(KeyEvent.VK_SLASH); break;
	    	case '0':nKeysAtSameTime(KeyEvent.VK_0); break;
	    	case '1':nKeysAtSameTime(KeyEvent.VK_1); break;
	    	case '2':nKeysAtSameTime(KeyEvent.VK_2); break;
	    	case '3':nKeysAtSameTime(KeyEvent.VK_3); break;
	    	case '4':nKeysAtSameTime(KeyEvent.VK_4); break;
	    	case '5':nKeysAtSameTime(KeyEvent.VK_5); break;
	    	case '6':nKeysAtSameTime(KeyEvent.VK_6); break;
	    	case '7':nKeysAtSameTime(KeyEvent.VK_7); break;
	    	case '8':nKeysAtSameTime(KeyEvent.VK_8); break;
	    	case '9':nKeysAtSameTime(KeyEvent.VK_9); break;
			default: break;
		}
	}

	/**************************************************************************
	 * 
	 * This function allows the code to write a message thru the keyboard
	 * @param text : String to be written thru the keyboard
	 * @throws AWTException
	 * 
	 *************************************************************************/
	public static void writeMessage(String text) throws AWTException {
		for (int i = 0; i < text.length(); i++){
			char c = text.charAt(i);
			writeUpperCaseLetter(c);
			writeLowerCaseLetter(c);
			writeSymbol(c);
		}
	}
	
	/**************************************************************************
	 * 
	 * It Restore, Move, Size, Minimize, Maximize or Close Window
	 * @param option :
	 *     Restore  = KeyEvent.VK_R
	 *     Move     = KeyEvent.VK_M
	 *     Size     = KeyEvent.VK_S
	 *     Minimize = KeyEvent.VK_N
	 *     Maximize = KeyEvent.VK_X
	 *     Close    = KeyEvent.VK_C
	 * @throws AWTException
	 * @throws InterruptedException
	 *
	 *************************************************************************/
	public static void windowSize( int option ) throws AWTException, InterruptedException{
		
		System.out.println("Restore,Move,Size,Minimize,Maximize,Close");
        coreActivities.nKeysAtSameTime(KeyEvent.VK_ALT,KeyEvent.VK_SPACE);
        otherActivities.waitProgressBar(2);
        coreActivities.nKeysAtSameTime(option);
        otherActivities.waitProgressBar(2);

	}
}
