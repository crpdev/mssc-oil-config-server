package com.crpdev.mssc.oil.config.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class MsscOilConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsscOilConfigServerApplication.class, args);
	}

}
