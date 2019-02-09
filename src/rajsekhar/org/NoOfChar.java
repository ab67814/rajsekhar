package rajsekhar.org;

public class NoOfChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			
		int counter=0;
		String s1="dope";
		String s2="dude";
		String s=s1.concat(s2);
		
		for(int i=0;i<s.length();i++){
			for(int j=0;j<s.length();j++){
				if(s.charAt(i)==s.charAt(j)){
					counter++;
					System.out.println(counter);
				}
			}
			System.out.println("break");
		}
		
		// to test HashMap object
		
		/*HashMap<SmartPhone, String> hm = new HashMap<SmartPhone, String>();
		SmartPhone sm1 = new SmartPhone(10);
		SmartPhone sm2 = new SmartPhone(20);
		
		hm.put(sm1, "ram");
		hm.put(sm2,"shyam");
		sm1.setMegapixels(11);
		sm2.setMegapixels(21);
		for(Map.Entry<SmartPhone, String> mh : hm.entrySet()) {
			System.out.println(mh.getKey().getMegapixels());
		}
*/		
	}

}

