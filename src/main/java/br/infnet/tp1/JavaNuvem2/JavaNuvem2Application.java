package br.infnet.tp1.JavaNuvem2;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class JavaNuvem2Application {

	public static void main(String[] args) {
		SpringApplication.run(JavaNuvem2Application.class, args);
	}
        
        @Bean
        public CommandLineRunner run (CnpjCliente client){
            return args -> {
                if(args.length > 0){
                    String cnpj;
                    cnpj = "30545770000180";
                    System.out.println("Cnpj = " + cnpj);
                    Cnpj cnpjClient = client.buscaCnpj(cnpj);
                    
                    System.out.println(cnpjClient);
                }
            };
        }
}
