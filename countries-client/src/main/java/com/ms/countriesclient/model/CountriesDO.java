/**
 * 
 */
package com.ms.countriesclient.model;

import javax.validation.constraints.NotNull;

/**
 * @author bala
 *
 */
public class CountriesDO {

	private String country;

	@NotNull
	private String name;

	@NotNull
	private String currency;

	@NotNull
	private String currencysimbol;

	@NotNull
	private String language;

	@NotNull
	private String capital;

	private int port;
	
	public CountriesDO() {
		
	}

	public String getCountry() {
		return country;
	}

	public String getName() {
		return name;
	}

	public String getCurrency() {
		return currency;
	}

	public String getCurrencysimbol() {
		return currencysimbol;
	}

	public String getLanguage() {
		return language;
	}

	public String getCapital() {
		return capital;
	}

	public int getPort() {
		return port;
	}
	
	
	
}
