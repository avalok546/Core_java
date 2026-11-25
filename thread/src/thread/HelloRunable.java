package thread;

public class HelloRunable implements Runnable {
	private String name;

	public HelloRunable(String name) {
		super();
		this.name = name;
	}

	@Override
	public void run() {
		for (int i = 1; i <5; i++) {
			System.out.println(name+i);
			try {
				Thread.sleep(2000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			

		
		}}}

