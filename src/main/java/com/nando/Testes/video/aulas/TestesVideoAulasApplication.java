package com.nando.Testes.video.aulas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nando.Testes.video.aulas.domain.Category;
import com.nando.Testes.video.aulas.repositories.CategoryRepository;

@SpringBootApplication
public class TestesVideoAulasApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TestesVideoAulasApplication.class, args);
	}
	
	public void run(String...args) throws Exception {

		Category cat1 = new Category(null, "Information System");
		
		categoryRepository.saveAll(Arrays.asList(cat1));
	}

}
