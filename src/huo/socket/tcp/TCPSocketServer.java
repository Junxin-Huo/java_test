package huo.socket.tcp;

import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * @author ：Junxin.Huo
 * @date ：Created in 2020/3/25 19:17
 * @description：
 * @modified By：
 * @version: $
 */
public class TCPSocketServer {
    public static void main(String[] args) throws Exception {
        //建立服务端socket服务ServerSocket，并且监听本地的一个端口
        ServerSocket server = new ServerSocket(12321);

        //监听链接 阻塞方法   有请求火来，建立连接  返回与之对应的socket来通信
        System.out.println("receiving...");
        Socket s = server.accept();
        System.out.println("received...");

        //获取输出流，读取数据
        InputStream inputStream = s.getInputStream();
        byte[] bys = new byte[1024];
        int len = inputStream.read(bys);
        System.out.println(new String(bys, 0, len));

        //释放资源
        s.close();
        server.close();
    }
}
