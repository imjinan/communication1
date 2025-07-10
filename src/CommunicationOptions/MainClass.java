package CommunicationOptions;

public class MainClass {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("enter valid input");
            return;
        }
        String input=args[0];
        Communication c1;
        switch (input.toLowerCase()) {
            case "sms":
                c1 = new TextMessage();
                break;
            case "email":
                c1 = new Email();
                break;
            case "push":
                c1 = new PushNotification();
                break;
            default:
                System.out.println("Sorry invalid type");
                return;

        }

        c1.sendCommunication(input);
    }
}
