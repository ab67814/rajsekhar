package rajsekhar.org;
public class MobileShopee {
	static FeaturePhone fList[]=new FeaturePhone[5];
	static SmartPhone sList[]=new SmartPhone[5];
	
	void loadData()
	{
	  fList[0]=new FeaturePhone("Apple","5s",50000);
	  fList[1]=new FeaturePhone("Samsung","s3",30000);
	  fList[2]=new FeaturePhone("NokiaLumia","523s",20000);
	  fList[3]=new FeaturePhone("Moto","g",10000);
	  fList[4]=new FeaturePhone("Sony","xperia",15000);
	  
	  sList[0]=new SmartPhone("Apple","5s",50000,9);
	  sList[1]=new SmartPhone("Samsung","s3",30000,7);
	  sList[2]=new SmartPhone("NokiaLumia","523s",20000,5);
	  sList[3]=new SmartPhone("Moto","g",10000,6);
	  sList[4]=new SmartPhone("Sony","xperia",15000,10);
	}
	
   void displayByPrice(int startRange,int endRange)
   {
	if(startRange==fList[3].getPrice()&&endRange==fList[0].getPrice())
	{
		System.out.println("FeaturePhone  details");
		System.out.println(fList[0].getBrand()+","+fList[0].getModel()+","+fList[0].getPrice());
		System.out.println(fList[1].getBrand()+","+fList[1].getModel()+","+fList[1].getPrice());
		System.out.println(fList[2].getBrand()+","+fList[2].getModel()+","+fList[2].getPrice());
		System.out.println(fList[3].getBrand()+","+fList[3].getModel()+","+fList[3].getPrice());
		System.out.println(fList[4].getBrand()+","+fList[4].getModel()+","+fList[4].getPrice());
		
		System.out.println("SmartPhone details");
		System.out.println(sList[0].getBrand()+","+sList[0].getModel()+","+sList[0].getPrice()+","+sList[0].getMegapixels());
		System.out.println(sList[1].getBrand()+","+sList[1].getModel()+","+sList[1].getPrice()+","+sList[1].getMegapixels());
		System.out.println(sList[2].getBrand()+","+sList[2].getModel()+","+sList[2].getPrice()+","+sList[2].getMegapixels());
		System.out.println(sList[3].getBrand()+","+sList[3].getModel()+","+sList[3].getPrice()+","+sList[3].getMegapixels());
		System.out.println(sList[4].getBrand()+","+sList[4].getModel()+","+sList[4].getPrice()+","+sList[4].getMegapixels());
	
	}
	else if(startRange==fList[3].getPrice()&&endRange==fList[1].getPrice())
	{
		System.out.println("FeaturePhone details");
		System.out.println(fList[1].getBrand()+","+fList[1].getModel()+","+fList[1].getPrice());
		System.out.println(fList[2].getBrand()+","+fList[2].getModel()+","+fList[2].getPrice());
		System.out.println(fList[3].getBrand()+","+fList[3].getModel()+","+fList[3].getPrice());
		System.out.println(fList[4].getBrand()+","+fList[4].getModel()+","+fList[4].getPrice());
		
		System.out.println("SmartPhone details");
		System.out.println(sList[1].getBrand()+","+sList[1].getModel()+","+sList[1].getPrice()+","+sList[1].getMegapixels());
		System.out.println(sList[2].getBrand()+","+sList[2].getModel()+","+sList[2].getPrice()+","+sList[2].getMegapixels());
		System.out.println(sList[3].getBrand()+","+sList[3].getModel()+","+sList[3].getPrice()+","+sList[3].getMegapixels());
		System.out.println(sList[4].getBrand()+","+sList[4].getModel()+","+sList[4].getPrice()+","+sList[4].getMegapixels());
	
		
	}
	else if(startRange==fList[3].getPrice()&&endRange==fList[2].getPrice())
	{
	  System.out.println("Feature details");	
	  System.out.println(fList[2].getBrand()+","+fList[2].getModel()+","+fList[2].getPrice());
	  System.out.println(fList[3].getBrand()+","+fList[3].getModel()+","+fList[3].getPrice());
	  System.out.println(fList[4].getBrand()+","+fList[4].getModel()+","+fList[4].getPrice());
		
	  System.out.println("SmartPhone details");
	  System.out.println(sList[2].getBrand()+","+sList[2].getModel()+","+sList[2].getPrice()+","+sList[2].getMegapixels());
	  System.out.println(sList[3].getBrand()+","+sList[3].getModel()+","+sList[3].getPrice()+","+sList[3].getMegapixels());
	  System.out.println(sList[4].getBrand()+","+sList[4].getModel()+","+sList[4].getPrice()+","+sList[4].getMegapixels());
	}
	else if(startRange==fList[3].getPrice()&&endRange==fList[4].getPrice())
	{
		
	}
	else if(startRange==fList[4].getPrice()&&endRange==fList[0].getPrice())
	{
		
	}
	else if(startRange==fList[4].getPrice()&&endRange==fList[1].getPrice())
	{
		
	}
	else if(startRange==fList[4].getPrice()&&endRange==fList[2].getPrice())
	{
		
	}
	else if(startRange==fList[2].getPrice()&&endRange==fList[0].getPrice())
	{
		
	}
	else if(startRange==fList[2].getPrice()&&endRange==fList[1].getPrice())
	{
		
	}
	else if(startRange==fList[3].getPrice()&&endRange==fList[0].getPrice())
	{
		
	}
	else if(startRange==fList[1].getPrice()&&endRange==fList[0].getPrice())
	{
		
	}
   }
   
   void displayByBrand(String brandName)
   {
	 //FeaturePhone configurations 
	 if(brandName.equals(fList[0].getBrand()))
	 {
	   System.out.println(fList[0].getModel());
	   System.out.println(fList[0].getPrice());
	   
	 }
	 else if(brandName==fList[1].getBrand())
	 {
	   System.out.println(fList[1].getModel());
	   System.out.println(fList[1].getPrice()); 
	 }
	 else if(brandName==fList[2].getBrand())
	 {
	   System.out.println(fList[2].getModel());
	   System.out.println(fList[2].getPrice()); 
	 }
	 else if(brandName==fList[3].getBrand())
	 {
	   System.out.println(fList[3].getModel());
	   System.out.println(fList[3].getPrice()); 
	 }
	 else if(brandName==fList[4].getBrand())
	 {
	   System.out.println(fList[4].getModel());
	   System.out.println(fList[4].getPrice()); 
	 }
	 else
	 {
		 System.out.println("not enough mobiles");
	 }
	 
	 //SmartPhone configurations
	 
	 if(brandName==sList[0].getBrand())
	 {
	   System.out.println(sList[0].getModel());
	   System.out.println(sList[0].getPrice());
	   System.out.println(sList[0].getMegapixels());
	   
	 }
	 else if(brandName==sList[1].getBrand())
	 {
	   System.out.println(sList[1].getModel());
	   System.out.println(sList[1].getPrice());
	   System.out.println(sList[1].getMegapixels());
	 }
	 else if(brandName==sList[2].getBrand())
	 {
	   System.out.println(sList[2].getModel());
	   System.out.println(sList[2].getPrice());
	   System.out.println(sList[2].getMegapixels());
	 }
	 else if(brandName==sList[3].getBrand())
	 {
	   System.out.println(sList[3].getModel());
	   System.out.println(sList[3].getPrice());
	   System.out.println(sList[3].getMegapixels());
	 }
	 else if(brandName==sList[4].getBrand())
	 {
	   System.out.println(sList[4].getModel());
	   System.out.println(sList[4].getPrice());
	   System.out.println(sList[4].getMegapixels());
	 }
	 else
	 {
		 System.out.println("not enough mobiles");
	 }
	 
	 
   }
}
