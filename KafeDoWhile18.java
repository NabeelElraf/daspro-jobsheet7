import java.util.Scanner;

public class KafeDoWhile18 {
    public static void main(String[] args) {
        
        int coffe , tea, breads;
        int coffePrice = 12000, teaPrice = 7000, breadPrice = 20000;
        String customerName;
        double totalPrice;

        Scanner sc = new Scanner(System.in);

        do {
            System.out.print("Enter customer name (type 'cancel' to exit): ");
            customerName = sc.nextLine();
        if (customerName.equalsIgnoreCase("cancel")) {
            System.out.println("Transaction canceled.");
        break;
        }
        System.out.print("Number if coffees: ");
        coffe = sc.nextInt();
        System.out.print("Number if tea: ");
        tea = sc.nextInt();
        System.out.print("Number if breads: ");
        breads = sc.nextInt();

        totalPrice = (coffe * coffePrice) + (tea*teaPrice) + (breads * breadPrice);
        System.out.println("Total to be paid: Rp " + totalPrice);
        sc.nextLine();

    } while (true); 
            System.out.println("All transactions completed.");
        }
        
    }

