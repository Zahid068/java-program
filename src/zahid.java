import java.util.Scanner;
class zahid{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number and select operator +,-,*,/ ");
        double num1 = sc.nextDouble();

        // System.out.println("Enter operator +,-,*,/ ");
        char operation = sc.next().charAt(0);
        //System.out.println("Enter Second Number");
        double num2 = sc.nextDouble();
        double result = 0;
        if (operation == '+') {
            result = num1 + num2;
            System.out.println(num1 + " " + operation + " " + num2 + " " + " = " + result);
        }
        else if (operation == '-') {
            result = num1 - num2;
            System.out.println(num1 + " " + operation + " " + num2 + " " + " = " + result);
        } else if (operation == '*') {
            result = num1 * num2;
            System.out.println(num1 + " " + operation + " " + num2 + " " + " = " + result);
        } else if (operation == '/') {
            result = num1 / num2;
            System.out.println(num1 + " " + operation + " " + num2 + " " + " = " + result);
        } else {

            System.out.println("Invalid choice");

        }
        char heart = '\u2764';
        System.out.println("Thanks For Using My Tool " + heart);
        sc.close();

    }
}