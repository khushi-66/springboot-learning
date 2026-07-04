package com.isrdc.rests;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.entities.State;
import com.isrdc.repos.StateRepo;

@RestController
public class AppRestController {
@Autowired
private StateRepo repo;
	@PostMapping("/save")
	public String saveState(@RequestBody State state) {
		repo.save(state);
		
		return "saved ....";
	}
	
	@GetMapping("show")
	public Iterable<State> showAllState(){
		return repo.findAll();
	}
	

}
