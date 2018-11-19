import org.I0Itec.zkclient.ZkClient;
import org.junit.Before;
import org.junit.Test;

import java.io.IOException;

public class Testek {
    private ZkClient zkClient = null;
    @Before
    public void before(){
        zkClient = new ZkClient("192.168.163.128");
    }

    @Test
    public void  test() throws IOException {
        // 创建持久节点
        zkClient.createPersistent("/tencent",true);
        // 创建临时节点
        zkClient.createEphemeral("/zpark","bzjy");
        // 创建临时顺序节点
        String e1 = zkClient.createEphemeralSequential("/tencent/league-oflegends", "lol");
        String e2 = zkClient.createEphemeralSequential("/tencent/crossfire", "cf");
        System.out.println("创建的临时顺序节点e1： "+e1);
        System.out.println("创建的临时顺序节点e2： "+e2);

        System.in.read();
    }






}
