import java.util.Scanner;

public class Task1LOOP {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

    int price = 50000, totalTickets = 0, customer ,quantity;
    double totalSales = 0, discount, cost;

    System.out.print("Enter number of customers: ");
    customer = sc.nextInt();

    for (int i = 1; i <= customer; i++) {

        while (true) {
            System.out.print("Enter tickets for customer " + i + ": ");
            quantity = sc.nextInt();

            if (quantity >= 0) {
                break;
            }

            System.out.println("Invalid input. Please re-enter.");
        }

        discount = 0;

        if (quantity > 10) {
            discount = 0.15;
        } else if (quantity > 4) {
            discount = 0.10;
        }

        cost = quantity * price;
        cost = cost - (cost * discount);

        totalTickets += quantity;
        totalSales += cost;
    }

    System.out.println("Total tickets sold today: " + totalTickets);
    System.out.println("Total sales today: Rp " + totalSales);
}
}








    
