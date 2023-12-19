package org.sid.customerservice;

import org.sid.customerservice.entities.Customer;
import org.sid.customerservice.repo.CustomerRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.context.annotation.Bean;

import java.util.List;

@SpringBootApplication
public class CustomerServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(CustomerServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner start(CustomerRepository customerRepository){
        return args -> {

            customerRepository.saveAll(List.of(
                    Customer.builder().name("Abrak").email("abrak@gmail.com").build(),
                    Customer.builder().name("Tahri").email("ot@gmail.com").build(),
                    Customer.builder().name("Nawfal").email("elloussi@gmail.com").build()

            ));

            customerRepository.findAll().forEach(System.out::println);
        };


    }

}
