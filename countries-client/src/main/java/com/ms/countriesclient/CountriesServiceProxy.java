/**
 * 
 */
package com.ms.countriesclient;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ms.countriesclient.model.CountriesDO;

/**
 * @author bala
 *
 */
@FeignClient("COUNTRIES-SERVICE")
public interface CountriesServiceProxy {

	@GetMapping(path="/{country}", produces=MediaType.APPLICATION_JSON_VALUE )
	public CountriesDO getCountry(@PathVariable(value="country") String country);
}
