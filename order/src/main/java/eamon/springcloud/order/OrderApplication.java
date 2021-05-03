package eamon.springcloud.order;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@EnableDiscoveryClient
@EnableFeignClients
//scanBasePackages设置很重要，需要扫描到base-framework-mysql-support中的包
//@SpringBootApplication(scanBasePackages = {"eamon.springcloud"}, exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
//@MapperScan("eamon.springcloud.order")
public class OrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(OrderApplication.class, args);
    }

}
