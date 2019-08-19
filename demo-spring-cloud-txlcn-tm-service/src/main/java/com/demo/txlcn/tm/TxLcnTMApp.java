package com.demo.txlcn.tm;

import com.codingapi.txlcn.tm.config.EnableTransactionManagerServer;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableTransactionManagerServer
public class TxLcnTMApp {
    public static void main(String[] args) {
        SpringApplication.run(TxLcnTMApp.class, args);
    }

}
