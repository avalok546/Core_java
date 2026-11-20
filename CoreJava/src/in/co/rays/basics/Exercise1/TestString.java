package in.co.rays.basics.Exercise1;

public class TestString {
	public static void main(String[] args) {
		String n = "vijay dinanath choiuhan";
//		System.out.println("String length:"+n.length());
//		System.out.println("7th charecter:"+n.charAt(7));
//		System.out.println("index of vijay:"+ n.indexOf("dinanath"));
//		System.out.println("position of i "+ n.indexOf("i"));
//		System.out.println("a is replace by b "+ n.replace("a","b"));
//		System.out.println("lower name "+ n.toLowerCase());
//		System.out.println("lower name "+ n.toUpperCase());
//		System.out.println("start with vijay"+ n.startsWith("vijay"));
//		System.out.println("Dad's name"+ n.substring(6));
		
		int count = 0;
		for ( char c : n.toLowerCase().toCharArray()) {
			if ( c=='a'||c=='e'||c=='i'||c=='o'||c=='u' ) {
				count ++;
			}
			
		}
		System.out.println(  "vowels at index"+count);
	
	}

}
