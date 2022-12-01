/**
 * 
 */
package com.iiitb.dt.smartfactory.controllers;

import java.util.List;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.iiitb.dt.smartfactory.client.ThingsService;
import com.iiitb.dt.smartfactory.model.DittoThing;
import com.iiitb.dt.smartfactory.model.SensorFeature;

/**
 * @author Ravi Shankar
 *
 */
@RestController
@RequestMapping("things")
public class ThingController {

	private ThingsService thingsService;

	public ThingController(ThingsService thingsService) {
		this.thingsService = thingsService;
	}

	@GetMapping
	@RequestMapping("list")
	public List<Object> getAllThings() {
		return thingsService.getAllThings();
	}

	@PostMapping
	@RequestMapping("create")
	public Object createThing(@RequestBody DittoThing thing) {
		return thingsService.create(thing);
	}
	
	@PutMapping
	@RequestMapping("update/{thingId}")
	public void updateFeatures(@PathVariable("thingId") String thingId, @RequestBody SensorFeature feature) {
		thingsService.update(thingId, feature);
	}
}
