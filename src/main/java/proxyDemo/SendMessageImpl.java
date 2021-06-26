package proxyDemo;

public class SendMessageImpl implements SendMessage {
    @Override
    public void doSendMessage(String message) {
        System.out.println("do send message:"+message);
    }
}
