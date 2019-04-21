/**
 * 
 */
package com.ms.countriesservice;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ms.countriesservice.entities.Countries;

/**
 * @author bala
 *
 */
public interface CountriesRepository extends JpaRepository<Countries, String>{

}
