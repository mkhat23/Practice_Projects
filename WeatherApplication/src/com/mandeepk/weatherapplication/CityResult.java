package com.mandeepk.weatherapplication;

public class CityResult {
	
	private String woeid;
	private String cityName;
	private String country;
	
	public CityResult() {}
	
	public CityResult(String woeid, String cityName, String country){
		this.woeid = woeid;
		this.cityName = cityName;
		this.country = country;
	}
	
	public String getWoeid(){
		return this.woeid;
	}
	
	public String getCityName(){
		return this.cityName;
	}
	
	public String getCountry(){
		return this.country;
	}
	
	public void setWoeid(String woeid){
		this.woeid = woeid;
	}
	
	public void setCityName(String cityName){
		this.cityName = cityName;
	}
	
	public void setCountry(String country){
		this.country = country;
	}
	
	@Override
	public String toString() {
		return cityName + "," + country;
	}
}
