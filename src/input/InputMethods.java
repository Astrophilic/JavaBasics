package input;



import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Scanner;

public class InputMethods {
    private BufferedReader reader;
    private Scanner scanner;


    public InputMethods() {
        reader = new BufferedReader(new InputStreamReader(System.in));
        scanner = new Scanner(System.in);
    }

    public static void showExamples() throws IOException {

        int ch;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your choice");
        System.out.println("1. show buffered Reader Example");
        System.out.println("2. show scanner example");


        ch = sc.nextInt();

        switch (ch) {
            case 1:
                showReaderExample();
                break;
            case 2:
                showScannerExample();
                break;
            default:
                System.out.println("wrong selection");

        }
    }



    public BufferedReader getReader() {
        return reader;
    }

    public Scanner getScanner() {
        return scanner;
    }

    public static void showReaderExample() throws IOException {
        InputMethods inputMethods = new InputMethods();

        BufferedReader reader = inputMethods.getReader();

        ArrayList<String> strList = new ArrayList<>();
        System.out.println("Input two lines of String with each line having at least one comma eg hello,world");
        for (int i = 0; i < 2; i++) {
            String s = reader.readLine();
            strList.add(s);
        }
        System.out.println("printing elements of the Array List by splitting it with ;");

        for (String s : strList
        ) {
            String[] strings = s.split(",");
            for (String st : strings) {
                System.out.println(st);
            }
        }

    }

    public static void showScannerExample(){
        InputMethods inputMethods = new InputMethods();
        Scanner scanner1 = inputMethods.getScanner();

        System.out.println("Enter a integer");
        int a = scanner1.nextInt();
        scanner1.nextLine(); // flush the newline
        System.out.println("The input integer is "+a);

        System.out.println("Enter a line");
        String line = scanner1.nextLine();
        System.out.println("The input line is "+line);

    }

    public static void showFormattedOutputs(){
        int x=10;
        System.out.printf("printing integer x = %d",x);

        float f= 1.23456F;

        System.out.printf("printing float variable upto 2 precision digits f=%.2f",f);

    }
}

