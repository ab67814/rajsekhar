package ritesh.org;

public class Immutable {

    public static String concatWithString()
    {
        String t = "Cat";
        for (int i=0; i<10000; i++)
        {
            t = t + "Dog";
        }
        return t;
    }
    public static String concatWithStringBuffer()
    {
        StringBuffer sb = new StringBuffer("Cat");
        for (int i=0; i<10000; i++)
        {
            sb.append("Dog");
        }
        return sb.toString();
    }
    public static void main(String[] args)
    {
        long start = System.currentTimeMillis();
        concatWithString();
        System.out.println("Concat with String took: " + (System.currentTimeMillis() - start) + "ms");
        start = System.currentTimeMillis();
        concatWithStringBuffer();
        System.out.println("Concat with StringBuffer took: " + (System.currentTimeMillis() - start) + "ms");
        String s="Sachin";  
        s.concat("Tendulkar");//concat() method appends the string at the end  
        System.out.println(s);
        System.out.println(s.concat(" Tendulkar"));
        s=s.concat(" Tendulkar");//this will create new string object in string constant pool so s will now refer to other reference 
        System.out.println(s.concat(" Tendulkar"));//will print Sachin because strings are immutable objects 
        System.out.println(s);
         
    }
}