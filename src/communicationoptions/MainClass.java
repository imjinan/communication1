package communicationoptions;

public class MainClass {
    public static void main(String[] args) {
        if(args.length==0){
            System.out.println("enter valid input");
            return;
        }
        String input=args[0];
        CommunicationFactory cf = new CommunicationFactory();
        Communication comm = cf.getCommunication(input);
        if(comm!=null) {
            comm.sendCommunication(input);
        }
        else{
            System.out.println("only sms, push and email");
        }

    }
}
