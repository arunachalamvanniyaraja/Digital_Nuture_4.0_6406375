import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter notification type (EMAIL/SMS/PUSH): ");
        String type = sc.nextLine();

        NotificationFactory factory = new NotificationFactory();
        Notification notification = factory.createNotification(type);

        if (notification != null) {
            notification.notifyUser();
        } else {
            System.out.println("Invalid notification type.");
        }

        sc.close();
    }
}