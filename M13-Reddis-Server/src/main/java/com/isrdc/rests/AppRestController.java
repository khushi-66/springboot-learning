package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.entities.City;
import com.isrdc.repos.CitytRepo;

@RestController
public class AppRestController {
	@Autowired
	private CitytRepo repo;
	
	@GetMapping("/showall")
	public Iterable<City>  showAllCitites() {
		return repo.findAll();
	}
	
   @PostMapping("/save")
	public String saveCity(@RequestBody City city) {
	   repo.save(city);
		return "done....";
	}

}
