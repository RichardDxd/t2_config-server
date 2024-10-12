package pe.edu.cibertec.t2_config_server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer
@SpringBootApplication
public class T2ConfigServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(T2ConfigServerApplication.class, args);
	}

}