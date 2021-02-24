package dependencyinjection;

public class EmailServiceInjector implements MessageServiceInjector {
    @Override
    public Consumer getConsumer() {
        return new DependencyInjectorApplication(new EmailServiceImpl());
    }
}
