import java.util.Scanner;

public class IO {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); // System.in to let it know that we will be taking input from console/terminal 
        System.out.print("Enter your name : ");

        // nextLine method is used to take string input from terminal
        String name = sc.nextLine();

        // System.out.println(String.format("My name is %s", name));
        System.out.printf("Hello %s. How old are you? ", name); // we can use printf directly as it supports format string, so that we dont have to use format method

        // nextInt method is used to take int values from terminal
        int age = sc.nextInt();
        System.out.printf("I am %d years old", age);

        // similarly we have methods for double called nextDouble and for float called nextFloat etc.

        sc.close();
    }
}

// in java the nextLine function takes the string we enter along with the enter button (or carriage return). 
// but the nextint function only considers the value that the user enters. It ignores the carriage return.
// so if there a nextLine after that, this nextLine will consider the carriage return left above as user input, so the user will not able to enter the value.
// 2 ways to counter this 
// 1. add empty nextLine after every nextInt to consume that carriage return
// 2. use Integer.parseInt(scanner.nextLine()) -- this is better 
