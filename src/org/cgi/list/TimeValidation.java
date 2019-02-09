package org.cgi.list;



public class TimeValidation {

	static int counter=0;
	//static boolean b=true;
	public static void main(String[] args) {
		String time="30-12-2015 13:09  AM";
		//StringBuffer date=new StringBuffer();
		if(time.contains("PM")||time.contains("AM")){
		try {
			String day=time.substring(0, 2);
			if(Integer.parseInt(day)<32){
				counter++;
				System.out.println(Integer.parseInt(day));
			}
			else{
				System.out.println(Integer.parseInt("Give right day"));
			}
			String month=time.substring(3, 5);
			if(Integer.parseInt(month)<13){
				counter++;
			}
			else{
				System.out.println(Integer.parseInt("Give right month"));
			}
			String year=time.substring(6,10);
			if((Integer.parseInt(year))>0){
				counter++;
			}
			else{
				System.out.println(Integer.parseInt("Give right year"));
			}
			String hr=time.substring(11,13);
			if((Integer.parseInt(hr))<13){
				counter++;
			}
			else{
				System.out.println(Integer.parseInt("Give right hour"));
			}
			String min=time.substring(14,16);
			if((Integer.parseInt(min))<60){
				counter++;
			}
			else{
				System.out.println(Integer.parseInt("Give right min"));
			}
		} catch (NumberFormatException e) {
			// TODO Auto-generated catch block
			//e.printStackTrace();
			System.out.println(e);
			System.out.println("not correct format");
		}
		
		if(counter==5)
			System.out.println("time format is correct");
		else
			System.out.println("not correct format!! give correct one");
		
		}
		else{
			System.out.println("not valid format!! Please give A.M or P.M");
		}

	}

}
