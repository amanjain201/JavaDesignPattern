package dependencyinjection;

public class SmsServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new DependencyInjectorApplication(new SmsServiceImpl());
    }
}
