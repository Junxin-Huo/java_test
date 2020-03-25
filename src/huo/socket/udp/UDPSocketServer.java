package huo.socket.udp;

import java.net.DatagramPacket;
import java.net.DatagramSocket;

/**
 * @author ：Junxin.Huo
 * @date ：Created in 2020/3/25 19:01
 * @description：
 * @modified By：
 * @version: $
 */
public class UDPSocketServer {
    public static void main(String[] args) throws Exception {
        //创建服务端socket对象 DategramSocket
        DatagramSocket server = new DatagramSocket(12321);

        //创建接收数据的数据包（数据接收的容器）
        byte[] bys = new byte[1024];
        DatagramPacket packet = new DatagramPacket(bys, bys.length);

        //接收数据
        System.out.println("receiving...");
        server.receive(packet);
        System.out.println("received...");

        //针对数据包进行解析
        String host =  packet.getAddress().getHostAddress();
        byte[] data = packet.getData();
        System.out.println("接受来自" + host + "信息:" + new String(data));

        //释放资源
        server.close();
    }
}
