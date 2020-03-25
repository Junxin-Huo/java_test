package huo.socket.tcp;

import java.io.OutputStream;
import java.net.Socket;

/**
 * @author ：Junxin.Huo
 * @date ：Created in 2020/3/25 19:12
 * @description：
 * @modified By：
 * @version: $
 */
public class TCPSocketClient {
    public static void main(String[] args) throws Exception {
        //创建客户端的socket服务  Socket
        //在socket指定传输数据的目的的ip和端口
        Socket client = new Socket("127.0.0.1", 12321);

        //通过socket简历的通道传输数据
        //获得输出流，写数据
        OutputStream outputStream = client.getOutputStream();
        outputStream.write("hello, this is tcp".getBytes());

        //释放资源
        client.close();
    }
}
