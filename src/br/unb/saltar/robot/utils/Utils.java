package br.unb.saltar.robot.utils;

import static java.awt.event.KeyEvent.*;
import java.awt.Robot;

public class Utils {
	
	public static void type(Robot bot, String text) {
		for (int i = 0; i < text.length(); i++) {
	        switch (text.charAt(i)) {
		        case 'a': doType(bot, VK_A); break;
		        case 'b': doType(bot, VK_B); break;
		        case 'c': doType(bot, VK_C); break;
		        case 'd': doType(bot, VK_D); break;
		        case 'e': doType(bot, VK_E); break;
		        case 'f': doType(bot, VK_F); break;
		        case 'g': doType(bot, VK_G); break;
		        case 'h': doType(bot, VK_H); break;
		        case 'i': doType(bot, VK_I); break;
		        case 'j': doType(bot, VK_J); break;
		        case 'k': doType(bot, VK_K); break;
		        case 'l': doType(bot, VK_L); break;
		        case 'm': doType(bot, VK_M); break;
		        case 'n': doType(bot, VK_N); break;
		        case 'o': doType(bot, VK_O); break;
		        case 'p': doType(bot, VK_P); break;
		        case 'q': doType(bot, VK_Q); break;
		        case 'r': doType(bot, VK_R); break;
		        case 's': doType(bot, VK_S); break;
		        case 't': doType(bot, VK_T); break;
		        case 'u': doType(bot, VK_U); break;
		        case 'v': doType(bot, VK_V); break;
		        case 'w': doType(bot, VK_W); break;
		        case 'x': doType(bot, VK_X); break;
		        case 'y': doType(bot, VK_Y); break;
		        case 'z': doType(bot, VK_Z); break;
		        case 'A': doType(bot, VK_SHIFT, VK_A); break;
		        case 'B': doType(bot, VK_SHIFT, VK_B); break;
		        case 'C': doType(bot, VK_SHIFT, VK_C); break;
		        case 'D': doType(bot, VK_SHIFT, VK_D); break;
		        case 'E': doType(bot, VK_SHIFT, VK_E); break;
		        case 'F': doType(bot, VK_SHIFT, VK_F); break;
		        case 'G': doType(bot, VK_SHIFT, VK_G); break;
		        case 'H': doType(bot, VK_SHIFT, VK_H); break;
		        case 'I': doType(bot, VK_SHIFT, VK_I); break;
		        case 'J': doType(bot, VK_SHIFT, VK_J); break;
		        case 'K': doType(bot, VK_SHIFT, VK_K); break;
		        case 'L': doType(bot, VK_SHIFT, VK_L); break;
		        case 'M': doType(bot, VK_SHIFT, VK_M); break;
		        case 'N': doType(bot, VK_SHIFT, VK_N); break;
		        case 'O': doType(bot, VK_SHIFT, VK_O); break;
		        case 'P': doType(bot, VK_SHIFT, VK_P); break;
		        case 'Q': doType(bot, VK_SHIFT, VK_Q); break;
		        case 'R': doType(bot, VK_SHIFT, VK_R); break;
		        case 'S': doType(bot, VK_SHIFT, VK_S); break;
		        case 'T': doType(bot, VK_SHIFT, VK_T); break;
		        case 'U': doType(bot, VK_SHIFT, VK_U); break;
		        case 'V': doType(bot, VK_SHIFT, VK_V); break;
		        case 'W': doType(bot, VK_SHIFT, VK_W); break;
		        case 'X': doType(bot, VK_SHIFT, VK_X); break;
		        case 'Y': doType(bot, VK_SHIFT, VK_Y); break;
		        case 'Z': doType(bot, VK_SHIFT, VK_Z); break;
		        case '`': doType(bot, VK_BACK_QUOTE); break;
		        case '0': doType(bot, VK_0); break;
		        case '1': doType(bot, VK_1); break;
		        case '2': doType(bot, VK_2); break;
		        case '3': doType(bot, VK_3); break;
		        case '4': doType(bot, VK_4); break;
		        case '5': doType(bot, VK_5); break;
		        case '6': doType(bot, VK_6); break;
		        case '7': doType(bot, VK_7); break;
		        case '8': doType(bot, VK_8); break;
		        case '9': doType(bot, VK_9); break;
		        case '-': doType(bot, VK_MINUS); break;
		        case '=': doType(bot, VK_EQUALS); break;
		        case '~': doType(bot, VK_SHIFT, VK_BACK_QUOTE); break;
		        case '!': doType(bot, VK_EXCLAMATION_MARK); break;
		        case '@': doType(bot, VK_AT); break;
		        case '#': doType(bot, VK_NUMBER_SIGN); break;
		        case '$': doType(bot, VK_DOLLAR); break;
		        case '%': doType(bot, VK_SHIFT, VK_5); break;
		        case '^': doType(bot, VK_CIRCUMFLEX); break;
		        case '&': doType(bot, VK_AMPERSAND); break;
		        case '*': doType(bot, VK_ASTERISK); break;
		        case '(': doType(bot, VK_LEFT_PARENTHESIS); break;
		        case ')': doType(bot, VK_RIGHT_PARENTHESIS); break;
		        case '_': doType(bot, VK_UNDERSCORE); break;
		        case '+': doType(bot, VK_PLUS); break;
		        case '\t': doType(bot, VK_TAB); break;
		        case '\n': doType(bot, VK_ENTER); break;
		        case '[': doType(bot, VK_OPEN_BRACKET); break;
		        case ']': doType(bot, VK_CLOSE_BRACKET); break;
		        case '\\': doType(bot, VK_BACK_SLASH); break;
		        case '{': doType(bot, VK_SHIFT, VK_OPEN_BRACKET); break;
		        case '}': doType(bot, VK_SHIFT, VK_CLOSE_BRACKET); break;
		        case '|': doType(bot, VK_SHIFT, VK_BACK_SLASH); break;
		        case ';': doType(bot, VK_SEMICOLON); break;
		        case ':': doType(bot, VK_COLON); break;
		        case '\'': doType(bot, VK_QUOTE); break;
		        case '"': doType(bot, VK_QUOTEDBL); break;
		        case ',': doType(bot, VK_COMMA); break;
		        case '<': doType(bot, VK_SHIFT, VK_COMMA); break;
		        case '.': doType(bot, VK_PERIOD); break;
		        case '>': doType(bot, VK_SHIFT, VK_PERIOD); break;
		        case '/': doType(bot, VK_SLASH); break;
		        case '?': doType(bot, VK_SHIFT, VK_SLASH); break;
		        case ' ': doType(bot, VK_SPACE); break;
		        default:
		            throw new IllegalArgumentException("Cannot type character " + text.charAt(i));
		        }
		}
    }

    private static void doType(Robot bot, int... keyCodes) {
        doType(keyCodes, 0, keyCodes.length, bot);
    }

    private static void doType(int[] keyCodes, int offset, int length, Robot bot) {
        if (length == 0) {
            return;
        }

        bot.keyPress(keyCodes[offset]);
        doType(keyCodes, offset + 1, length - 1, bot);
        bot.keyRelease(keyCodes[offset]);
    }
    
}
