//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.
        Scanner scanner = new Scanner(System.in);
        int choice;
        do {
            System.out.println("+____________________________________________________________________+");
            System.out.println("|                        JUNDi DELIVERY                              |");
            System.out.println("+____________________________________________________________________+");
            System.out.println("| 1. Add Parcel.                                                     |");
            System.out.println("| 2. Track Parcel.                                                   |");
            System.out.println("| 3. Update Parcel Status.                                           |");
            System.out.println("| 4. View All Parcels.                                               |");
            System.out.println("| 0. Exit                                                            |");
            System.out.println("+____________________________________________________________________+");

            System.out.println("Enter your choice: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.println("Sender: ");
                    String sender = scanner.nextLine();
                    System.out.println("Receiver: ");
                    String receiver = scanner.nextLine();
                    System.out.println("Origin: ");
                    String origin = scanner.nextLine();
                    System.out.println("Destination: ");
                    String destination = scanner.nextLine();
                    System.out.println("Weight: ");
                    double weight = scanner.nextDouble();
                    System.out.println("Delivery Type (Standard/Express): ");
                    String type = scanner.nextLine();
                    System.out.println("Parcel added: "+ parcel_number);

                case 2:
                    System.out.println("Enter Parcel ID to Track: ");
                    String id = scanner.nextLine();

                case 3:
                    System.out.println("Enter Parcel ID to Update: ");
                    String id = scanner.nextLine();
                    System.out.println("Update the New Status: ");
                    String status = scanner.nextLine();

                case 4:
                    System.out.println("until make the method");

                case 0:
                    System.out.println("Exiting...");
                default:
                    System.out.println("Invalid Choice! (Please enter (1/ 2/ 3/ 4/ 0): ");



            }
        }while (choice != 0);
        scanner.close();

    }
}