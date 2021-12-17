package com.cognizant.ormlearn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.service.CountryService;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
@SpringBootApplication
public class OrmLearnApplication {
	private static final Logger LOGGER = LoggerFactory.getLogger(OrmLearnApplication.class);
	private static CountryService countryService;
	public static void main(String[] args) throws CountryNotFoundException {
		ApplicationContext context=SpringApplication.run(OrmLearnApplication.class, args);
		countryService=context.getBean(CountryService.class);
		testGetAllCountries();
		testDeleteCountry();
		TestAddCountry();
		testUpdateCountry();
		testFindCountryByCode();
		LOGGER.info("Inside main");
		
	}
	private static void testGetAllCountries() {

		LOGGER.info("Start");

		List<Country> countries =countryService.getAllCountries();

		LOGGER.debug("countries={}", countries);

		LOGGER.info("End");

		}
	
	public static void TestAddCountry(){
		Country country=new Country();
		LOGGER.info("Start");
		country.setName("Coimbatore");
		country.setCode("cbe");
		countryService.addCountry(country);
		country.setName("Chennai");
		country.setCode("che");
		countryService.addCountry(country);
		LOGGER.info("End");
		
	}
	public static void testDeleteCountry() throws CountryNotFoundException{
		LOGGER.info("Start");
		countryService.updateCountry("cbe","Kovai");
		LOGGER.info("End");
	}
	public static void testUpdateCountry() throws CountryNotFoundException{
		LOGGER.info("Start");
		countryService.deleteCountry("NR");
		LOGGER.info("End");
		
	}
	public static void testFindCountryByCode() throws CountryNotFoundException {
		LOGGER.info("Start");
		Country country=null;
		country=countryService.findCountryByCode("US");
		LOGGER.debug("country{}",country);
		LOGGER.info("End");
	}

}
