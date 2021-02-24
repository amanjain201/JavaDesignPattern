package dependencyinjection;

public class DependencyInjectorApplication implements Consumer {
    private MessageService messageService;

    public DependencyInjectorApplication(MessageService messageService) {
        this.messageService = messageService;
    }

    @Override
    public void processMessage(String message, String receiver) {
        this.messageService.sendMessage(message, receiver);
    }
}
