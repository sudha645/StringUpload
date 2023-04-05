package String;//String is immutable if we try to modify the value of the object it will create an other object

public class stringBuffer {

	public static void main(String[] args) {
	//String Literal	// TODO Auto-generated method stub
//String s="Sudha";
//String s1="Sudha";
//String s2="Sudha";
//System.out.println(s +"  "+s1+"  "+" "+s2);
//s2="Rani";
// String s4=s2.concat("Rani");
// System.out.println(""+s1+"   "+s2);
//String Object
 
 //String s5=new  String("Tirumalasetti ");
// System.out.println(" "+s5+" "+s+" "+s2);
	

	StringBuffer sb=new StringBuffer("This is String Buffer");
	System.out.println(sb);
	sb.append(" in Java");
	System.out.println(sb.charAt(25));

	System.out.println("sb  = "+sb);
	String s="sudha";
	s.concat("Tirumalsetti");
	System.out.println(s);
	
	StringBuilder sbu=new StringBuilder("This is String Builder");
	sbu.append(" in Java");

	System.out.println(sbu);
}
}
