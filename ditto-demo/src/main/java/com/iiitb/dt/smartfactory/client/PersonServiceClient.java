/**
 * 
 */
package com.iiitb.dt.smartfactory.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Ravi Shankar
 *
 */
@FeignClient(name = "person-service", url = "localhost:9999/person")
public interface PersonServiceClient {
	@RequestMapping(value = "", method = RequestMethod.GET)
	public String checkService();
	@RequestMapping(value = "get", method = RequestMethod.GET)
	public List<Object> getAllPersons();
}

record Person(String fName, String lName) {}
