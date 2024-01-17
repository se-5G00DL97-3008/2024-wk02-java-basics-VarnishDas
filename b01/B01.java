import java.util.Scanner;

class B01 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the starting count of bottles: ");
        int bottles = scanner.nextInt();
        int ogBottles = bottles;

        while (bottles > 0) {
            System.out.println(bottles + " bottles of beer on the wall, " + bottles + " bottles of beer.");
            bottles--;

            if (bottles == 0) {
                System.out.println("No more bottles of beer on the wall, no more bottles of beer.");
                System.out.println("Go to the store and buy some more, " + ogBottles + " bottles of beer on the wall.");
            }
            else {
                System.out.println("Take one down and pass it around, " + bottles + " bottles of beer on the wall.");
            }
        }



        scanner.close();
    }
}