package com.cognizant.ormlearn.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cognizant.ormlearn.exception.CountryNotFoundException;
import com.cognizant.ormlearn.model.Country;
import com.cognizant.ormlearn.respository.CountryRepository;

@Service
public class CountryService {
	
	@Autowired
	private CountryRepository countryRepository;
	
	@Transactional
	public List<Country> getAllCountries(){
		return countryRepository.findAll();
	}
	@Transactional
	public void addCountry(Country country) {
		countryRepository.save(country);
	}
	@Transactional
	public void updateCountry(String countryCode, String name) throws CountryNotFoundException{
		Optional<Country> result=countryRepository.findById(countryCode);
		if(result.isPresent()) {
			Country country=result.get();
			country.setName(name);
			countryRepository.save(country);
		}
		else {
			throw new CountryNotFoundException("Could not Found country code");
		}
		
	}
	@Transactional
	public void deleteCountry(String countryCode)throws CountryNotFoundException {
		countryRepository.deleteById(countryCode);
		
	}
	@Transactional
	public Country findCountryByCode(String countryCode )throws CountryNotFoundException {
		Optional<Country> result=countryRepository.findById(countryCode);
		if(result.isPresent()) {
			Country country=result.get();
			return country;
		}
		else {
			throw new CountryNotFoundException("Could not Found country code");
		}
		
	}
	@Transactional
	public List<Country> findByNameContainingOrderByNameAsc(String name){
		return countryRepository.findByNameContainingOrderByNameAsc(name);
	}
}
