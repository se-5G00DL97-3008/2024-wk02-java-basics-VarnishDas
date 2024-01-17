import java.util.Scanner;

class E06 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("0AWhich multiplication table to show?");
        int num = scanner.nextInt();

        for (int i = 0; i <= 10; i++) {
            System.out.println(i + " x " + num + " = " + num * i);
        }

        scanner.close();
    }
}