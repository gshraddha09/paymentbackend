package com.dbs.web.rest;

import javax.persistence.EntityNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.dbs.web.beans.Customeruser;
import com.dbs.web.service.LoginService;

@RestController
@CrossOrigin(origins = "http://localhost:4200")

public class LoginRestController {
	@Autowired
	LoginService service;

	@GetMapping("/login")
	public ResponseEntity<Customeruser> login(@PathVariable int un, @PathVariable String pass) {
		try {

			Customeruser cu = this.service.getAllBycustomerId(un);
			if (cu.getUserid() == un && cu.getUserpassword().equals(pass)) {
				return ResponseEntity.status(HttpStatus.OK).body(cu);
			}

			else {
				return ResponseEntity.status(HttpStatus.OK).body(null);

			}
		} catch (EntityNotFoundException e) {
			return ResponseEntity.status(HttpStatus.FORBIDDEN).body(null);
		}
	}

}