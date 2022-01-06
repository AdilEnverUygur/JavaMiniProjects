package com.familyIncomeAndExpensesSoftware;
import java.util.Scanner;
/**
Utility Tools：ࣺ
Encapsulating different functions into methods means that you can use its functions directly by calling the method without considering the specific function implementation details.
*/
public class Utility {
    private static Scanner scanner = new Scanner(System.in);
    /**
	Used for the selection of the menu. This method reads the keyboard, and if the user types any character from ‘1’ to ‘4’, the method returns. The return value is the character typed by the user.
	*/
	public static char readMenuSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1);
            c = str.charAt(0);
            if (c != '1' && c != '2' && c != '3' && c != '4') {
                System.out.print("Selection error, please re-enter");
            } else break;
        }
        return c;
    }
	/**
	Used for the input of income and expenditure amounts. This method reads an integer of no more than 4 digits from the keyboard and uses it as the return value of the method.
	*/
    public static int readNumber() {
        int n;
        for (; ; ) {
            String str = readKeyBoard(4);
            try {
                n = Integer.parseInt(str);
                break;
            } catch (NumberFormatException e) {
                System.out.print("Number input error, please re-enter");
            }
        }
        return n;
    }
	/**
	Used for input of income and expenditure descriptions. This method reads a string of no more than 8 bits from the keyboard and uses it as the return value of the method.
	*/
    public static String readString() {
        String str = readKeyBoard(8);
        return str;
    }
	
	/**
	Used to confirm the selected input. This method reads ‘Y’ or ‘N’ from the keyboard and uses it as the return value of the method.
	*/
    public static char readConfirmSelection() {
        char c;
        for (; ; ) {
            String str = readKeyBoard(1).toUpperCase();
            c = str.charAt(0);
            if (c == 'Y' || c == 'N') {
                break;
            } else {
                System.out.print("Selection error, please re-enter");
            }
        }
        return c;
    }
	
	
    private static String readKeyBoard(int limit) {
        String line = "";

        while (scanner.hasNext()) {
            line = scanner.nextLine();
            if (line.length() < 1 || line.length() > limit) {
                System.out.print("Input length (not greater than" + limit + ")Error, please re-enter: ");
                continue;
            }
            break;
        }

        return line;
    }
}
