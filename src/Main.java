import collections.CollectionsFrameWork;
import input.InputMethods;

import java.io.IOException;
import java.util.Scanner;


public class Main {

    public static void run() throws IOException {

            System.out.println("Practising basics of java");

            Scanner scanner = new Scanner(System.in);
            int choice;

            do {
                System.out.println("Please enter your choice:");
                System.out.println("1. Show input examples");
                System.out.println("2. Show formatted outputs");
                System.out.println("3. Show decimal formats");
                System.out.println("4. Show date format");
                System.out.println("5. Show ArrayList usage");
                System.out.println("6. Show LinkedList usage");
                System.out.println("7. Show Vector usage");
                System.out.println("8. Show Stack usage");
                System.out.println("9. Show Queue usage");
                System.out.println("10. Show Deque usage");
                System.out.println("11. Show Set usage");
                System.out.println("0. Exit");

                choice = scanner.nextInt();

                switch (choice) {
                    case 1:
                        InputMethods.showExamples();
                        break;
                    case 2:
                        InputMethods.showFormattedOutputs();
                        break;
                    case 3:
                        InputMethods.showDecimalFormats();
                        break;
                    case 4:
                        InputMethods.showDateFormat();
                        break;
                    case 5:
                        CollectionsFrameWork.ArrayListUsage();
                        break;
                    case 6:
                        CollectionsFrameWork.LinkedListUsage();
                        break;
                    case 7:
                        CollectionsFrameWork.VectorUsage();
                        break;
                    case 8:
                        CollectionsFrameWork.StackUsage();
                        break;
                    case 9:
                        CollectionsFrameWork.QueueUsage();
                        break;
                    case 10:
                        CollectionsFrameWork.DequeUsage();
                        break;
                    case 11:
                        CollectionsFrameWork.SetUsage();
                        break;
                    case 0:
                        System.out.println("Exiting program...");
                        break;
                    default:
                        System.out.println("Invalid choice. Please try again.");
                        break;
                }
            } while (choice != 0);
        }
    public static void main(String[] args) throws IOException {
        System.out.println("Practising basics of java");
        run();

    }

}