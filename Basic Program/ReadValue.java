
// Java program to take an integer
// as input and print it
import java.io.*;
import java.util.Scanner;

public class ReadValue {
    public static void main(String[] args) {
        int num;
        System.out.println("Enter the value to read:");
        Scanner sc = new Scanner(System.in);
        num = sc.nextInt();
        System.err.println("the number is" + num);

    }
}
