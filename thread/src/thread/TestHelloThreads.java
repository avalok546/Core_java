package thread;

public class TestHelloThreads {
	public static void main(String[] args) {
		
		HelloThread t1 = new HelloThread("ram");
		HelloThread t2 = new HelloThread("shyam");
		
		t1.start();
		t2.start();
		
	}

}
