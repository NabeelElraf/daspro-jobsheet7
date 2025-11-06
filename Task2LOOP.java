import java.util.Scanner;

public class Task2LOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int customers, hours;
    String vehicle;
    double fee, total = 0;

    System.out.print("Enter number of customers: ");
    customers = sc.nextInt();
    sc.nextLine();

    for (int i = 1; i <= customers; i++) {

        System.out.print("Enter vehicle type for customer " + i + " (car/motor): ");
        vehicle = sc.nextLine();

        while (vehicle.equalsIgnoreCase("car") && vehicle.equalsIgnoreCase("motor")) {
            System.out.println("Invalid vehicle type. Re-enter.");
            System.out.print("Enter vehicle type for customer " + i + ": ");
            vehicle = sc.nextLine();
        }

        System.out.print("Enter parking duration (hours): ");
        hours = sc.nextInt();
        sc.nextLine();

        while (hours < 0) {
            System.out.println("Invalid hours. Re-enter.");
            System.out.print("Enter parking duration (hours): ");
            hours = sc.nextInt();
            sc.nextLine();
        }

        fee = 0;

        if (hours > 5) {
            fee = 12500;
        } else if (vehicle.equalsIgnoreCase("car")) {
            fee = hours * 3000;
        } else if (vehicle.equalsIgnoreCase("motor")) {
            fee = hours * 2000;
        }

        System.out.println("Parking fee: Rp " + fee);
        total += fee;}

    System.out.println("Total parking income: Rp " + total);
}
}
