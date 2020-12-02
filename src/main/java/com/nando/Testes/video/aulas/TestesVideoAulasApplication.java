package com.nando.Testes.video.aulas;

import java.util.Arrays;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.nando.Testes.video.aulas.domain.Category;
import com.nando.Testes.video.aulas.domain.Product;
import com.nando.Testes.video.aulas.repositories.CategoryRepository;
import com.nando.Testes.video.aulas.repositories.ProductRepository;

@SpringBootApplication
public class TestesVideoAulasApplication implements CommandLineRunner {
	
	@Autowired
	private CategoryRepository categoryRepository;
	@Autowired
	private ProductRepository productRepository;
	
	public static void main(String[] args) {
		SpringApplication.run(TestesVideoAulasApplication.class, args);
	}
	
	public void run(String...args) throws Exception {
		
		//dados inseridos no inicio da aplicação
//		Category cat1 = new Category(null, "Information");
//		Category cat2 = new Category(null, "Office");
//
//		Product p1 = new Product(null, "PC", 2000.00);
//		Product p2 = new Product(null, "Printer", 800.00);
//		Product p3 = new Product(null, "Mouse", 80.00);
//
//		cat1.getProducts().addAll(Arrays.asList(p1, p2, p3));
//		cat2.getProducts().addAll(Arrays.asList(p2));
//
//		p1.getCategories().addAll(Arrays.asList(cat1));
//		p2.getCategories().addAll(Arrays.asList(cat1, cat2));
//		p3.getCategories().addAll(Arrays.asList(cat1));
//		
//		categoryRepository.saveAll(Arrays.asList(cat1));
//		productRepository.saveAll(Arrays.asList(p1, p2, p3));
	}

}
