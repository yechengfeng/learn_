package proxyDemo.jdkProxy;


import proxyDemo.SendMessage;
import proxyDemo.SendMessageImpl;

public class Test {
    public static void main(String[] args) {
     SendMessage sendMessage =(SendMessage) JDKProxyFactory.getProxy(new SendMessageImpl());
     sendMessage.doSendMessage("hello world!");
    }
}
