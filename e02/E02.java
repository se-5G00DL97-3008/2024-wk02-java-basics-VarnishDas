import java.util.Scanner;

class E02 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Give a number: ");
        int num1 = scanner.nextInt();

        System.out.println("Give another number: ");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;
        int multiply = num1 * num2;
        int subtract = num1 - num2;
        int divide = num1 / num2;

        System.out.println(num1 + " + " + num2 + " = " + sum);
        System.out.println(num1 + " * " + num2 + " = " + multiply);
        System.out.println(num1 + " - " + num2 + " = " + subtract);
        System.out.println(num1 + " / " + num2 + " = " + divide);
    }
}