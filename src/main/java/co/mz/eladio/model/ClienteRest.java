package co.mz.eladio.model;

import java.io.Serializable;
import java.util.TimeZone;

public class ClienteRest implements Serializable{

	private static final long serialVersionUID = 1L;
	
	
	private String name;
	private String capital;
	private String region;
	private String subregion;
	private Integer population;
	private double area;
	private TimeZone timezones;
	private String nativeName;
	private String flag;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getCapital() {
		return capital;
	}
	public void setCapital(String capital) {
		this.capital = capital;
	}
	public String getRegion() {
		return region;
	}
	public void setRegion(String region) {
		this.region = region;
	}
	public String getSubregion() {
		return subregion;
	}
	public void setSubregion(String subregion) {
		this.subregion = subregion;
	}
	public Integer getPopulation() {
		return population;
	}
	public void setPopulation(Integer population) {
		this.population = population;
	}
	public double getArea() {
		return area;
	}
	public void setArea(double area) {
		this.area = area;
	}
	public TimeZone getTimezones() {
		return timezones;
	}
	public void setTimezones(TimeZone timezones) {
		this.timezones = timezones;
	}
	public String getNativeName() {
		return nativeName;
	}
	public void setNativeName(String nativeName) {
		this.nativeName = nativeName;
	}
	public String getFlag() {
		return flag;
	}
	public void setFlag(String flag) {
		this.flag = flag;
	}

	
	

	
}
