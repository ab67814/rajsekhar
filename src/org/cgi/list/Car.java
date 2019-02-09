package org.cgi.list;

public class Car {
	
	private int id;
	private String year;
	private String brand;
	private String color;
	
	public Car(int id,  String year,  String brand,  String  color) {
		// TODO Auto-generated constructor stub
		this.id=id;
		this.year = year;
		this.brand=brand;
		this.color=color;
	}
	
	public Car(){
		
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getYear() {
		return year;
	}
	public void setYear(String year) {
		this.year = year;
	}
	public String getBrand() {
		return brand;
	}
	public void setBrand(String brand) {
		this.brand = brand;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	

}

