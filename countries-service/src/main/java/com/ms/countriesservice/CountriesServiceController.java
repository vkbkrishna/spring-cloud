/**
 * 
 */
package com.ms.countriesservice;

import java.util.HashMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.ms.countriesservice.entities.Countries;

/**
 * @author bala
 *
 */
@RestController
public class CountriesServiceController {

HashMap<Integer, Integer> timePort=new HashMap<>();
	
	@Autowired
	private CountriesRepository countriesRepository;
	
	@Autowired
	private Environment environment;
	
	@GetMapping("/{country}")
	public Countries getCountry(@PathVariable String country) {
		Countries  countryBean = countriesRepository.findById(country).orElseThrow(() -> new RuntimeException("Country: "+country+" not found"));
		int port= Integer.parseInt(environment.getProperty("local.server.port")) ;
		countryBean.setPort(port);
		int time=timePort.getOrDefault(port, 0);
		if (time>=0)
		{
			try {
				Thread.sleep(time);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		return countryBean;		
	}		
	@GetMapping("/time/{time}")
	public int getTime(@PathVariable int time) {
		int port=Integer.parseInt(environment.getProperty("local.server.port")) ;
		timePort.put(port, time);
		return time;
	}		
}
