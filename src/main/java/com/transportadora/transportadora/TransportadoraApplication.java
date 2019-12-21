package com.transportadora.transportadora;

import com.transportadora.transportadora.domain.Transporter;
import com.transportadora.transportadora.repositories.TransporterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class TransportadoraApplication implements CommandLineRunner {

    @Autowired
    private TransporterRepository transporterRepository;

    public static void main(String[] args) {
        SpringApplication.run(TransportadoraApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {

        Transporter trp1 = new Transporter(null, "transportadora1@gmail.com", "Nike", "Nike", "8199999999", "Rodoviário", "13", "13", "13","Recife", "PE");
        transporterRepository.save(trp1);

        Transporter trp2 = new Transporter(null, "transportadora2@gmail.com", "Adidas", "Adidas", "8199999999", "Aéreo", "13", "13", "13","São Paulo", "SP");
        transporterRepository.save(trp2);

        Transporter trp3 = new Transporter(null, "transportadora3@gmail.com", "Xuxa", "Xuxa", "8199999999", "Aquaviário", "13", "13", "13","Rio de Janeiro", "RJ");
        transporterRepository.save(trp3);

    }
}
