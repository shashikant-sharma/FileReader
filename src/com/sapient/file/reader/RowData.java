package com.sapient.file.reader;

import java.util.Objects;

public class RowData {
   
	private String country;
	
	private String city;
	
	private String gender;
	
	private String amount;

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getAmount() {
		return amount;
	}

	public void setAmount(String amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "[country=" + country + ", city=" + city + ", gender=" + gender + ", amount=" + amount + "]";
	}
	
	public String groupBy() {
		if(Objects.isNull(country) || country.trim().length()==0) {
			System.out.println("country==="+country);
				return city;
		}else {
			return country;
		}
	}
	
	public int getIntAmmount() {
		return Integer.parseInt(amount);
	}
	
}
