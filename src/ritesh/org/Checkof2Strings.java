package ritesh.org;

public class Checkof2Strings {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		String first="sitram";
		StringBuffer second=new StringBuffer("rasmit");
		//int counter=0;
		try {
			if(first.length()==second.length()){
			for(int i=0;i<first.length();i++){
				for(int j=0;j<second.length();j++){
					
					//System.out.println(first.charAt(i));
				    //System.out.println(second.charAt(j));
					if(second.charAt(j)==first.charAt(i)){
						System.out.println(second);
						//second.setCharAt(j,' ');
						second.deleteCharAt(j);
						//counter++;
						break;
						}
					}
				//System.out.println(second+" char");
			}
		}
			else{
				System.out.println("not matched");
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//System.out.println(second.length());
		
		if(second.length()==0){
			System.out.println("matched");
		}
	}

}
