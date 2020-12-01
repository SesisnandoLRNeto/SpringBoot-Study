package com.nando.Testes.video.aulas.resources;



import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.nando.Testes.video.aulas.domain.Category;
import com.nando.Testes.video.aulas.services.CategoryService;

@RestController
@RequestMapping(value="/categories")
public class CategoryResource {
	
	@Autowired
	private CategoryService categoryService;
	
	@RequestMapping(value="/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> findCategory(@PathVariable Integer id) {
		
		Category category = categoryService.findCategory(id);
		
		return ResponseEntity.ok().body(category);
	}

//	@RequestMapping(method = RequestMethod.GET)
//	public List<Category> list() {
//		
//		Category cat1 = new Category(1, "Informatic");
//		Category cat2 = new Category(2, "Office");
//		
//		List<Category> listCategories = new ArrayList<>();
//		
//		listCategories.add(cat1);
//		listCategories.add(cat2);
//		
//		return listCategories;
//	}

}