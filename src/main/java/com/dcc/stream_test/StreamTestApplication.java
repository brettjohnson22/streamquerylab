package com.dcc.stream_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.dcc.stream_test.repository.ProductsRepository;
import com.dcc.stream_test.repository.RepositoryWrapper;

@SpringBootApplication
public class StreamTestApplication {
//	@Bean
//	public RepositoryWrapper repositoryWrapper() {
//		return new RepositoryWrapper();
//	}
//	


	public static void main(String[] args) {
		SpringApplication.run(StreamTestApplication.class, args);
	}

}
