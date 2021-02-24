package dependencyinjection;

public class DependencyInjectionDemo {

    public static void main(String[] args) {
        String receiver = "dipak@gmail.com";
        String message = "Hi, Dipak";
        String cell = "988882222";
        MessageServiceInjector injector = null;
        Consumer app = null;

        //Emailing to receiver
        injector = new EmailServiceInjector();
        app = injector.getConsumer();
        app.processMessage(message,receiver);

        //Sms to receiver
        injector = new SmsServiceInjector();
        app = injector.getConsumer();
        app.processMessage(message,receiver);
    }
}
