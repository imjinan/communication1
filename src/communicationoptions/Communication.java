package communicationoptions;

public interface Communication {
        public default void sendCommunication(String message){
            System.out.println("we have sent you an "+message);
        }
    }

