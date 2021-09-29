package org.ecom.noor.service;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.List;

import org.ecom.noor.model.City;
import org.ecom.noor.repository.CityRepository;
import org.ecom.util.GetSqlConnection;

public class CityService {

private Connection con = null;
	
	public CityService() {
		con = GetSqlConnection.connectionOpen();
	}
	
	public void connectionClose() {
		GetSqlConnection.connectionClose();
	}
	
	public List<City> getAllCity(){
		
		List<City> cityList = new ArrayList<>();
		
		if(con!=null) {
			cityList = CityRepository.getAllCity(con);
		}
		
		return cityList;
	}
	
	public City findCityById(long id){
		
		City city = null;
		
		if(con!=null) {
			city = CityRepository.findCityById(con, id);
		}
		
		return city;
	}
	
	public int deleteCityById(long cityId) {
		return CityRepository.deleteCityById(con, cityId);
	}
	
	public void createCity(City city) {
		CityRepository.createCity(con, city);
	}
	
	public void updateCity(City city) {
		CityRepository.updateCity(con, city);
	}

	public List<City> getCityByName(String name) {
		return CityRepository.getCityByName(con, name);
	}
}
