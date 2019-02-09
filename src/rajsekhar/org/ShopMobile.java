package rajsekhar.org;
import java.util.Scanner;




public class ShopMobile {

	public static void main(String[] args)
	 {
	   MobileShopee m=new MobileShopee();
	   m.loadData();
       Scanner scn=new Scanner(System.in);
       System.out.println("enter start range:");
       
       int srange=scn.nextInt();
       System.out.println("enter end range");
       System.out.println("\t");
       int erange=scn.nextInt();
       m.displayByPrice(srange,erange);
       System.out.println("enter brand name");
       System.out.println("\t");
       String bname=scn.next();
       m.displayByBrand(bname);
       scn.close();
	 }

}
