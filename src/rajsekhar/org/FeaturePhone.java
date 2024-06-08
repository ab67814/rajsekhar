package rajsekhar.org;
public class FeaturePhone extends MobileDevice {
    
	
	FeaturePhone(String brand, String model, int price) 
	 {
		super(brand, model, price);
	 }

	@Override
	void display()
	 {
		System.out.println(getBrand());
		System.out.println(getModel());
		System.out.println(getPrice());
		
	 }

}
