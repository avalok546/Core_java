package in.co.rays.array;

public class Findmissing {
	public static void main(String[] args) {
		int[] num = {23,34,32,75,12,67,34,56}; 
		int[] num2 = {23,34,32,75,43,12,67,34,56};
		for(int i=0; i<num2.length; i++) {
			boolean found = false;
			for(int j=0; j<num.length; j++) {
				if(num2[i]==num[j]) {
					found = true;
					break;
				}
			}
			if(!found) {
				System.out.println("Missing number is: "+num2[i]);
			}
		}
		
	}

}
