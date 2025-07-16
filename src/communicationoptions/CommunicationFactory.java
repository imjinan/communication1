package communicationoptions;

public class CommunicationFactory {
    public Communication getCommunication(String input) {
if(input==null)
    return null;
        switch (input.toLowerCase()) {
            case "sms":
                return new TextMessage();

            case "email":
                return new Email();

            case "push":
                return new PushNotification();

            default:
                return null;
        }
    }
}
