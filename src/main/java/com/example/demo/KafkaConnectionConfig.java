package com.example.demo;

//import org.apache.zookeeper.ZooKeeper;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class KafkaConnectionConfig {


//    @Bean
    public String kafkaBrokerIp() throws Exception{
//        ZooKeeper zk = new ZooKeeper("192.168.1.249:2181", 10000, null);
//        List<String> ids = zk.getChildren("/brokers/ids", false);
//        String id = ids.get(0);
//        String brokerInfo = new String(zk.getData("/brokers/ids/" + id, false, null));
//        System.out.println("(((((((" + brokerInfo );
        return "";
    }
}
