/**
 * 
 */
package com.iiitb.dt.smartfactory.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiitb.dt.smartfactory.client.PersonServiceClient;

/**
 * @author Ravi Shankar
 *
 */
@RestController
@RequestMapping("user")
public class UserController {

	private PersonServiceClient personServiceClient;

	public UserController(PersonServiceClient personServiceClient) {
		this.personServiceClient = personServiceClient;
	}

	@GetMapping
	@RequestMapping("")
	public String check() {
		return personServiceClient.checkService();
	}

	@GetMapping
	@RequestMapping("list")
	public List<Object> getUsers() {
		return personServiceClient.getAllPersons();
	}
}
