package org.cgi.list;


import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
//import java.util.Iterator;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class ListOfCar {

	//ArrayList Example
	public List<Car> getCarList(){	
		List<Car> carList = new ArrayList<Car>();
		carList.add(new Car(1,"2011","Zaguar","yellow"));
		carList.add(new Car(2,"2012","Ford","Red"));
		carList.add(new Car(3,"2013","Mahindra","Green"));
		carList.add(new Car(4,"2014","HM","Pink"));
		return carList;
	}
	//HashSet Example
	public Set<String> getCarSet(){
		Set<String> carSet = new HashSet<String>();
		carSet.add("yellow");
		carSet.add("yellow");
		carSet.add("Green");
		carSet.add("Pink");
		return carSet;
	}	
	
	//LinkedHashSet Example
	public Set<String> getCarLinkedHashSet(){
		Set<String> carSet = new LinkedHashSet<String>();
		carSet.add("Red");
		carSet.add("yellow");
		carSet.add("Green");
		carSet.add("Pink");
		return carSet;
	}	
	
	//TreeSet Example
	public Set<String> getTreeSet(){
		Set<String> carSet = new TreeSet<String>();
		carSet.add("Red");
		carSet.add("yellow");
		carSet.add("Green");
		carSet.add("Pink");
		return carSet;
	}
	
	public void display(String choice)
	{ if(choice.equals("brand")){
		for(Car cars:getCarList())
		{
			String CarsBrand=cars.getBrand();
			System.out.println(CarsBrand);
		}
	}
	else if (choice.equals("color")) {
		for(Car cars:getCarList())
		{
			String CarsColor=cars.getColor();
			System.out.println(CarsColor);
		}
	}else if (choice.equals("set")) {
		for(String carColor:getCarSet())
		{
			System.out.println(carColor);
		}
	}
	else if (choice.equals("linkedHashSet")) {
		for(String carColor:getCarLinkedHashSet())
		{
			System.out.println(carColor);
		}
	}
	else if (choice.equals("treeSet")) {
		for(String carColor:getTreeSet())
		{
			System.out.println(carColor);
		}
	}
	/*Iterator<Car> itr = getCarList().iterator();
	while(itr.hasNext())
	{ System.out.println(itr.next()); 
	}*/
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ListOfCar ca = new ListOfCar();
		//ca.display("color");
		//ca.display("brand");
		//ca.display("linkedHashSet");
		ca.display("treeSet");

		//ca.display();
	}

}
