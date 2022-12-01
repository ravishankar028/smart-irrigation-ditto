/**
 * 
 */
package com.iiitb.dt.smartfactory.configuration;

import org.springframework.context.annotation.Bean;

import feign.auth.BasicAuthRequestInterceptor;

/**
 * @author Ravi Shankar
 *
 */
public class DittoConfiguration {
	@Bean
	public BasicAuthRequestInterceptor basicAuthRequestInterceptor() {
		return new BasicAuthRequestInterceptor("ditto", "ditto");
	}
}
