package String;

public class Strfrist {
	public static void main(String[] args) {
		String name = "vijay dinanath chouhan";
		System.out.println("string length"+ name.length());
		System.out.println("string 7th character"+ name.charAt(7));
		System.out.println("dina index"+ name.indexOf("dina"));
		System.out.println("string first i "+ name.indexOf('i'));
		System.out.println("string last index of i"+ name.lastIndexOf('i'));
		System.out.println("string replace by a to b"+ name.replace('a','b'));
		System.out.println("string upper case"+ name.toUpperCase());
		System.out.println("string lower case:------"+ name.toLowerCase());
		System.out.println("string start with:------"+ name.startsWith("vi"));
		System.out.println("string substring:------"+ name.substring(6));
	}

}
