package com.isrdc.rests;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import com.isrdc.dtos.Userdto;

@RestController
public class ActionController {

@GetMapping(value="/view")
public Userdto showUser(){
	Userdto u=new Userdto("pravjeet",34,"prabhu@gmail.com","2394809385");
	return u;
}
@GetMapping(value="/show",produces=MediaType.APPLICATION_JSON_VALUE)
public ResponseEntity<Userdto> viewUser(){
	
	Userdto u=new Userdto("jaykumar",31,"jay@gmail.com","834754744");
	return new ResponseEntity<Userdto>(u,HttpStatus.ACCEPTED);
}

@GetMapping("/showAll")
private ResponseEntity<List<Userdto>> showAllUsers() {
	Userdto u=new Userdto("vaibhavsuryabanshi",14,"vaibhav@gmail.com","8347545444");
	Userdto u1=new Userdto("virat kohli",17,"virat@gmail.com","8347545944");
	Userdto u2=new Userdto("rohit sharma",24,"rohit@gmail.com","3478345444");
	Userdto u3=new Userdto("hardik pandya",33,"hardik@gmail.com","8347545894");
	ArrayList<Userdto>list=new ArrayList<>();
	
	list.add(u);
	list.add(u1);
	list.add(u2);
	list.add(u3);
	
	return new ResponseEntity<>(list,HttpStatus.OK);
}


@GetMapping("/viewAll")
private List<Userdto> viewAllUsers() {
	Userdto u=new Userdto("vaibhavsuryabanshi",14,"vaibhav@gmail.com","8347545444");
	Userdto u1=new Userdto("virat kohli",17,"virat@gmail.com","8347545944");
	Userdto u2=new Userdto("rohit sharma",24,"rohit@gmail.com","3478345444");
	Userdto u3=new Userdto("hardik pandya",33,"hardik@gmail.com","8347545894");
	Userdto u4=new Userdto("rinku pandya",33,"rinku@gmail.com","8347545894");
//	ArrayList<Userdto>list=new ArrayList<>();
//	
//	list.add(u);
//	list.add(u1);
//	list.add(u2);
//	list.add(u3);
//	
	
	List<Userdto>list=Arrays.asList(u,u1,u2,u3,u4);
	
	
	
	return list;
}
}
