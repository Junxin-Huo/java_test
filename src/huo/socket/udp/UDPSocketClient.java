package huo.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

/**
 * @author ：Junxin.Huo
 * @date ：Created in 2020/3/25 15:40
 * @description：UDP test
 * @modified By：
 * @version: 0.1$
 */
public class UDPSocketClient {
    public static void main(String[] args) throws Exception {
        //创建发送端的socket对象 DatagramSocket
        DatagramSocket client = new DatagramSocket();

        //把发送的数据打包
        String message = "hello hdp?";
        InetAddress address = InetAddress.getLocalHost();
        int port = 12321;
        DatagramPacket packet = new DatagramPacket(message.getBytes(), message.getBytes().length, address, port);

        //发送打包好的数据
        client.send(packet);

        //资源释放
        client.close();
    }
}
