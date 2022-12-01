/**
 * 
 */
package com.iiitb.demo.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Ravi Shankar
 *
 */
@RestController
@RequestMapping("person")
public class PersonController {

	@GetMapping
	@RequestMapping("")
	public String checkService() {
		return "Person Controller is up and running!!!";
	}

	@GetMapping
	@RequestMapping("/get")
	public List<Person> getPersons() {
		List<Person> personsList = new ArrayList<>();
		personsList.add(new Person("Test", "One"));
		personsList.add(new Person("Test", "Two"));
		personsList.add(new Person("Test", "Three"));
		personsList.add(new Person("Test", "Four"));
		return personsList;
	}

}

record Person(String fName, String lName) {
}
