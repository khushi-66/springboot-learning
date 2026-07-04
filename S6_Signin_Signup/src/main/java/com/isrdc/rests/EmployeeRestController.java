package com.isrdc.rests;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.entities.Employee;
import com.isrdc.services.EmployeeService;

@RestController
public class EmployeeRestController {
	@Autowired
	private EmployeeService serv;
	@Autowired
	private PasswordEncoder passEncoder;
	@Autowired
	private AuthenticationManager authmgr;
    @PostMapping("/signup")
	public ResponseEntity<String> signupUser( @RequestBody Employee em) {
    	  String encodedPassword=  passEncoder.encode(em.getPassword());
    	  em.setPassword(encodedPassword);
    	     serv.saveEmployee(em);
		return new ResponseEntity<>("Congratualations !!! signup Success...",HttpStatus.CREATED);
	}
    
    
    @PostMapping("/signin")
    public ResponseEntity<String>signinUser(@RequestBody Employee em){
    	UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(em.getEmail(),em.getPassword());
    	
    	authmgr.authenticate(token);
    	     
    	return new ResponseEntity<>("signin success ............",HttpStatus.CREATED);
    }

}
