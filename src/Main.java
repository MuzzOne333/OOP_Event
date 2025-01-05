import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        Organizer organizer = new Organizer("John Doe", "123-456-789");
        SpecialEvent event = new SpecialEvent("Tech Conference", "2025-01-15", "Main Hall", organizer);


        while (true) {
            System.out.println("\nMenu:");
            System.out.println("1. Add Participant");
            System.out.println("2. View Event Details");
            System.out.println("3. Exit");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:

                    System.out.print("Enter Participant Name: ");
                    String participantName = scanner.nextLine();
                    System.out.print("Enter Participant Mail: ");
                    String participantMail = scanner.nextLine();
                    System.out.print("Enter Participant Age: ");
                    int participantAge = scanner.nextInt();
                    scanner.nextLine();

                    Participant participant = new Participant(participantName, participantMail, participantAge);
                    event.addParticipant(participant);
                    System.out.println("Participant added successfully!");
                    break;
                case 2:

                    event.displayEventDetails();
                    break;
                case 3:

                    System.out.println("Exiting...");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice! Try again.");
            }
        }
    }
}
