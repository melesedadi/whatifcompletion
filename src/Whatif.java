import java.util.Scanner;

public class Whatif {
    public static void main(String[]args) {
        int num1;
        int num2;
        Scanner keyboard = new Scanner(System.in);

        System.out.print("First number? : ");
        num1 = keyboard.nextInt();

        System.out.print("Second number? : ");
        num2 = keyboard.nextInt();

        if (num1+num2 > 1000) {
            System.out.println("Sum of the two numbers is " + (num1+num2) + "~");
        } else if (num1+num2 > 200) {
            System.out.println("sum of the two numbers is " + (num1+num2)+ "*");
        } else {
            System.out.println("sum of th two numbers is " + (num1+num2));}

        System.out.println();
        if (num1*num2 > 1000) {
            System.out.println("Product of the two numbers is " + num1*num2+ "~");
        } else if (num1*num2 > 200) {
            System.out.println("Product of the two numbers is" + num1*num2 + "*");
        } else {
            System.out.println("Product of th two numbers is " + num1*num2);}

        System.out.println();
        if ((num1+num2)/2 > 1000) {
            System.out.println("Mean of the two numbers is " + (num1+num2)/2+ "~");
        } else if ((num1+num2)/2 > 200) {
            System.out.println("Mean of the two numbers is " + (num1+num2)/2 + "*");
        } else {
            System.out.println("Mean of the two numbers is " + (num1+num2)/2);
            }
        }
    }



