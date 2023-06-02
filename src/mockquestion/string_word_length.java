package mockquestion;

public class string_word_length 
{
 public static void main(String[]args)
 {
	 String s2="DHEERAJ";
	 String s5="RAJPUT";
	 String s6="dheeraj";
	 
	 System.out.println(s2.length());                         //1
	 System.out.println(s2.replace("DH", "N"));               //2 
	 System.out.println(s2.replaceAll("DHEERAJ", "PRAGATI")); //3
	 System.out.println(s2.isEmpty());                        //4
	 System.out.println(s2.contains("EE"));                   //5
	 System.out.println(s2.indexOf("J"));                     //6
	 System.out.println(s2.lastIndexOf("E"));                 //7
	 System.out.println(s2.isBlank());                        //8
	 System.out.println(s2.toLowerCase());                    //9
	 System.out.println(s2.concat(" "+s5));                  //10
	 System.out.println(s2.endsWith("RAJ"));                 //11 
	 System.out.println(s2.substring(1));                    //12
	 System.out.println(s2.substring(1, 6));                 //13
	 System.out.println(s2.equals(s6));                      //14
	 System.out.println(s2.equalsIgnoreCase(s6));            //15
	 System.out.println("------------");
	 String ar[]=s5.split("");                               //16
	 
	 for(int i=0;i<=ar.length-1;i++)
	 {
		 System.out.println(ar[i]);
	 }
	 
	 
	 
 }
}
