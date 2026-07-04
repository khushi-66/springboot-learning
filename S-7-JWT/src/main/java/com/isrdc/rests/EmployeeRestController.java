package com.isrdc.rests;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.isrdc.entities.Employee;
import com.isrdc.jwts.JwtService;
import com.isrdc.services.EmployeeService;

@RestController
public class EmployeeRestController {
	
@Autowired
private EmployeeService ser;

@Autowired
private PasswordEncoder passenc;

@Autowired
private AuthenticationManager mngr;

@Autowired
private JwtService jwtserv;

@PostMapping("/signin")
	public ResponseEntity<String> signin(@RequestBody Employee em) {
		UsernamePasswordAuthenticationToken token=new UsernamePasswordAuthenticationToken(em.getEmail(),em.getPassword());
		org.springframework.security.core.Authentication auth=mngr.authenticate(token);
		if(auth.isAuthenticated()) {
			String jwtToken=jwtserv.generateToken(em.getEmail());
			return new ResponseEntity<>(jwtToken,HttpStatus.ACCEPTED);
		}
		return new ResponseEntity<>("signin failed...",HttpStatus.NOT_ACCEPTABLE);
	}

@PostMapping("/signup")
public ResponseEntity<String> signup(@RequestBody Employee em) {
	em.setPassword(passenc.encode(em.getPassword()));
	ser.saveEmployee(em);
	return new ResponseEntity<>("signup success...",HttpStatus.CREATED);
}

@GetMapping("/emp_txn")
public String empTxn() {
	return "emp_txn generated....";}

}
