package bookcase.util;

import java.util.Scanner;

public class ScannerUtil {
    public static String getInputString(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInputInteger(){
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static double getInputDouble(){
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }

    public static char getInputChar(){
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }

    public static String getInputStringS(String s){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine();
    }

    public static int getInputIntegerS(String s){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return Integer.parseInt(scanner.nextLine());
    }

    public static double getInputDoubleS(String s){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return Double.parseDouble(scanner.nextLine());
    }

    public static char getInputCharS(String s){
        System.out.print(s);
        Scanner scanner = new Scanner(System.in);
        return scanner.nextLine().charAt(0);
    }
}
