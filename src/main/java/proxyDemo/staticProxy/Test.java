package proxyDemo.staticProxy;


import proxyDemo.SendMessage;
import proxyDemo.SendMessageImpl;

public class Test {
    public static void main(String[] args) {
        SendMessage sendMessage =new SendMessageProxy(new SendMessageImpl());
        sendMessage.doSendMessage("java");
    }
}
