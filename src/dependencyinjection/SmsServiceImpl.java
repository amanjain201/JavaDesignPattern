package dependencyinjection;

public class SmsServiceImpl implements MessageService {
    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("SMS sent to " + receiver + " with Message = " + message);
    }
}
