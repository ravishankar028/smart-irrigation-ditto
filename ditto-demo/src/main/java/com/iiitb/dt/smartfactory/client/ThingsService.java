/**
 * 
 */
package com.iiitb.dt.smartfactory.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import com.iiitb.dt.smartfactory.configuration.DittoConfiguration;
import com.iiitb.dt.smartfactory.model.DittoThing;
import com.iiitb.dt.smartfactory.model.SensorFeature;

/**
 * @author Ravi Shankar
 *
 */
@FeignClient(name = "things-service", url = "localhost:8080/api/2/things", configuration = DittoConfiguration.class)
public interface ThingsService {
	@GetMapping
	@RequestMapping("")
	public List<Object> getAllThings();

	@PostMapping
	@RequestMapping("")
	public Object create(@RequestBody DittoThing thing);
	
	@PutMapping
	@RequestMapping("{thingId}/features")
	public void update(@PathVariable(name = "thingId") String thingId, @RequestBody SensorFeature feature);
}
