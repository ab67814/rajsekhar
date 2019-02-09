package rajsekhar.org;
public class SmartPhone extends MobileDevice {
  private int megapixels;
  
  SmartPhone(int megapixels)
  {
	  this.megapixels=megapixels;
	}
  
  SmartPhone(String brand, String model, int price,int megapixels)
    {
		super(brand, model, price);
	    this.megapixels=megapixels;	
	}
  public int getMegapixels() {
	return megapixels;
  }
  public void setMegapixels(int megapixels) {
	this.megapixels = megapixels;
  }
@Override
  void display() 
   {
	System.out.println(getBrand());
	System.out.println(getModel());
	System.out.println(getPrice());
	System.out.println(getMegapixels());
	
   }
	
}
