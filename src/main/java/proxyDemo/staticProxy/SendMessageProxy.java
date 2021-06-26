package proxyDemo.staticProxy;


import proxyDemo.SendMessage;

public class SendMessageProxy implements SendMessage {

     private final SendMessage sendMessage;
    public SendMessageProxy(SendMessage sendMessage) {
        this.sendMessage = sendMessage;
    }



    @Override
    public void doSendMessage(String message) {
        System.out.println("send message before!");
        sendMessage.doSendMessage(message);
        System.out.println("send message after!");
    }
}
