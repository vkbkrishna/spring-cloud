/**
 * 
 */
package com.ms.countriesclient;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.ms.countriesclient.model.CountriesDO;

/**
 * @author bala
 *
 */
@RestController
public class CountriesClientController {

	@Autowired
	private CountriesServiceProxy countriesServiceProxy;

	@GetMapping(path = "/country", produces=MediaType.APPLICATION_JSON_VALUE)
	public CountriesDO getCountry(@RequestParam String country) {
		return countriesServiceProxy.getCountry(country);
	}
}
