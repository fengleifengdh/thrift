package top.fengleifeng;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import top.fengleifeng.component.RPCThriftServer;

@SpringBootApplication
public class ThriftServerApplication {
    private static RPCThriftServer rpcThriftServer;

    public static void main(String[] args) {
        ApplicationContext applicationContext = SpringApplication.run(ThriftServerApplication.class, args);

        try {
            rpcThriftServer = applicationContext.getBean(RPCThriftServer.class);
            rpcThriftServer.start();
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
