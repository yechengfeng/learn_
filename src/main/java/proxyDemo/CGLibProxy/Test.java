package proxyDemo.CGLibProxy;

public class Test {

    public static void main(String[] args) throws ClassNotFoundException {
        QQSendMessage qqSendMessage =new QQSendMessage();

        QQSendMessage qqSendMessageProxy =  (QQSendMessage)  CGLibFactory.getProxy(qqSendMessage.getClass());
        qqSendMessageProxy.send("hello");

        /*获取类的clas文件的几种方式*/

        Class qQSendMessageClass = QQSendMessage.class;
        Class qQSendMessageClass1 = Class.forName("proxyDemo.CGLibProxy.QQSendMessage");
        Class qq  =qqSendMessage.getClass();
        Class clazz = ClassLoader.getSystemClassLoader().loadClass("proxyDemo.CGLibProxy.QQSendMessage");


    }


}
