package auto;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;

public class coreActivities {

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
		for (int i = 0; i < text.length(); i++){
			char c = text.charAt(i);
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
	}
}
