package eamon.springcloud.order;

import com.alibaba.druid.proxy.jdbc.DataSourceProxyConfig;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.context.annotation.Import;

@EnableDiscoveryClient
@EnableFeignClients
//scanBasePackages设置很重要，需要扫描到base-framework-mysql-support中的包
//@SpringBootApplication(scanBasePackages = {"eamon.springcloud"}, exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@Import({DataSourceProxyConfig.class})
//@MapperScan("eamon.springcloud.order.mapper")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
