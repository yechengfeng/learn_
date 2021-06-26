package io.BIo;

import java.io.IOException;
import java.net.Socket;
import java.util.Random;

public class IOClient {
    public static void main(String[] args) {
        // TODO 创建多个线程，模拟多个客户端连接服务端
    Thread thread =    new Thread(new SocketRunnable());
    Thread thread1 =    new Thread(new SocketRunnable());
    Thread thread2 =    new Thread(new SocketRunnable());
        thread.start();
        thread1.start();
        thread2.start();
    }

    private static class SocketRunnable implements Runnable{
        @Override
        public void run() {
            try {
                Socket socket = new Socket("127.0.0.1", 3333);
                while (true) {
                    try {
                        socket.getOutputStream().write((Thread.currentThread().getName()+":send message...").getBytes());
                        Thread.sleep(new Random().nextInt(3)*1000);
                    } catch (Exception e) {
                    }
                }

            } catch (IOException e) {
            }
        }
    }
}
