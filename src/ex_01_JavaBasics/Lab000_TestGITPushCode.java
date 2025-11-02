package ex_01_JavaBasics;
import java.util.Scanner;
public class Lab000_TestGITPushCode {
    public static void main(String[] args) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter Username");
        System.out.println("Enter age");
        System.out.println("Enter marks");
        String userName = obj.nextLine();
        System.out.println("Username is " + userName);

        int age = obj.nextInt();
        System.out.println("Age is" + age);

        float marks = obj.nextFloat();
        System.out.println("Marks are " + marks);
    }
}
